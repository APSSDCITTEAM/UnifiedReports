package in.apssdc.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;



public class Employee
  extends BaseModel
{
  private static final long serialVersionUID = 1L;
  private String batch;
  private String assignedto;
  private String status_vf_hr;
  private String thirdrm;
  private String type;
  private String secondrmstatus;
  private Double lattitude;
  private Double longitude;
  
  private String officialemailid;
  private String renewalcontractenddate;
  private Integer renewalcontractperiod;
  private String secondrm;
  private Integer sno;
  private String firstrm;
  private String dateofjoining;
  private Date creation_datetime;   
  private Integer collegecourseid;
  private String id;
  private String traineeid;
  private String employeeId;
  private String name;
  private List<Employee> slotsArr;
  private Timestamp timeStamp;
  
  
  
  
  
  public Timestamp getTimeStamp() {
	return timeStamp;
}

public void setTimeStamp(Timestamp timeStamp) {
	this.timeStamp = timeStamp;
}

public List<Employee> getSlotsArr() {
	return slotsArr;
}

public void setSlotsArr(List<Employee> slotsArr) {
	this.slotsArr = slotsArr;
}

private String columnName;
  private String gender;
  private String dob;
  private String designation;
  private String email;
  private String aadharid;
  private String placeofwork;
  private String placeofwork1;
  private String assigned;
  private String assigned_to;
  private String status;
  private Timestamp verifiedTime;
  private String verifiedBy;
  private String programName;
  private String courseName;
  private String transferDate;
private String collegeId;
  private String collegeName;
  private String mobile;
  private String doj;
  private String address;
  private String guardianName;
  private String guid;
  private String logUser;
  private String photoLocation;
  private Date relievedDate;
  private Integer programId;
  private Integer courseId;
  private String bankName;
  private String accountNumber;
  private String ifscCode;
  private String religion;
  private String category;
  private String doorno;
  private String street;
  private String villageName;
  private String taluk;
  private String mandalName;
  private String districtName;
  private String stateName;
  private Integer pincode;
  private String sscInstitute;
  private String sscBoard;
  private String sscGradingType;
  private Float sscPercentage;
  private Float sscGpa;
  private Integer sscyear;
  private String interInstitute;
  private String interBoard;
  private String interGradingType;
  private Float interPercentage;
  private Float interGpa;
  private Integer interyear;
  private String diplomaBranch;
  private String graduationCollege;
  private String otherGraduactionCollege;
  private String graduationUniversity;
  private String graduationType;
  private Integer graduationBranch;
  private String gradGradingType;
  private Integer graduationPercentage;
  private Float graduationGpa;
  private Integer graduationStartyear;
  private Integer graduationEndYear;
  private Integer graduationBacklog;
  private String pgCollege;
  private String otherpgCollege;
  private String pgUniversity;
  private String pgType;
  private Integer pgBranch;
  private String pgGradingType;
  private Float pgPercentage;
  private Float pgGpa;
  private Integer pgyear;
  private Integer pgBacklog;
  private String stream;
  private Integer graduationYear;
  private String branch;
  private String role;
  private String remarks;
  private Integer contractPeriod;
  private String renewalDate;
  private Integer batchProgramId;
  private String contractEndDate;
  private String path;
  private String ipAddress;
  private Timestamp logTime;
  private String collegeid;
  private String collegename;   
  private String phone;
  private String assigned_colleges;
	private String from;
	private String to;
	private String incollege;   
	private String outcollege;   
	private String intime;   
	private String outtime; 
	private String deviceid; 
	private String attendeeid;
	private String date;
	
	
	   
	
	    
	   
	
	
	    
  
       
     
     
  
  
  
     
  
  

public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

public String getAttendeeid() {
		return attendeeid;
	}

	public void setAttendeeid(String attendeeid) {
		this.attendeeid = attendeeid;
	}

public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

public String getIncollege() {   
		return incollege;
	}

	public void setIncollege(String incollege) {
		this.incollege = incollege;
	}

	public String getOutcollege() {
		return outcollege;
	}

	public void setOutcollege(String outcollege) {
		this.outcollege = outcollege;
	}

public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAssigned_colleges() {
	return assigned_colleges;
}

public void setAssigned_colleges(String assigned_colleges) {
	this.assigned_colleges = assigned_colleges;
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

public Timestamp getLogTime() {
	return logTime;
}

public void setLogTime(Timestamp logTime) {
	this.logTime = logTime;
}

public String getSecondrmstatus()
  {
    return this.secondrmstatus;
  }
  
  public void setSecondrmstatus(String secondrmstatus)
  {
    this.secondrmstatus = secondrmstatus;
  }
  
  public Double getLattitude()
  {
    return this.lattitude;
  }
  
  public void setLattitude(Double lattitude)
  {
    this.lattitude = lattitude;
  }
  
  public Double getLongitude()
  {
    return this.longitude;
  }
  
  public void setLongitude(Double longitude)
  {
    this.longitude = longitude;
  }
  
  public String getTraineeid()
  {
    return this.traineeid;
  }
  
  public void setTraineeid(String traineeid)
  {
    this.traineeid = traineeid;
  }
  
  public String getBatch()
  {
    return this.batch;
  }
  
  public void setBatch(String batch)
  {
    this.batch = batch;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public void setPath(String path)
  {
    this.path = path;
  }
  
  public String getIpAddress()
  {
    return this.ipAddress;
  }
  
  public void setIpAddress(String ipAddress)
  {
    this.ipAddress = ipAddress;
  }
  
  public static long getSerialversionuid()
  {
    return 1L;
  }
  
  public String getContractEndDate()
  {
    return this.contractEndDate;
  }
  
  public void setContractEndDate(String contractEndDate)
  {
    this.contractEndDate = contractEndDate;
  }
  
  public Integer getBatchProgramId()
  {
    return this.batchProgramId;
  }
  
  public void setBatchProgramId(Integer batchProgramId)
  {
    this.batchProgramId = batchProgramId;
  }
  
  public Integer getContractPeriod()
  {
    return this.contractPeriod;
  }
  
  public void setContractPeriod(Integer contractPeriod)
  {
    this.contractPeriod = contractPeriod;
  }
  
  public String getRenewalDate()
  {
    return this.renewalDate;
  }
  
  public void setRenewalDate(String renewalDate)
  {
    this.renewalDate = renewalDate;
  }
  
  public String getRemarks()
  {
    return this.remarks;
  }
  
  public void setRemarks(String remarks)
  {
    this.remarks = remarks;
  }
  
  public String getRole()
  {
    return this.role;
  }
  
  public void setRole(String role)
  {
    this.role = role;
  }
  
  public String getBranch()
  {
    return this.branch;
  }
  
  public void setBranch(String branch)
  {
    this.branch = branch;
  }
  
  public Integer getGraduationYear()
  {
    return this.graduationYear;
  }
  
  public void setGraduationYear(Integer graduationYear)
  {
    this.graduationYear = graduationYear;
  }
  
  public String getStream()
  {
    return this.stream;
  }
  
  public void setStream(String stream)
  {
    this.stream = stream;
  }
  
  public String getAddress()
  {
    return this.address;
  }
  
  public void setAddress(String address)
  {
    this.address = address;
  }
  
  public String getSscInstitute()
  {
    return this.sscInstitute;
  }
  
  public void setSscInstitute(String sscInstitute)
  {
    this.sscInstitute = sscInstitute;
  }
  
  public String getSscBoard()
  {
    return this.sscBoard;
  }
  
  public void setSscBoard(String sscBoard)
  {
    this.sscBoard = sscBoard;
  }
  
  public String getSscGradingType()
  {
    return this.sscGradingType;
  }
  
  public void setSscGradingType(String sscGradingType)
  {
    this.sscGradingType = sscGradingType;
  }
  
  public Float getSscPercentage()
  {
    return this.sscPercentage;
  }
  
  public void setSscPercentage(Float sscPercentage)
  {
    this.sscPercentage = sscPercentage;
  }
  
  public Float getSscGpa()
  {
    return this.sscGpa;
  }
  
  public void setSscGpa(Float sscGpa)
  {
    this.sscGpa = sscGpa;
  }
  
  public Integer getSscyear()
  {
    return this.sscyear;
  }
  
  public void setSscyear(Integer sscyear)
  {
    this.sscyear = sscyear;
  }
  
  public String getInterInstitute()
  {
    return this.interInstitute;
  }
  
  public void setInterInstitute(String interInstitute)
  {
    this.interInstitute = interInstitute;
  }
  
  public String getInterBoard()
  {
    return this.interBoard;
  }
  
  public void setInterBoard(String interBoard)
  {
    this.interBoard = interBoard;
  }
  
  public String getInterGradingType()
  {
    return this.interGradingType;
  }
  
  public void setInterGradingType(String interGradingType)
  {
    this.interGradingType = interGradingType;
  }
  
  public Float getInterPercentage()
  {
    return this.interPercentage;
  }
  
  public void setInterPercentage(Float interPercentage)
  {
    this.interPercentage = interPercentage;
  }
  
  public Float getInterGpa()
  {
    return this.interGpa;
  }
  
  public void setInterGpa(Float interGpa)
  {
    this.interGpa = interGpa;
  }
  
  public Integer getInteryear()
  {
    return this.interyear;
  }
  
  public void setInteryear(Integer interyear)
  {
    this.interyear = interyear;
  }
  
  public String getDiplomaBranch()
  {
    return this.diplomaBranch;
  }
  
  public void setDiplomaBranch(String diplomaBranch)
  {
    this.diplomaBranch = diplomaBranch;
  }
  
  public String getGraduationCollege()
  {
    return this.graduationCollege;
  }
  
  public void setGraduationCollege(String graduationCollege)
  {
    this.graduationCollege = graduationCollege;
  }
  
  public String getOtherGraduactionCollege()
  {
    return this.otherGraduactionCollege;
  }
  
  public void setOtherGraduactionCollege(String otherGraduactionCollege)
  {
    this.otherGraduactionCollege = otherGraduactionCollege;
  }
  
  public String getGraduationUniversity()
  {
    return this.graduationUniversity;
  }
  
  public void setGraduationUniversity(String graduationUniversity)
  {
    this.graduationUniversity = graduationUniversity;
  }
  
  public String getGraduationType()
  {
    return this.graduationType;
  }
  
  public void setGraduationType(String graduationType)
  {
    this.graduationType = graduationType;
  }
  
  public Integer getGraduationBranch()
  {
    return this.graduationBranch;
  }
  
  public void setGraduationBranch(Integer graduationBranch)
  {
    this.graduationBranch = graduationBranch;
  }
  
  public String getGradGradingType()
  {
    return this.gradGradingType;
  }
  
  public void setGradGradingType(String gradGradingType)
  {
    this.gradGradingType = gradGradingType;
  }
  
  public Integer getGraduationPercentage()
  {
    return this.graduationPercentage;
  }
  
  public void setGraduationPercentage(Integer graduationPercentage)
  {
    this.graduationPercentage = graduationPercentage;
  }
  
  public Float getGraduationGpa()
  {
    return this.graduationGpa;
  }
  
  public void setGraduationGpa(Float graduationGpa)
  {
    this.graduationGpa = graduationGpa;
  }
  
  public Integer getGraduationStartyear()
  {
    return this.graduationStartyear;
  }
  
  public void setGraduationStartyear(Integer graduationStartyear)
  {
    this.graduationStartyear = graduationStartyear;
  }
  
  public Integer getGraduationEndYear()
  {
    return this.graduationEndYear;
  }
  
  public void setGraduationEndYear(Integer graduationEndYear)
  {
    this.graduationEndYear = graduationEndYear;
  }
  
  public Integer getGraduationBacklog()
  {
    return this.graduationBacklog;
  }
  
  public void setGraduationBacklog(Integer graduationBacklog)
  {
    this.graduationBacklog = graduationBacklog;
  }
  
  public String getPgCollege()
  {
    return this.pgCollege;
  }
  
  public void setPgCollege(String pgCollege)
  {
    this.pgCollege = pgCollege;
  }
  
  public String getOtherpgCollege()
  {
    return this.otherpgCollege;
  }
  
  public void setOtherpgCollege(String otherpgCollege)
  {
    this.otherpgCollege = otherpgCollege;
  }
  public String getAssignedto()
	{
		return assignedto;
	}

	public void setAssignedto(String assignedto)
	{
		this.assignedto = assignedto;
	}
  
  public String getPgUniversity()
  {
    return this.pgUniversity;
  }
  
  public void setPgUniversity(String pgUniversity)
  {
    this.pgUniversity = pgUniversity;
  }
  
  public String getPgType()
  {
    return this.pgType;
  }
  
  public void setPgType(String pgType)
  {
    this.pgType = pgType;
  }
  
  public Integer getPgBranch()
  {
    return this.pgBranch;
  }
  
  public void setPgBranch(Integer pgBranch)
  {
    this.pgBranch = pgBranch;
  }
  
  public String getPgGradingType()
  {
    return this.pgGradingType;
  }
  
  public void setPgGradingType(String pgGradingType)
  {
    this.pgGradingType = pgGradingType;
  }
  
  public Float getPgPercentage()
  {
    return this.pgPercentage;
  }
  
  public void setPgPercentage(Float pgPercentage)
  {
    this.pgPercentage = pgPercentage;
  }
  
  public Float getPgGpa()
  {
    return this.pgGpa;
  }
  
  public void setPgGpa(Float pgGpa)
  {
    this.pgGpa = pgGpa;
  }
  
  public Integer getPgyear()
  {
    return this.pgyear;
  }
  
  public void setPgyear(Integer pgyear)
  {
    this.pgyear = pgyear;
  }
  
  public Integer getPgBacklog()
  {
    return this.pgBacklog;
  }
  
  public void setPgBacklog(Integer pgBacklog)
  {
    this.pgBacklog = pgBacklog;
  }
  
  public String getReligion()
  {
    return this.religion;
  }
  
  public void setReligion(String religion)
  {
    this.religion = religion;
  }
  
  public String getCategory()
  {
    return this.category;
  }
  
  public void setCategory(String category)
  {
    this.category = category;
  }
  
  public String getDoorno()
  {
    return this.doorno;
  }
  
  public void setDoorno(String doorno)
  {
    this.doorno = doorno;
  }
  
  public String getStreet()
  {
    return this.street;
  }
  
  public void setStreet(String street)
  {
    this.street = street;
  }
  
  public String getVillageName()
  {
    return this.villageName;
  }
  
  public void setVillageName(String villageName)
  {
    this.villageName = villageName;
  }
  
  public String getTaluk()
  {
    return this.taluk;
  }
  
  public void setTaluk(String taluk)
  {
    this.taluk = taluk;
  }
  
  public String getMandalName()
  {
    return this.mandalName;
  }
  
  public void setMandalName(String mandalName)
  {
    this.mandalName = mandalName;
  }
  
  public String getDistrictName()
  {
    return this.districtName;
  }
  
  public void setDistrictName(String districtName)
  {
    this.districtName = districtName;
  }
  
  public String getStateName()
  {
    return this.stateName;
  }
  
  public void setStateName(String stateName)
  {
    this.stateName = stateName;
  }
  
  public Integer getPincode()
  {
    return this.pincode;
  }
  
  public void setPincode(Integer pincode)
  {
    this.pincode = pincode;
  }
  
  public String getBankName()
  {
    return this.bankName;
  }
  
  public void setBankName(String bankName)
  {
    this.bankName = bankName;
  }
  
  public String getAccountNumber()
  {
    return this.accountNumber;
  }
  
  public void setAccountNumber(String accountNumber)
  {
    this.accountNumber = accountNumber;
  }
  
  public String getIfscCode()
  {
    return this.ifscCode;
  }
  
  public void setIfscCode(String ifscCode)
  {
    this.ifscCode = ifscCode;
  }
  
  public String getEmployeeId()
  {
    return this.employeeId;
  }
  
  public void setEmployeeId(String employeeId)
  {
    this.employeeId = employeeId;
  }
  
  public Integer getCourseId()
  {
    return this.courseId;
  }
  
  public void setCourseId(Integer courseId)
  {
    this.courseId = courseId;
  }
  
  public String getAssigned_to()
  {
    return this.assigned_to;
  }
  
  public void setAssigned_to(String assigned_to)
  {
    this.assigned_to = assigned_to;
  }
  
  public Integer getProgramId()
  {
    return this.programId;
  }
  
  public void setProgramId(Integer programId)
  {
    this.programId = programId;
  }
  
  public String getColumnName()
  {
    return this.columnName;
  }
  
  public void setColumnName(String columnName)
  {
    this.columnName = columnName;
  }
  
  public Date getRelievedDate()
  {
    return this.relievedDate;
  }
  
  public void setRelievedDate(Date relievedDate)
  {
    this.relievedDate = relievedDate;
  }
  
  public String getPhotoLocation()
  {
    return this.photoLocation;
  }
  
  public void setPhotoLocation(String photoLocation)
  {
    this.photoLocation = photoLocation;
  }
  
  public String getPlaceofwork1()
  {
    return this.placeofwork1;
  }
  
  public void setPlaceofwork1(String placeofwork1)
  {
    this.placeofwork1 = placeofwork1;
  }
  
  public String getLogUser()
  {
    return this.logUser;
  }
  
  public void setLogUser(String logUser)
  {
    this.logUser = logUser;
  }
  
  public String getGuid()
  {
    return this.guid;
  }
  
  public void setGuid(String guid)
  {
    this.guid = guid;
  }
  
  public String getGuardianName()
  {
    return this.guardianName;
  }
  
  public void setGuardianName(String guardianName)
  {
    this.guardianName = guardianName;
  }
  
  public String getDoj()
  {
    return this.doj;
  }
  
  public void setDoj(String doj)
  {
    this.doj = doj;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  
  public String getMobile()
  {
    return this.mobile;
  }
  
  public void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  

  
  public String getCollegeId() {
	return collegeId;
}

public void setCollegeId(String collegeId) {
	this.collegeId = collegeId;  
}
   
public String getCollegeName()
  {
    return this.collegeName;
  }
  
  public void setCollegeName(String collegeName)
  {
    this.collegeName = collegeName;
  }
  
  public String getProgramName()
  {
    return this.programName;
  }
  
  public void setProgramName(String programName)
  {
    this.programName = programName;
  }
  
  public String getCourseName()
  {
    return this.courseName;
  }
  
  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }
  
  public String getStatus_vf_hr()
  {
    return this.status_vf_hr;
  }
  
  public void setStatus_vf_hr(String status_vf_hr)
  {
    this.status_vf_hr = status_vf_hr;
  }
  
  public String getThirdrm()
  {
    return this.thirdrm;
  }
  
  public void setThirdrm(String thirdrm)
  {
    this.thirdrm = thirdrm;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public String getOfficialemailid()
  {
    return this.officialemailid;
  }
  
  public void setOfficialemailid(String officialemailid)
  {
    this.officialemailid = officialemailid;
  }
  
  public String getRenewalcontractenddate()
  {
    return this.renewalcontractenddate;
  }
  
  public void setRenewalcontractenddate(String renewalcontractenddate)
  {
    this.renewalcontractenddate = renewalcontractenddate;
  }
  
  public Integer getRenewalcontractperiod()
  {
    return this.renewalcontractperiod;
  }
  
  public void setRenewalcontractperiod(Integer renewalcontractperiod)
  {
    this.renewalcontractperiod = renewalcontractperiod;
  }
  
  public String getSecondrm()
  {
    return this.secondrm;
  }
  
  public void setSecondrm(String secondrm)
  {
    this.secondrm = secondrm;
  }
  
  public Integer getSno()
  {
    return this.sno;
  }
  
  public void setSno(Integer sno)
  {
    this.sno = sno;
  }
  
  public String getFirstrm()
  {
    return this.firstrm;
  }
  
  public void setFirstrm(String firstrm)
  {
    this.firstrm = firstrm;
  }
  
  public String getDateofjoining()
  {
    return this.dateofjoining;
  }
  
  public void setDateofjoining(String dateofjoining)
  {
    this.dateofjoining = dateofjoining;
  }
  
  public Date getCreation_datetime()
  {
    return this.creation_datetime;
  }
  
  public void setCreation_datetime(Date creation_datetime)
  {
    this.creation_datetime = creation_datetime;
  }
  
  public Integer getCollegecourseid()
  {
    return this.collegecourseid;
  }
  
  public void setCollegecourseid(Integer collegecourseid)
  {
    this.collegecourseid = collegecourseid;
  }
  
  public String getTransferDate()
  {
    return this.transferDate;
  }
  
  public void setTransferDate(String transferDate)
  {
    this.transferDate = transferDate;
  }
  
  public Timestamp getVerifiedTime()
  {
    return this.verifiedTime;
  }
  
  public void setVerifiedTime(Timestamp verifiedTime)
  {
    this.verifiedTime = verifiedTime;
  }
  
  public String getVerifiedBy()
  {
    return this.verifiedBy;
  }
  
  public void setVerifiedBy(String verifiedBy)
  {
    this.verifiedBy = verifiedBy;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public String getAssigned()
  {
    return this.assigned;
  }
  
  public void setAssigned(String assigned)
  {
    this.assigned = assigned;
  }
  
  public String getPlaceofwork()
  {
    return this.placeofwork;
  }
  
  public void setPlaceofwork(String placeofwork)
  {
    this.placeofwork = placeofwork;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getGender()
  {
    return this.gender;
  }
  
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  
  public String getDob()
  {
    return this.dob;
  }
  
  public void setDob(String dob)
  {
    this.dob = dob;
  }
  
  public String getDesignation()
  {
    return this.designation;
  }
  
  public void setDesignation(String designation)
  {
    this.designation = designation;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getAadharid()
  {
    return this.aadharid;
  }
  
  public void setAadharid(String aadharid)
  {
    this.aadharid = aadharid;
  }



}
