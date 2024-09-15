package generic1;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class GRBuilder {
	public static RequestSpecification Req_spec()
	{
		RequestSpecBuilder r= new RequestSpecBuilder();
		
		RequestSpecification req= r.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		return req;
	}

}
