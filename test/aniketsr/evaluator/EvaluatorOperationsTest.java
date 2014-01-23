package aniketsr.evaluator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluatorOperationsTest {
    @Test
    public void testShowExpression() throws Exception {
        EvaluatorOperations evaluate = new EvaluatorOperations("2+3");

        String result = evaluate.showExpression();

        assertEquals("2+3",result);
    }

    @Test
    public void testEvaluateSingleExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("");

        int result = add.evaluateSingleExpression("27+300");
        int expected = 327;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateSingleExpressionWithOneOperandAsZero() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("");

        int result = add.evaluateSingleExpression("50+0");
        int expected = 50;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateSingleExpressionForOnlyOneOperand() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("");

        int result = add.evaluateSingleExpression("22");
        int expected = 22;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluate() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("80+80+40");

        int result = add.evaluate();
        int expected = 200;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("25+25+75+75+15+15+15+15+25+15");

        int result = add.evaluate();
        int expected = 300;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForAllOperators() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("12*10-20");

        int result = add.evaluate();
        int expected = 100;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForAllOperatorsUsingLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("12*10-20*2-75+25");

        int result = add.evaluate();
        int expected = 150;

        assertEquals(expected,result);
    }
}
