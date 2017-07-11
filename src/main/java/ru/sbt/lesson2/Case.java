package ru.sbt.lesson2;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by MaxK on 10.07.2017.
 */
public class Case {
    public void init(String body){
        Response response = given()
                .body(body)
                .post("http://localhost:8888/calc")
                ;
        response.then().log().all();
     }
}
