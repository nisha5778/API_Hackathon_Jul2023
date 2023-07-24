package api.endpoints;
	
public class Routes {
	public static String base_url  
		= "https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms";
	public static String postAssignment_url = base_url + "/assignments";
	public static String getAllAssignments_url = base_url + "/assignments";
	public static String getAssignmentByAssignmentId_url = base_url + "/assignments/{id}";
	public static String getAssignmentsByBatchId_url = base_url + "/assignments/batch/{batchId}";
	public static String putAssignment_url = base_url + "/assignments/{id}";
	public static String deleteAssignment_url = base_url + "/assignments/{id}";	
	
}
