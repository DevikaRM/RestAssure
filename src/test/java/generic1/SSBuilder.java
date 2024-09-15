package generic1;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SSBuilder {
	static String obj="{\r\n"
			+ "  \"city\": \"Bangaluru\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"createdDateTime\": \"2023-07-20T07:36:16.200Z\",\r\n"
			+ "  \"dob\": \"02/06/2001\",\r\n"
			+ "  \"email\": \"Devika2@gmail.com\",\r\n"
			+ "  \"firstName\": \"Devika\",\r\n"
			+ "  \"gender\": \"Female\",\r\n"
			+ "  \"imageId\": \"string\",\r\n"
			+ "  \"jwtToken\": \"string\",\r\n"
			+ "  \"lastName\": \"Mamadapur\",\r\n"
			+ "  \"password\": \"devika@18\",\r\n"
			+ "  \"phone\": \"9382745693\",\r\n"
			+ "  \"role\": \"ADMIN\",\r\n"
			+ "  \"state\": \"Karnataka\",\r\n"
			+ "  \"status\": \"ACTIVE\",\r\n"
			+ "  \"token\": \"string\",\r\n"
			+ "  \"zoneId\": \"string\"\r\n"
			+ "}";

	
	public static RequestSpecification Req_Spec()
	{
		RequestSpecBuilder r=new RequestSpecBuilder();
		RequestSpecification res=  r.setBaseUri("https://www.shoppersstack.com/shopping").setBody(obj).setContentType(ContentType.JSON).build();
		return res;
	}
	
	public static ResponseSpecification Res_Spec(int code)
	{
		ResponseSpecBuilder r=new ResponseSpecBuilder();
		ResponseSpecification res=r.expectStatusCode(code).expectContentType(ContentType.JSON).build();
		return res;
	}


	
	}
	
	

