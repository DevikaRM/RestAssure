package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.PBuilder;

public class Post_Opt3 {

	public static void main(String[] args) {
		given().spec(PBuilder.Req_spec()).when().post("/user");
		System.out.println("ok");
		

	}

}
