package Generic;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PBuilder {
	public static RequestSpecification req_spec()
	{
		RequestSpecBuilder r = new RequestSpecBuilder();
		RequestSpecification req = r.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		return req;
		
	}

	
	
	}
	


