package lesson2;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.sbt.lesson2.Case;

/**
 * Created by MaxK on 11.07.2017.
 */
public class testCase {
    Case tcase;

    @BeforeMethod
    public void init(){
        tcase = new Case();
    }

    @Test
    public void testMult(){
        tcase.init("{\"operand1\": \"2\", \"operation\": \"mult\",\"operand2\": \"2\"}");
    }

    @Test
    public void testPlus(){
        tcase.init("{\"operand1\": \"8\", \"operation\": \"plus\",\"operand2\": \"2\"}");
    }

    @Test
    public void testDiv(){
        tcase.init("{\"operand1\": \"9\", \"operation\": \"div\",\"operand2\": \"3\"}");
    }

    @Test
    public void testMinus(){
        tcase.init("{\"operand1\": \"12\", \"operation\": \"minus\",\"operand2\": \"2\"}");
    }
}
