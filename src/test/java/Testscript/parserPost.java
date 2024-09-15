package Testscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class parserPost {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://reqres.in/";
	      RequestSpecification r = RestAssured.given();
	      Response res = r.request(Method.POST,"/api/users");
	      String value = res.asString();
	      JsonPath path=new JsonPath(value);
	      String v = path.getString("job");
	      System.out.println(v);
	}

}
