package lesson2;



import com.jayway.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.sbt.lesson2.Case;

import java.util.List;

import static com.jayway.jsonpath.JsonPath.parse;


/**
 * Created by MaxK on 11.07.2017.
 */
public class testCase {
    Response response;
    Case tcase;

    @BeforeMethod
    public void init(){
        tcase = new Case();
    }

    @Test
    public void testMult(){
        response = tcase.init("{\"operand1\": \"2\", \"operation\": \"mult\",\"operand2\": \"2\"}");

    }

    @Test
    public void testPlus(){
        tcase.init("{\"operand1\": \"8\", \"operation\": \"plus\",\"operand2\": \"2\"}");
    }

    @Test
    public void testDiv(){
        response = tcase.json("http://localhost:8888/calc?operand1=2&operation=plus&operand2=2");
        String jsonpath = "$..result";
        List list = parse(response.then().extract().body().asString()).read(jsonpath);
        System.out.printf("");
    }

    @Test
    public void testMinus(){
        tcase.json("operand1=52&operation=minus&operand2=2");
    }
}
