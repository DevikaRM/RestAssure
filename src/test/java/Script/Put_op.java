package Script;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_op {

	public static void main(String[] args) {
      RestAssured.baseURI="https://reqres.in/";
      RequestSpecification r = RestAssured.given();
      JSONObject obj = new JSONObject();
      obj.put("name", "morpheus");
      obj.put("job", "zion resident");
      r.contentType(ContentType.JSON);
      r.body(obj).toString();
      Response res = r.request(Method.PUT,"/api/users/2");
      res.prettyPrint();
      
      }

}
