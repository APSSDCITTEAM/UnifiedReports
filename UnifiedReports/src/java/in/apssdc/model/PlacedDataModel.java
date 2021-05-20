package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class PlacedDataModel extends BaseModel {

	        
	/**      
	 *     
	 */
	private static final long serialVersionUID = 1L;
	private String aadhaar;  
	private String phone;
	private String email;
	private String username;
	private String company;
	private String role;
	private String dateofselection;  
	private String qualification;
	private String name;
	private Integer jobid;
	private String ipAddress;
	
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDateofselection() {
		return dateofselection;
	}
	public void setDateofselection(String dateofselection) {
		this.dateofselection = dateofselection;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;  
	}
	  
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getJobid() {
		return jobid;
	}
	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}
}
