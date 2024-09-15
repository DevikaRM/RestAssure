package Testscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_op2 {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://reqres.in/";
	      RequestSpecification r = RestAssured.given();
	      Response res = r.request(Method.GET,"/api/users/23");
	      System.out.println(res.asString());
	      System.out.println(res.getTime());
	      System.out.println(res.getStatusCode());
	      System.out.println(res.headers());

	}

}
