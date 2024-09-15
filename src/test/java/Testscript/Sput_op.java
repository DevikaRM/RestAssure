package Testscript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sput_op {

	public static void main(String[] args) {
       RestAssured.baseURI="https://www.shoppersstack.com/shopping";
       RequestSpecification r=RestAssured.given();
       JSONObject obj=new JSONObject();
        obj.put("city", "Banglaluru");
		obj.put("country", "India");
		obj.put("createdDateTime", "2023-07-21T09:59:50.390Z");
		obj.put("dob", "");
		obj.put("email", "dhanarajrm46@gmail.com");
		obj.put("firstName", "Dhanaraj");
		obj.put("gender", "Male");
		obj.put("jwtToken", "string");
		obj.put("lastName", "Patil");
		obj.put("password", "Dhanu@14");
		obj.put("phone", "7892261628");
		obj.put("role", "ADMIN");
		obj.put("state", "karnataka");
		obj.put("status", "ACTIVE");
		obj.put("token", "string");
		obj.put("zoneId", "string");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.PUT,"/admin/BANGLALURU47401");
		res.prettyPrint();
		System.out.println(res.getStatusCode());
		
	}

}
