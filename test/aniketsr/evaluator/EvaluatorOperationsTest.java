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
}
