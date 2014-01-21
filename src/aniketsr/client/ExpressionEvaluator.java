package aniketsr.client;

import aniketsr.evaluator.EvaluatorOperations;

public class ExpressionEvaluator {
    EvaluatorOperations evaluate;

    public ExpressionEvaluator(String expression) {
        this.evaluate = new EvaluatorOperations(expression);
    }

    public EvaluatorOperations getEvaluation() {
        return evaluate;
    }

    public static void main(String[] args) {
        try {
            ExpressionEvaluator cli = new ExpressionEvaluator(args[0]);
            EvaluatorOperations evaluate = cli.getEvaluation();
            System.out.println(evaluate.showExpression());
        } catch (Exception e) {
            System.out.println("something went wrong " + e);
        }
    }
}
