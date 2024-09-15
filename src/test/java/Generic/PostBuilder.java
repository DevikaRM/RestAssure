package Generic;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PostBuilder {
	public static RequestSpecification req_spec()
	{
		String obj="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RequestSpecBuilder r = new RequestSpecBuilder();
		RequestSpecification res = r.setBaseUri("https://reqres.in/").setBody(ContentType.JSON).build();
		return res;
	}
	
	public static ResponseSpecification res_spec(int code) {
		ResponseSpecBuilder res = new ResponseSpecBuilder();
		ResponseSpecification specification = res.expectStatusCode(code).expectContentType(ContentType.JSON).build();
		return specification;
	}

}
