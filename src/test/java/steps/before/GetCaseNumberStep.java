package steps.before;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class GetCaseNumberStep {

    public void generateNewCaseNumberSelfContained() {
        // Declare request and response objects
        Response response;
        RequestSpecification requestSpec;

        // Declare variables
        String caseId = "RR1";
        String baseUrl = "http://voaintegration.cloudapp.net:48081";

        // Basic example of mocking
        boolean mock = true;
        if (mock) {baseUrl = "http://localhost:9999";}

        String resource = "/api/rose/GetCaseNo";
        String endPoint = baseUrl + resource;

        // Build Request
        requestSpec = new RequestSpecBuilder().setBaseUri(endPoint).build().queryParams("CaseID", caseId);

        // Execute
        response = RestAssured.given().spec(requestSpec).get();

        // Assert that the response was successful, i.e. expected 200
        // Remember that the response code is specific to the test object,
        //  i.e. if you want to validate that an unauthenticated user shouldn't have access to a secured endpoint
        //  the expected success status code would be 401
        response.then().statusCode(200);

        // Assert that the Result contains the caseId in the newly generated case number
        // This is using a Hamcrest matcher. There are tens if not hundreds of these to cater for different types
        // of comparisons.
        response.then().body("Result", containsString(caseId));

    }

}
