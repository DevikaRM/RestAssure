package Testscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class Delete {

	public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification r = RestAssured.given();
        Object res = r.request(Method.DELETE,"/api/users/2");
        
	}

}
