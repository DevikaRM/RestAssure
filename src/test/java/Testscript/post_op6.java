package Testscript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post_op6 {
	public static void main(String[] args) {
		  RestAssured.baseURI="https://reqres.in/";
	      RequestSpecification r = RestAssured.given();
	      //JSON BODY
	      JSONObject obj = new JSONObject();
	      obj.put("email", "peter@klaven");
           r.contentType(ContentType.JSON);
	       r.body(obj.toJSONString());
	       
	       Response res = r.request(Method.POST,"/api/login");
	       //res.. will get fully qualified path
	       res.prettyPrint();
	       System.out.println(res.getStatusCode());//will get status code
	       System.out.println(res.getTime());//response time
	       System.out.println(res.getHeaders());// head request of http protocol

}
}



