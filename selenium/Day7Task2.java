package selenium_programs.seleniumAssignments;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class Day7Task2 {
	@Test
		public void jsonPayload() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Day7Task2Pojo newPost=new Day7Task2Pojo(1,"WingsOfFire","AbdulKalam");
		
		//Given
		given()
		  .header("Accept","application/json")
		  .body(newPost)
		  
		//When
		.when()
		  .post("/posts")
		  
		 //Then
		.then()
		   .statusCode(201)
		   .body("id", notNullValue())
		   .body("title",equalTo("WingsOfFire"))
		   .body("body",equalTo("AbdulKalam"))
		   .body("userId",equalTo(1))
		   .log().body();
		}
}
