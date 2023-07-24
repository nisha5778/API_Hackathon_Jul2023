package stepDefinitions;

import java.io.IOException;
import org.json.simple.JSONObject;
import api.payload.AssignmentPayload;
import api.tests.AssignmentTests;
import global.GlobalVar;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssignmentNegativeScenarios_SD {
	public static Response response;
	public JSONObject jsonAssignment;
	public String assignmentName;
	public AssignmentPayload assignmentPayload;
	RequestSpecification requestSpec;
	AssignmentTests post = new AssignmentTests();
	
	@When("User sends request Body from excel with missing data")
	public void user_sends_request_body_from_excel_with_missing_data() throws IOException {
		post.TestPostAssignment("", "", GlobalVar.batchId, "", 
				"", "", "", "", "", 
				"", "", "");
	}	

	@When("User calls the payload API with get request by wrong batchId")
	public void user_calls_the_payload_api_with_get_request_by_wrong_batch_id() {
		post.TestGetAssignmentsByBatchId(GlobalVar.wrongBatchId);
	}

	@Then("User gets cannot create in response")
	public void User_gets_cannot_create_in_response(){  
		//post.verifyStatus(400);
		post.verify_post_status(400);
	}
	
	@Then("User gets not found in response")
	public void User_gets_not_found_in_response(){
//		post.verifyStatus(404);
		post.verify_get_status(404);
	}
	

	@When("User calls the payload API with put request by assignmentId with missing data")
	public void user_calls_the_payload_api_with_put_request_by_assignment_id_with_missing_data() {
		post.TestUpdateAssignment(GlobalVar.assignmentId, "", "", 
				10, "", "", "", "", "", "","", "", "");	
	}
	
	@Then("Assignment does not get updated")
	public void assignment_does_not_get_updated() {
//		post.verifyStatus(400);
		post.verify_update_status(400);
	}

	@When("User calls the payload API with delete request by non-existent assignmentId")
	public void user_calls_the_payload_api_with_delete_request_by_non_existent_assignment_id() {
		post.TestDeleteAssignment(GlobalVar.assignmentId);
	}

	@Then("Assignment does not get deleted")
	public void assignment_does_not_get_deleted() {
//		post.verifyStatus(400);
		post.verify_delete_status(400);
	}
}
