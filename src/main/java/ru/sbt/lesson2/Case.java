package ru.sbt.lesson2;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by MaxK on 10.07.2017.
 */
public class Case {
    public Response init(String body){
        Response response = given()
                .body(body)
                .post("http://localhost:8888/calc")
                ;
        response.then().log().all();

        return  response;
     }

     public Response json(String body){
         Response response = given()
                 .get(body)
                 ;
         response.then().log().all();

         return response;
     }
}
