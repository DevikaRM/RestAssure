package pojo;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_op1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		
		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		
		Response res = r.request(Method.POST,"/api/users");
		Data1 c = res.as(Data1.class);
		Object j = c.getName();
		System.out.println(j);
		
		
	}
	}

	

