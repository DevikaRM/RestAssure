package Test_Script;

import static  io.restassured.RestAssured.given;

import generic1.SBuilder;
import generic1.SSBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post_op5 {
	public static void main(String[] args) {
		 given().spec(SSBuilder.Req_Spec()).when().post("/admin");
		System.out.println("ok");
				
	}
	
}
	


