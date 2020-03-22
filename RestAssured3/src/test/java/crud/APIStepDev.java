package crud;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Fileread;


public class APIStepDev {

	BDDStyleethod obj=new BDDStyleethod();
	Fileread obj2=new Fileread();
	@Given("the user sets the endpoint to {string}")
	public void sets_the(String string) throws IOException {
		String str=Fileread.Basereader(string);
		obj.simpleGet( str);
	   
	}

	@When("user makes a get call to {string}")
	public void makes_a_get_call_to_with_below_attributes(String string,List<Map<String, String>> values) throws IOException {
		
		String str2=Fileread.EndPointreader(string);
		obj.simpleGetPostParams(str2);
	    obj.simpleGetPostParams2(values);
	}

	@Then("I receive valid HTTP Response {int}")
	public void i_receive_valid_HTTP_Response_code(int int1) {
		obj.checkStatuscode(int1);
	   
	}
	@When("user makes a POST call to {string}")
	public void user_makes_a_POST_call_to(String string,Map<String, String> values) throws IOException {
		String str2=Fileread.EndPointreader(string);
		obj.simpleGetPostParams(str2);
		obj.jsonBuilder(values);
		obj.jsonPutPost(1);
	}
	@When("user makes a PUT request to {string} with following data")
	public void user_makes_a_PUT_request_to_with_following_data(String string,Map<String, String> values) throws IOException {
		String str2=Fileread.EndPointreader(string);
		obj.simpleGetPostParams(str2);
		obj.jsonBuilder(values);
		obj.jsonPutPost(2);
	}
	@When("user makes a DELETE request to {string}")
	public void user_makes_a_DELETE_request_to(String string) throws IOException {
		String str2=Fileread.EndPointreader(string);
		obj.simpleGetPostParams(str2);
	}

	@When("user validates for the content-length")
	public void user_validates_for_the_content_length(Map<String, String> values) {
	   obj.deletereq(values);
	}


}
