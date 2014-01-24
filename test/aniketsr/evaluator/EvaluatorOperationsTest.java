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

    @Test(expected = java.lang.Exception.class)
    public void testSingleExpressionForOneOperandAndOneOperator() throws Exception {
        EvaluatorOperations evaluate = new EvaluatorOperations();

        evaluate.evaluateSingleExpression("22+");
    }

    @Test(expected = java.lang.Exception.class)
    public void testSingleExpressionForInvalidInput() throws Exception {
        EvaluatorOperations evaluate = new EvaluatorOperations();

        evaluate.evaluateSingleExpression("abc");
    }

    @Test
    public void testEvaluateSingleExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluateSingleExpression("27+300");
        double expected = 327;

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

        double result = add.evaluate("80+80+40");
        int expected = 200;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("25+25+75+75+15+15+15+15+25+15");
        int expected = 300;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForAllOperators() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("12*10-20");
        int expected = 100;

        assertEquals(expected,result,0.0);
    }
    @Test
    public void testEvaluateForAllOperatorsHavingNegativeResult() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("10-20");
        int expected = -10;

        assertEquals(expected,result,0.0);
    }


    @Test
    public void testEvaluateForAllOperatorsUsingLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("12*10-20*2-75+25");
        int expected = 150;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForSingleBracketExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("(22)");
        int expected = 22;

        assertEquals(expected,result,0.0);
    }

    @Test(expected = java.lang.Exception.class)
    public void testEvaluateForSingleBracketInvalidExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        add.evaluate("(22)+");
    }

    @Test
    public void testEvaluateForSingleBracketLargeExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("10*12+(20*4)");
        int expected = 200;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForSingleBracketComplexExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)");
        int expected = 200;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForMultipleBracketsSimpleExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("(2)+(5)");
        int expected = 7;

        assertEquals(expected,result,0.0);
    }

    @Test(expected = java.lang.Exception.class)
    public void testEvaluateForMultipleBracketsInvalidExpression() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        add.evaluate("(2+)+(5)");
    }

    @Test
    public void testEvaluateForMultipleBrackets() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)+(200)-100");
        int expected = 300;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForMultipleBracketsComplexOperations() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("2+8*(45-40*4)+(200*1+300-200)-100");
        int expected = 400;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForNestedBrackets() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("4+(8+(4+4)-(10))");
        int expected = 10;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForNestedBracketsLoop() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("((((((((((22))))))))))");
        int expected = 22;

        assertEquals(expected,result,0.0);
    }

    @Test
    public void testEvaluateForNestedAndMultipleBracketsLoop() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations();

        double result = add.evaluate("4+(8+(4+4)-(10))+(3+7)-5*((((4))))");
        int expected = 60;

        assertEquals(expected,result,0.0);
    }
}
