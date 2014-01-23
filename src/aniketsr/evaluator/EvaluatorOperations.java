package aniketsr.evaluator;

public class EvaluatorOperations {
    public String showExpression(String expression) {
        return expression;
    }

    public int evaluateSingleExpression(String expression) {
        int number1 = 0, number2 = 0;
        char operator = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                operator = expression.charAt(i);
                number1 = Integer.parseInt(expression.substring(0, i));
                number2 = Integer.parseInt(expression.substring(i + 1, expression.length()));
            }
        }
        if (operator == '+') return number1 + number2;
        if (operator == '-') return number1 - number2;
        if (operator == '*') return number1 * number2;
        if (operator == '/') return number1 / number2;

        return Integer.parseInt(expression);
    }


    public String handlePrecedenceForBrackets(String expression) {
        int startIndex = 0, endIndex = 0, result;
        String bracketExpression, mergedExpression;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') startIndex = i;
            if (expression.charAt(i) == ')') endIndex = i;
        }

        bracketExpression = expression.substring(startIndex + 1, endIndex);
        String replaceBracketExpression = "(" + bracketExpression + ")";
        result = evaluate(bracketExpression);
        mergedExpression = expression.replace(replaceBracketExpression, result + "");

        return mergedExpression;
    }


    public int evaluate(String expression) {
        String singleExpression;
        String newExpression = expression;
        int result;
        int count = 0;

        if (newExpression.contains("(")) {
            newExpression = handlePrecedenceForBrackets(newExpression);
            return evaluate(newExpression);
        }

        for (int i = 0; i < newExpression.length(); i++) {
            char character = newExpression.charAt(i);
            if (character == '+' || character == '-' || character == '*' || character == '/') {
                count++;
                if (count == 2) {
                    singleExpression = newExpression.substring(0, i);
                    result = evaluateSingleExpression(singleExpression);
                    newExpression = result + newExpression.substring(i, newExpression.length());
                    i = 0;
                    count = 0;
                }
            }
        }
        return evaluateSingleExpression(newExpression);
    }
}