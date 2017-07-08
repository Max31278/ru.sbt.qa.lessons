package lesson1;

import org.junit.Assert;
import org.junit.Test;
import ru.sbt.lesson1.Formula;

/**
 * Created by MaxK on 09.07.2017.
 */
public class TestFormula {
    Formula formula;

    @Test
    public void testCheckCurrency(){
        formula = new Formula("1 + 2 + ( 2 + 3 * ( 6 - 2 / ( 4 - 2) ) ) ");

        Assert.assertEquals(true, formula.CheckCurrency());
    }

    @Test
    public void testCreateStack(){
        formula = new Formula("2 + 2 ");
        Assert.assertEquals("[2, 2, +]",formula.CreateStack().toString());
    }

    @Test
    public void testEstimate(){

        formula = new Formula("2 + 2 ");
        Assert.assertEquals("4", formula.Estimate());
    }
}
