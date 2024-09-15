package Test_Script;

import static io.restassured.RestAssured.given;

import generic1.SBuilder;


public class Get_op1 {
  
	public static void main(String[] args)
	{
		given().spec(SBuilder.Req_spec()).when().get("/api/users/2");
		System.out.println("Done");
 
	}
	

	
	

}
