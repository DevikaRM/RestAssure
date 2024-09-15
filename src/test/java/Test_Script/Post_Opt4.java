package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.PBuilder;

public class Post_Opt4 {

	public static void main(String[] args) {
	   given().spec(PBuilder.Req_spec()).when().post("/user").then().spec(PBuilder.Res_spec(200)).extract().response();
	   System.out.println("ok");

	}

}
