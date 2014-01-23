package aniketsr.client;

import aniketsr.evaluator.EvaluatorOperations;

public class ExpressionEvaluator {
    public static void main(String[] args) {
            EvaluatorOperations evaluate = new EvaluatorOperations();
            System.out.println(evaluate.evaluate(args[0]));
    }
}
