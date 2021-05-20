package in.apssdc.service;

import com.andromeda.commons.model.Response;
import in.apssdc.dao.ReportDAO;
import in.apssdc.model.FileModel;
import in.apssdc.model.StudentSubscribeModal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
  @Autowired
  private ReportDAO reportDAO;
  Response response = new Response();
  
  public Response getDistrictSchemesReport()
	{
		response.setSuccessful(false);
		Map<String, Object> list = reportDAO.getDistrictSchemesReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}
  
  public Response getDistrictSchemewiseData(StudentSubscribeModal report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = this.reportDAO.getDistrictSchemewiseData(report);
		System.out.println("list:"+list);
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;  
	}
  
  public Response getDistrictSchemesTCTPReport()
 	{
 		response.setSuccessful(false);
 		Map<String, Object> list = reportDAO.getDistrictSchemesTCTPReport();
 		response.setSuccessful(true);
 		response.setResponseObject(list);
 		return response;    
 	}
  
  public Response getDistrictSchemeTCTPwiseData(StudentSubscribeModal report)
 	{
 		response.setSuccessful(false);
 		List<Map<String, Object>> list = this.reportDAO.getDistrictSchemeTCTPwiseData(report);
 		System.out.println("list:"+list);
 		response.setSuccessful(true);
 		response.setResponseObject(list);   
 		return response;  
 	}
	
  
  public Response getDistrictSchemesSectorReport()
	{
		response.setSuccessful(false);
		Map<String, Object> list = reportDAO.getDistrictSchemesSectorReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}

public Response getDistrictSchemeSectorwiseData(StudentSubscribeModal report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = this.reportDAO.getDistrictSchemeSectorwiseData(report);
		System.out.println("list:"+list);
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;  
	}

public Response getDistrictSchemesGenderReport()
	{
		response.setSuccessful(false);
		Map<String, Object> list = reportDAO.getDistrictSchemesGenderReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}

public Response getDistrictSchemegenderwiseData(StudentSubscribeModal report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = this.reportDAO.getDistrictSchemegenderwiseData(report);
		System.out.println("list:"+list);
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;  
	}



public Response getDistrictSchemesGenderCategoryReport()
	{
		response.setSuccessful(false);
		Map<String, Object> list = reportDAO.getDistrictSchemesGenderCategoryReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}

public Response getDistrictSchemegendercategorywiseData(StudentSubscribeModal report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = this.reportDAO.getDistrictSchemegendercategorywiseData(report);
		System.out.println("list:"+list);
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;  
	}



public Response getDegreeCollegeWiseReport()
	{
		response.setSuccessful(false);
		Map<String, Object> list = reportDAO.getDegreeCollegeWiseReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}

public Response getDegreeCollegewisePlacedData(StudentSubscribeModal report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = this.reportDAO.getDegreeCollegewisePlacedData(report);
		System.out.println("list:"+list);
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;  
	}
	
public Response getApplicantDetails(String jobid)
{
	response.setSuccessful(false);
	List<Map<String,Object>> list = reportDAO.getApplicantDetails(jobid);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}
public Response getJobApplicants()
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = reportDAO.getJobApplicants();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

public Response showDateswiseApplicants(StudentSubscribeModal student) {
	
	
	List<Map<String, Object>> list = this.reportDAO.showDateswiseApplicants(student);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

public Response getPlacedCompanies()
{
	response.setSuccessful(false);
	Map<String, Object> list = reportDAO.getPlacedCompanies();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;    
}
    

public Response getPlacedDetails(Integer jobid)
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = reportDAO.getPlacedDetails(jobid);
	System.out.println("list:"+list);
	response.setSuccessful(true);
	response.setResponseObject(list);   
	return response;  
}

	
}
