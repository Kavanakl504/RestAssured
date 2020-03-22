package crud;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostPutDelete {
	
	@Test
	public void test1()
	{
		RestAssured.baseURI="KavanaKL";
		RequestSpecification request=RestAssured.given();
		request.header("Content-type", "application/json");
		JSONObject json=new JSONObject();
		
		json.put("name", "kavana");
		json.put("job", "leader");
		
		request.body(json.toJSONString());
		Response response=request.post("https://reqres.in/api/users");
		
		int code=response.statusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 201);
	}
	@Test
	public void testPost()
	{
		System.out.println(RestAssured.baseURI);
	}

}
