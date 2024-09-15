package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.SBuilder;
import io.restassured.response.Response;


public class Post_Opt1 {
	public static void main(String[] args) {
		 Response res = given().spec(SBuilder.Req_spec()).when().post("/api/users")
		.then().spec(SBuilder.Res_Spec(201)).extract().response();
		System.out.println("ok");
		
	}

}
