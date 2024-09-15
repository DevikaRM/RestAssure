package Test_Script;

import  static io.restassured.RestAssured.given;

import Generic.PBuilder;;

public class RGet_op {
	public static void main(String[] args) {
		given().spec(PBuilder.req_spec()).when().get("/api/users/2");
		System.out.println("done");
			 }

}
