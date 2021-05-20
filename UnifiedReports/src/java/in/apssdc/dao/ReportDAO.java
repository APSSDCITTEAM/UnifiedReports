package in.apssdc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.andromeda.commons.dao.BaseDAO;
import in.apssdc.model.StudentSubscribeModal;

@Repository
public class ReportDAO extends BaseDAO {
	public Map<String, Object> getDistrictSchemesReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDistrictSchemesReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtscheme", companies); 
		
		return map;     
	}   
	
	
	public List<Map<String, Object>> getDistrictSchemewiseData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDistrictSchemewiseData",map);
		return details;
	}
	  
	public Map<String, Object> getDistrictSchemesTCTPReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDistrictSchemesTCTPReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtschemetctp", companies); 
		
		return map;     
	}  
	
	public List<Map<String, Object>> getDistrictSchemeTCTPwiseData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDistrictSchemeTCTPwiseData",map);
		return details;
	}
	
	public Map<String, Object> getDistrictSchemesSectorReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDistrictSchemesSectorReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtschemesector", companies); 
		
		return map;     
	}  
	
	public List<Map<String, Object>> getDistrictSchemeSectorwiseData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDistrictSchemeSectorwiseData",map);
		return details;
	}
	

	public Map<String, Object> getDistrictSchemesGenderReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDistrictSchemesGenderReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtschemegender", companies); 
		
		return map;     
	}  
	
	public List<Map<String, Object>> getDistrictSchemegenderwiseData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDistrictSchemegenderwiseData",map);
		return details;
	}
	
	public Map<String, Object> getDistrictSchemesGenderCategoryReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDistrictSchemesGenderCategoryReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("districtschemegendercategory", companies); 
		
		return map;     
	}  
	
	public List<Map<String, Object>> getDistrictSchemegendercategorywiseData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDistrictSchemegendercategorywiseData",map);
		return details;
	}
	
	public Map<String, Object> getDegreeCollegeWiseReport() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getDegreeCollegeWiseReport");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("degeecollege", companies); 
		
		return map;     
	}  
	
	public List<Map<String, Object>> getDegreeCollegewisePlacedData(StudentSubscribeModal report) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", report);
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getDegreeCollegewisePlacedData",map);
		return details;
	}
	
	public List<Map<String, Object>> showDateswiseApplicants(StudentSubscribeModal student) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", student);
		List<Map<String, Object>> jobs = this.sqlSessionTemplate.selectList("Report.showDateswiseApplicants",map);
		return jobs;
	}
	
	public List<Map<String, Object>> getApplicantDetails(String jobid) {
		List<Map<String, Object>> jobs = this.sqlSessionTemplate.selectList("Report.getApplicantDetails",jobid);
		return jobs;
	}
	
	  
	public List<Map<String, Object>> getJobApplicants() {
		List<Map<String, Object>> jobs = this.sqlSessionTemplate.selectList("Report.getJobApplicants");
		return jobs;
	}
	
	public Map<String, Object> getPlacedCompanies() {
		List<Map<String, Object>> companies = this.sqlSessionTemplate.selectList("Report.getPlacedCompanies");
		List<Map<String, Object>> companies1 = this.sqlSessionTemplate.selectList("Report.getAdminPlacedCompanies");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("placedData", companies); 
		map.put("placedData1", companies1); 
		return map;     
	}   
	
	
	public List<Map<String, Object>> getPlacedDetails(Integer jobid) {
		List<Map<String, Object>> details = this.sqlSessionTemplate.selectList("Report.getPlacedDetails",jobid);
		return details;
	}
	  
}
