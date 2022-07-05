package examples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class simplePostClass {
    @Test
    public void addNewPet(){
        final String baseURI="https://petstore.swagger.io/v2/pet";
        String reqBody = "{\"id\": 77232,\"name\": \"Riley\",\"status\": \"alive\" }";
    Response response =
            given().contentType(ContentType.JSON) // Set headers
                    .body(reqBody).when().post(baseURI); // Send POST request

    // Print response of POST request
    String body = response.getBody().asPrettyString();
    System.out.println(body);
    }
}
