package in.apssdc.controller;

import com.andromeda.commons.model.Response;

import in.apssdc.model.StudentSubscribeModal;
import in.apssdc.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/report" })
public class ReportController {
	@Autowired
	private ReportService reportService;

	@ResponseBody
	@RequestMapping(value = "getDistrictSchemesReport", method = { RequestMethod.POST })
	public Response getDistrictSchemesReport()
	{
		return reportService.getDistrictSchemesReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemewiseData", method = { RequestMethod.POST })
	public Response getDistrictSchemewiseData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDistrictSchemewiseData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemesTCTPReport", method = { RequestMethod.POST })
	public Response getDistrictSchemesTCTPReport()
	{
		return reportService.getDistrictSchemesTCTPReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemeTCTPwiseData", method = { RequestMethod.POST })
	public Response getDistrictSchemeTCTPwiseData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDistrictSchemeTCTPwiseData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemesSectorReport", method = { RequestMethod.POST })
	public Response getDistrictSchemesSectorReport()
	{
		return reportService.getDistrictSchemesSectorReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemeSectorwiseData", method = { RequestMethod.POST })
	public Response getDistrictSchemeSectorwiseData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDistrictSchemeSectorwiseData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemesGenderReport", method = { RequestMethod.POST })
	public Response getDistrictSchemesGenderReport()
	{
		return reportService.getDistrictSchemesGenderReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemegenderwiseData", method = { RequestMethod.POST })
	public Response getDistrictSchemegenderwiseData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDistrictSchemegenderwiseData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemesGenderCategoryReport", method = { RequestMethod.POST })
	public Response getDistrictSchemesGenderCategoryReport()
	{
		return reportService.getDistrictSchemesGenderCategoryReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistrictSchemegendercategorywiseData", method = { RequestMethod.POST })
	public Response getDistrictSchemegendercategorywiseData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDistrictSchemegendercategorywiseData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = "getDegreeCollegeWiseReport", method = { RequestMethod.POST })
	public Response getDegreeCollegeWiseReport()
	{
		return reportService.getDegreeCollegeWiseReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDegreeCollegewisePlacedData", method = { RequestMethod.POST })
	public Response getDegreeCollegewisePlacedData(@RequestBody StudentSubscribeModal report)
	{
		return reportService.getDegreeCollegewisePlacedData(report);  
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getJobApplicants" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getJobApplicants() {
		
		return reportService.getJobApplicants();
		
	}
	
	@ResponseBody
	@RequestMapping(value = "showDateswiseApplicants", method = { RequestMethod.POST })
	public Response showDateswiseApplicants(@RequestBody StudentSubscribeModal student)
	{
		return reportService.showDateswiseApplicants(student);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getApplicantDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getApplicantDetails(@RequestBody String jobid) {
		
		return reportService.getApplicantDetails(jobid);
		
	}
	
	@ResponseBody
	@RequestMapping(value = "getPlacedCompanies", method = { RequestMethod.POST })
	public Response getPlacedCompanies()
	{
		return reportService.getPlacedCompanies();
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "getPlacedDetails", method = { RequestMethod.POST })
	public Response getPlacedDetails(@RequestBody Integer jobid)
	{
		return reportService.getPlacedDetails(jobid);  
	}   
	  
	
}
