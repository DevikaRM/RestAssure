package Testscript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerPost_op2 {

	public static void main(String[] args) {
	        RestAssured.baseURI="https://petstore.swagger.io/v2";
	        RequestSpecification r = RestAssured.given();
	        JSONObject obj = new JSONObject();
	        obj.put("id"," 378" );
	        obj.put("username", "PRIYA@356");
	        obj.put("firstName", "PRII");
	        obj.put("lastName", "k");
	        obj.put("email", "PRIYA123@gmail.com");
	        obj.put("password", "4885234756");
	        obj.put("phone", "2845491947");
	        obj.put("userStatus", 0);
	        r.contentType(ContentType.JSON);
	        r.body(obj.toJSONString());
	        Response res = r.request(Method.POST,"/user");
		    res.prettyPrint();
		    System.out.println(res.getStatusCode());
		    System.out.println(res.getTime());
		    System.out.println(res.getHeaders());
	}

}
