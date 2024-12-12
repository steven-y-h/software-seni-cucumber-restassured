package com.softwareseni.steps;

import com.softwareseni.pages.CommonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonStep {
    private Response response;

    CommonPage commonpage = new CommonPage();

    @When("send {string} request to {string} with queryParams")
    public void currentWeatherGetCurrentWeatherSendRequestToWithQueryParams(String method, String endpoint, Map<String,String> queryParams) {
        response = commonpage.send(method, endpoint, queryParams);
    }

    @Then("the response code should be {int}")
    public void theResponseCodeShouldBe(int code) {
        response.prettyPrint();
        response.then().statusCode(code);
    }

    @And("the response should match the expected JSON schema")
    public void theResponseShouldMatchTheExpectedJSONSchema(Map<String,String> path) {
        assertThat("Json schema is not valid", response.getBody().prettyPrint(), matchesJsonSchemaInClasspath(path.get("Path")));
    }
}
