package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class StudentSubscribeModal extends BaseModel {
	private static final long serialVersionUID = 1L;
	private Integer district_id;
	private String districtname;
	private String year;
	private Integer scheme_id;
	private String schemename;
	private Integer sector_id;
	private String sectorname;
	private Integer program_id;
	private String programname;
	private BigInteger count;
	private BigInteger aadharnumber;
	private String firstname;
	private String lastname;
	private Timestamp dob;
	private Double ageasondate;
	private String gender;
	private String maritalstatus;
	private String religion;
	private Integer categoryid;
	private String category;
	private Integer family_annual_income;
	private BigInteger contact;
	private BigInteger alternatecontact;
	private String urbanorrural;
	private Integer state;
	private String statename;
	private Integer constitition;
	private String constituency;
	private String municipality;
	private String addressline;
	private String ward;
	private String street;
	private Integer pincode;
	private Integer tcid;
	private String tcname;
	private Integer tpid;
	private String tpname;
	private Date startdate;
	private Date enddate;
	private String batchname;
	private String name;
	private Integer college_id;
	private String collage_name;
	
	
	
	
	private String aadhaarId;
	private String studentFName;
	private String studentLName;
	private String phone;
	private String email;
	private String qualification;
	private Integer centerId;
	private String trainingStatus;
	private String ageConf;
	private String role;
	private String degree;
	private String graduationbranch;
	private Integer graduationyear;
	private Integer districtId;
	private String studentId;
	private String ipAddress;
	private Integer collegeId;
	private String collegeName;
	private String examinationcenter;
	private String branch;
	private String otherCollege;
	private String employeeId;
	private String guid;
	private String url;
	private String dateSearch;
	//private String fileName;
	private String base64String;
	
	private List<FileModel> files;
	private String videolink;
	private String path;
	private List<FileModel> filePaths;
	private String[] filePathsArr;
	private List<String> fileNames;
	private String reportingtime;
	private String description;
	private String location;
	private String designation;
	private String salary;
	private String interviewdate;
	private String venue;
	private Integer posts;
	private String type;
	private String jobid;   
	private String organization;
	
	private String status;
	private String prerequisites;
	private Integer tokenid;
	
	public Integer getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}
	
	
	public String getCollage_name() {
		return collage_name;
	}
	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}
	public Integer getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Integer getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(Integer scheme_id) {
		this.scheme_id = scheme_id;
	}
	public String getSchemename() {
		return schemename;
	}
	public void setSchemename(String schemename) {
		this.schemename = schemename;
	}
	public Integer getProgram_id() {
		return program_id;
	}
	public void setProgram_id(Integer program_id) {
		this.program_id = program_id;
	}
	public String getProgramname() {
		return programname;
	}
	public void setProgramname(String programname) {
		this.programname = programname;
	}
	public BigInteger getCount() {
		return count;
	}
	public void setCount(BigInteger count) {
		this.count = count;
	}
	public BigInteger getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(BigInteger aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	public Double getAgeasondate() {
		return ageasondate;
	}
	public void setAgeasondate(Double ageasondate) {
		this.ageasondate = ageasondate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getFamily_annual_income() {
		return family_annual_income;
	}
	public void setFamily_annual_income(Integer family_annual_income) {
		this.family_annual_income = family_annual_income;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getContact() {
		return contact;
	}
	public void setContact(BigInteger contact) {
		this.contact = contact;
	}
	public BigInteger getAlternatecontact() {
		return alternatecontact;
	}
	public void setAlternatecontact(BigInteger alternatecontact) {
		this.alternatecontact = alternatecontact;
	}
	public String getUrbanorrural() {
		return urbanorrural;
	}
	public void setUrbanorrural(String urbanorrural) {
		this.urbanorrural = urbanorrural;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Integer getConstitition() {
		return constitition;
	}
	public void setConstitition(Integer constitition) {
		this.constitition = constitition;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getTcid() {
		return tcid;
	}
	public void setTcid(Integer tcid) {
		this.tcid = tcid;
	}
	public String getTcname() {
		return tcname;
	}
	public void setTcname(String tcname) {
		this.tcname = tcname;
	}
	public Integer getTpid() {
		return tpid;
	}
	public void setTpid(Integer tpid) {
		this.tpid = tpid;
	}
	public String getTpname() {
		return tpname;
	}
	public void setTpname(String tpname) {
		this.tpname = tpname;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getSector_id() {
		return sector_id;
	}
	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}
	public String getSectorname() {
		return sectorname;
	}
	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}
	public String getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(String aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	public String getStudentFName() {
		return studentFName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	public String getStudentLName() {
		return studentLName;
	}
	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public String getAgeConf() {
		return ageConf;
	}
	public void setAgeConf(String ageConf) {
		this.ageConf = ageConf;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getGraduationbranch() {
		return graduationbranch;
	}
	public void setGraduationbranch(String graduationbranch) {
		this.graduationbranch = graduationbranch;
	}
	public Integer getGraduationyear() {
		return graduationyear;
	}
	public void setGraduationyear(Integer graduationyear) {
		this.graduationyear = graduationyear;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getExaminationcenter() {
		return examinationcenter;
	}
	public void setExaminationcenter(String examinationcenter) {
		this.examinationcenter = examinationcenter;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getOtherCollege() {
		return otherCollege;
	}
	public void setOtherCollege(String otherCollege) {
		this.otherCollege = otherCollege;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDateSearch() {
		return dateSearch;
	}
	public void setDateSearch(String dateSearch) {
		this.dateSearch = dateSearch;
	}
	public String getBase64String() {
		return base64String;
	}
	public void setBase64String(String base64String) {
		this.base64String = base64String;
	}
	public List<FileModel> getFiles() {
		return files;
	}
	public void setFiles(List<FileModel> files) {
		this.files = files;
	}
	public String getVideolink() {
		return videolink;
	}
	public void setVideolink(String videolink) {
		this.videolink = videolink;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<FileModel> getFilePaths() {
		return filePaths;
	}
	public void setFilePaths(List<FileModel> filePaths) {
		this.filePaths = filePaths;
	}
	public String[] getFilePathsArr() {
		return filePathsArr;
	}
	public void setFilePathsArr(String[] filePathsArr) {
		this.filePathsArr = filePathsArr;
	}
	public List<String> getFileNames() {
		return fileNames;
	}
	public void setFileNames(List<String> fileNames) {
		this.fileNames = fileNames;
	}
	public String getReportingtime() {
		return reportingtime;
	}
	public void setReportingtime(String reportingtime) {
		this.reportingtime = reportingtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getInterviewdate() {
		return interviewdate;
	}
	public void setInterviewdate(String interviewdate) {
		this.interviewdate = interviewdate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Integer getPosts() {
		return posts;
	}
	public void setPosts(Integer posts) {
		this.posts = posts;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Integer getTokenid() {
		return tokenid;
	}
	public void setTokenid(Integer tokenid) {
		this.tokenid = tokenid;
	}
	
	
	
	
	
	
}
