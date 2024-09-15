package generic1;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SBuilder {
	static String obj="{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}";
   
    public static RequestSpecification Req_spec()
	{
		
		RequestSpecBuilder r = new RequestSpecBuilder();
		  RequestSpecification req = r.setBaseUri("https://reqres.in/").setBody(obj).setContentType(ContentType.JSON).build();
		return req;
	}
	
	public static ResponseSpecification Res_Spec(int code) {
		ResponseSpecBuilder r=new ResponseSpecBuilder();
		ResponseSpecification res = r.expectStatusCode(code).expectContentType(ContentType.JSON).build();
	
		return res;
		
	}
    

}
