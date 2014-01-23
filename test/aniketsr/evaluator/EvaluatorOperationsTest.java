package aniketsr.evaluator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluatorOperationsTest {
    @Test
    public void testShowExpression() throws Exception {
        EvaluatorOperations evaluate = new EvaluatorOperations();

        String result = evaluate.showExpression("2+3");

        assertEquals("2+3",result);
    }

    @Test
    public void testEvaluateSingleExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluateSingleExpression("27.2+300.2");
        double expected = 327.4;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateSingleExpressionWithOneOperandAsZero() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluateSingleExpression("50+0");
        int expected = 50;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateSingleExpressionForOnlyOneOperand() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluateSingleExpression("22");
        int expected = 22;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluate() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("80.5+80+40.5");
        int expected = 201;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("25+25+75+75+15+15+15+15+25+15");
        int expected = 300;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForAllOperators() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("12*10-20");
        int expected = 100;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForAllOperatorsUsingLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("12*10-20*2-75+25");
        int expected = 150;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForSingleBracketExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("(22)");
        int expected = 22;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForSingleBracketLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("10*12+(20*4)");
        int expected = 200;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForSingleBracketComplexExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)");
        int expected = 200;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForMultipleBrackets() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)+(200)-100");
        int expected = 300;

        assertEquals(expected,result);
    }

    @Test
    public void testEvaluateForMultipleBracketsComplexOperations() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)+(200*1+300-200)-100");
        int expected = 400;

        assertEquals(expected,result);
    }
}
