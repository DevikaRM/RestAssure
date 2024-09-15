package Testscript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerPost_op3 {

	public static void main(String[] args) {
      RestAssured.baseURI="https://petstore.swagger.io/v2";
      RequestSpecification r = RestAssured.given();
      JSONObject obj = new JSONObject();
      obj.put("username", "PRIYA@356");
      obj.put("password", "4885234756");
      r.contentType(ContentType.JSON);
      r.body(obj.toJSONString());
      Response res = r.request(Method.POST,"/user/login");
	    res.prettyPrint();
	    System.out.println(res.getStatusCode());
	    System.out.println(res.getTime());
	    System.out.println(res.getHeaders());
}
	}


