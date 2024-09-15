package Script;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerPut {

	public static void main(String[] args) {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        RequestSpecification r = RestAssured.given();
        JSONObject obj = new JSONObject();
        obj.put("id", "965");
        obj.put("username", "Manjula");
        obj.put("firstName", "M");
        obj.put("lastName", "poojari");
        obj.put("email", "manjula@gmail.com");
        obj.put("password", "manjula@098");
        obj.put("phone", "8549310284");
        obj.put("userStatus", 0);
        r.contentType(ContentType.JSON);
        r.body(obj.toJSONString());
        Response res = r.request(Method.POST,"/user/{Manjula}");
        res.prettyPrint();
        res.getStatusCode();
        res.getStatusLine();
        
	}

}
