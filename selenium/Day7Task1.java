package selenium_programs.seleniumAssignments;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Day7Task1 {
    @Test
	public static void apiTest (){
    	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given()
		  .header("Accept","application/xml")
		.when()
		  .get("users/1")
		.then()
		   .statusCode(200)
		   .body("id",equalTo(1))
		   .body("username", not(empty()))
		   .body("email", containsString("@"))
		   .log().all();	
	}

}

