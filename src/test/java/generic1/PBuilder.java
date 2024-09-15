package generic1;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PBuilder {
	static String obj="{\r\n"
			+ "  \"id\": 0,\r\n"
			+ "  \"username\": \"sowjanya\",\r\n"
			+ "  \"firstName\": \"sowjanyadc\",\r\n"
			+ "  \"lastName\": \"gowda\",\r\n"
			+ "  \"email\": \"sowjanya@gmail.com\",\r\n"
			+ "  \"password\": \"sowju1026\",\r\n"
			+ "  \"phone\": \"9980823833\",\r\n"
			+ "  \"userStatus\": 0\r\n"
			+ "}";
	public static RequestSpecification Req_spec() {
		RequestSpecBuilder r=new RequestSpecBuilder();
		RequestSpecification res = r.setBaseUri("https://petstore.swagger.io/v2").setBody(obj).setContentType(ContentType.JSON).build();
		return res;
		
	}
	public static ResponseSpecification Res_spec(int code) {
		ResponseSpecBuilder r=new ResponseSpecBuilder();
		ResponseSpecification res = r.expectStatusCode(code).expectContentType(ContentType.JSON).build();
		return res;
		
	}

}
