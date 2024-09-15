package pojo4;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Data;


public class Get_op {

	public static void main(String[] args) {
   RestAssured.baseURI="https://reqres.in/";
   RequestSpecification r = RestAssured.given();
   JSONObject obj = new JSONObject();
   obj.put("name","morpheus");
   obj.put("job", "leader");
   r.contentType(ContentType.JSON);
   r.body(obj.toJSONString());
   Response res = r.request(Method.POST,"/api/users");
   Data s = res.as(Data.class);
   int id = s.getId();
   System.out.println(id);
   
   
   
  	}

}
