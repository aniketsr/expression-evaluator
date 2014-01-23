package aniketsr.evaluator;

public class EvaluatorOperations {
    String expression;
    public String showExpression(){
        return expression;
    }

    public EvaluatorOperations(String expression){
        this.expression = expression;
    }

        public int evaluateSingleExpression(String expression){
        int number1, number2;
        int result;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                number1 = Integer.parseInt(expression.substring(0, i));
                number2 = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = number1 + number2;
                return result;
            }
        }
        return Integer.parseInt(expression);
    }

    public int evaluate() {
        String singleExpression;
        String newExpression = expression;
        int result;
        int count = 0;

        for (int i = 0; i < newExpression.length(); i++) {
            char character = newExpression.charAt(i);
            if (character == '+') {
                count++;
                if (count == 2) {
                    singleExpression = newExpression.substring(0, i);
                    result = evaluateSingleExpression(singleExpression);
                    newExpression = result+newExpression.substring(i, newExpression.length());
                    i = 0;
                    count = 0;
                }
            }
        }
        return evaluateSingleExpression(newExpression);
    }
}