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
    public void testEvaluate() throws Exception {
        EvaluatorOperations add = new EvaluatorOperations("27+300");

        int result = add.evaluate();
        int expected = 327;

        assertEquals(expected,result);
    }
}
