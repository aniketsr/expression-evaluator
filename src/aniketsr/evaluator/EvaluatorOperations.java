package aniketsr.evaluator;

public class EvaluatorOperations {
    String expression;

    public EvaluatorOperations(String expression){
        this.expression = expression;
    }

    public String showExpression(){
        return expression;
    }

    public int evaluate(){
        int number1, number2;
        int result = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                number1 = Integer.parseInt(expression.substring(0, i));
                number2 = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = number1 + number2;
                return result;
            }
        }
        return result;
    }
}