import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestTest {



	@Test
	public void test1() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode,200);


	}
	@Test
	void Test2() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200)
		.body("data.id[1]",equalTo(8));

	}


	@Test
	void test3() {
		given().get("https://reqres.in/api/users?page=2")
		.then().body("data.first_name[0]",equalTo("Michael") );

	}
	@Test
	void test4() {

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.email[2]",equalTo("tobias.funke@reqres.in"));
	}

	@Test
	void test5() {

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log().all();
	}
	
	@Test
	public void test6() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "mehmet");
		map.put("job","caregiver");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		request.put("name", "yasin");
		request.put("job","teacher");
		System.out.println(request.toJSONString());
		given().accept(ContentType.JSON).
		body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
		
		
	}
	
	//to jason format
	
	@Test
	public void test7() {
		JSONObject request1 = new JSONObject();
		request1.put("name", "aygul");
		request1.put("age","33" );
		System.out.println(request1.toJSONString());
		given()
		.when()
		.put("https://reqres.in/api/users")
		.then()
		.statusCode(200)
				
		.log().all();
		
	}
	
	public void test8() {
		
	}


}

