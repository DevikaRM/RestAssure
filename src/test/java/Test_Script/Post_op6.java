package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.SSBuilder;

public class Post_op6 {

	public static void main(String[] args) 
	{
		given().spec(SSBuilder.Req_Spec()).when().post("/admin").then().spec(SSBuilder.Res_Spec(201)).extract().response();
		System.out.println("ok");
				
		
	}
		
}
