package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class Colleges extends BaseModel {
	
	private String collegeid;
	private String collegename;
	private String latitude;   
	private String longitude;  
	private Integer districtid;
	private String districtname;
	private Integer count;
	private Boolean isactive;   
	
	
	
	
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getDistrictid() {
		return districtid;
	}
	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public String getCollegeid() {     
		return collegeid;
	}
	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}   
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}	
	

}
