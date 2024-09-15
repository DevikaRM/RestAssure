package Testscript;

import org.json.simple.JSONObject;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Ppost_op1 {
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification r=RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id", 83);
		obj.put("username", "Devika");
		obj.put("firstName", "DR");
		obj.put("lastName", "DM");
		obj.put("email", "devika@gmail.com");
		obj.put("password", "9302748914");
		obj.put("phone", "8932638442");
		obj.put("userStatus", "0");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.POST,"/user");
		System.out.println(res.getStatusCode());
		
		
	}

	
	}


