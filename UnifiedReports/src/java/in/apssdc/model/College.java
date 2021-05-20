package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class College extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	private Integer collegeId;
	private String collegeName;

	public Integer getCollegeId() {
		return this.collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
