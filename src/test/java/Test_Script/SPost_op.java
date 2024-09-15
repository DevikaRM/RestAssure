package Test_Script;

import static io.restassured.RestAssured.given;

import Generic.PostBuilder;
import io.restassured.response.Response;

public class SPost_op {
	public static void main(String[] args) {
		Response res = given().spec(PostBuilder.req_spec()).when().post("/api/users").then().spec(PostBuilder.res_spec(201)).extract().response();
		System.out.println(res.asPrettyString());
	}
	
	

}
