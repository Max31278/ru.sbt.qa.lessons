package lesson1;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.sbt.lesson1.Calculator;

/**
 * Created by MaxK on 08.07.2017.
 */
public class TestNG {
     Calculator calc;
     double first;
     double second;
     double res;

     public TestNG(Double first, Double second, Double res){
         this.first = first;
         this.second = second;
         this.res = res;
     }
     @DataProvider
     public Object[][] parseLocalData(){
         return (new Object[][]{
                 {6.0, 2.0, 3.0},
                 {3.0, 1.0, 3.0},
                 {12.0, 3.0, 4.0}
         });
     }

    @BeforeMethod
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(calc.add(4.0, 2.0), 6.0);
    }

    @Test
    public void testSub(){
        Assert.assertEquals(calc.subtract(6.0, 2.0), 4.0);
    }

    @Test
    public  void testMul(){
        Assert.assertEquals(calc.multiply(2.0,3.0), 6.0);
    }

    @Test
    public void testDiv(){
        Assert.assertEquals(calc.divide(first, second), res);
    }



}
