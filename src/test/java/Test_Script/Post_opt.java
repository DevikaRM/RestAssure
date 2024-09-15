package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.SBuilder;

public class Post_opt {
public static void main(String[] args) {
	given().spec(SBuilder.Req_spec()).when().post("/api/users");
	System.out.println("ok");
}
}
