package com.softwareseni.pages;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonPage {
    public Response send(String method, String endpoint, Map<String,String> queryParams) {
        if(method.equals("GET")) {
            return given()
                    .queryParams(queryParams)
                    .when()
                    .get(endpoint);
        } else {
            return given()
                    .queryParams(queryParams)
                    .when()
                    .post(endpoint);
        }
    }
}
