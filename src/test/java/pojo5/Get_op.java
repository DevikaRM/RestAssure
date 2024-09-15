package pojo5;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Data;

public class Get_op {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/users/2");
		Single_user s = res.as(Single_user.class);
		Data d = s.getData();
		int id = d.getId();
		System.out.println(id);
	}

}
