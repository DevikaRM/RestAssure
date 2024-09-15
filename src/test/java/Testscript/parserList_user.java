package Testscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class parserList_user {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://reqres.in/";
	      RequestSpecification r = RestAssured.given();
	      Response res = r.request(Method.GET,"/api/users?page=2");
	      String value = res.asString();
	      JsonPath path=new JsonPath(value);
	      String v = path.getString("data[4].first_name");
	      System.out.println(v);
	}

}
