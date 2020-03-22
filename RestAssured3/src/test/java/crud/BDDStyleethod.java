package crud;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BDDStyleethod {
	
	public static String string2;
	private static final Logger logger=Logger.getLogger(BDDStyleethod.class);
	Response res;
	RequestSpecification request;
	int i;
	JSONObject json = new JSONObject();
	public void simpleGet(String string2)
	{
		RestAssured.baseURI=string2;
		request=RestAssured.given();
		
	}
	public void simpleGetPostParams(String string2)  {
		BDDStyleethod.string2=string2;
		logger.debug("api end point"+string2 );
		
	}
	
	@Test
	public void simpleGetPostParams2(List<Map<String,String>> values) {
		
		
	
		for(i=0;i<values.size();i++)
		{
			
			res=request.
		queryParam(values.get(i).get("AttributType"),values.get(i).get("AttributeValue") ).
		when().get(string2).then().assertThat().
		statusCode(200).extract().response();
		System.out.println("Data is "+ values.get(i).get("AttributeValue"));
		String mystr= res.asString();
		System.out.println("Data is "+i+ mystr);
		}
		
	}
	protected void jsonBuilder(Map<String,String> data)
	{
		
	    for(Entry<String,String> entry: data.entrySet())
	    {
	    	json.put(entry.getKey(),entry.getValue());
	    }
	   
	}
	
	public void checkStatuscode(int i) {
		res.then().assertThat().statusCode(i);
	
	}
	protected void jsonPutPost(int i)
	{
	    request.header("Content-Type","application/json");
	    request.body(json.toString());
	    res=(i==1)?(request.post(string2)):(request.put(string2));
	   
	}
	public void deletereq(Map<String,String> data)
	{
		String val;
		 for(Entry<String,String> entry: data.entrySet())
		    {
			 val=entry.getValue();
			res= request.delete(string2).then().assertThat().header(entry.getKey(), equalTo(val)).extract().response();
			
		    }
		
	}

}
