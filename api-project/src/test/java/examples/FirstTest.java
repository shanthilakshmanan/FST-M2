package examples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {
    @Test
    public void simpleMethod(){
        final String baseURI="https://petstore.swagger.io/v2/pet";
        //sending the request
        Response response=given().contentType(ContentType.JSON).
                when().get(baseURI +"/findByStatus?status=sold");


        //print the response
        System.out.println(response.getBody().asString());
        System.out.println(response.getBody().asPrettyString());

        String petname= response.then().extract().path("[0].name");
        System.out.println("Petname is :" + petname);
        //Assertions
        response.then().statusCode(200);
        response.then().body("[0].status",equalTo("sold"));

    }
}
