package Testscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ParserGet_Op {

	public static void main(String[] args) {
        RestAssured.baseURI="";
        RequestSpecification r = RestAssured.given();
        Response res = r.request(Method.GET,"/api/user/2");
        String value = res.asString();
        
        JsonPath path=new JsonPath(value);
        String id = path.getString("data.email");
        System.out.println(id);
        
        
	}

}
