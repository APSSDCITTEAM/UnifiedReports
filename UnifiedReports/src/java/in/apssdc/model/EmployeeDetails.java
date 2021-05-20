package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class EmployeeDetails
  extends BaseModel
{
  private String photoUrl;
  private String name;
  private String email;   
  private String mobile;
  private String gender;
  private String dob;
  private String guardianName;
  private String aadharId;
  private String officialEmail;
  private String traineeid;
  private String designation;
  private String placeofwork;
  private String assigned_to;
  private String role;
  private Double latitude;
  private Double longitude;
  private String imeiNumber;
  private String leaveStatus;
  private String bankName;
  private String ifscCode;
  private String accountNumber;
  
  public String getAadharId()
  {
    return this.aadharId;
  }
  
  public void setAadharId(String aadharId)
  {
    this.aadharId = aadharId;
  }
  
  public Double getLatitude()
  {
    return this.latitude;
  }
  
  public void setLatitude(Double latitude)
  {
    this.latitude = latitude;
  }
  
  public Double getLongitude()
  {
    return this.longitude;
  }
  
  public void setLongitude(Double longitude)
  {
    this.longitude = longitude;
  }
  
  public String getImeiNumber()
  {
    return this.imeiNumber;
  }
  
  public void setImeiNumber(String imeiNumber)
  {
    this.imeiNumber = imeiNumber;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getMobile()
  {
    return this.mobile;
  }
  
  public void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  
  public String getDesignation()
  {
    return this.designation;
  }
  
  public void setDesignation(String designation)
  {
    this.designation = designation;
  }
  
  public String getTraineeid()
  {
    return this.traineeid;
  }
  
  public void setTraineeid(String traineeid)
  {
    this.traineeid = traineeid;
  }
  
  public String getPlaceofwork()
  {
    return this.placeofwork;
  }
  
  public void setPlaceofwork(String placeofwork)
  {
    this.placeofwork = placeofwork;
  }
  
  public String getAssigned_to()
  {
    return this.assigned_to;
  }
  
  public void setAssigned_to(String assigned_to)
  {
    this.assigned_to = assigned_to;
  }
  
  public String getDob()
  {
    return this.dob;
  }
  
  public void setDob(String dob)
  {
    this.dob = dob;
  }
  
  public String getGender()
  {
    return this.gender;
  }
  
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  
  public String getLeaveStatus()
  {
    return this.leaveStatus;
  }
  
  public void setLeaveStatus(String leaveStatus)
  {
    this.leaveStatus = leaveStatus;
  }
  
  public String getRole()
  {
    return this.role;
  }
  
  public void setRole(String role)
  {
    this.role = role;
  }
  
  public String getGuardianName()
  {
    return this.guardianName;
  }
  
  public void setGuardianName(String guardianName)
  {
    this.guardianName = guardianName;
  }
  
  public String getOfficialEmail()
  {
    return this.officialEmail;
  }
  
  public void setOfficialEmail(String officialEmail)
  {
    this.officialEmail = officialEmail;
  }
  
  public String getBankName()
  {
    return this.bankName;
  }
  
  public void setBankName(String bankName)
  {
    this.bankName = bankName;
  }
  
  public String getIfscCode()
  {
    return this.ifscCode;
  }
  
  public void setIfscCode(String ifscCode)
  {
    this.ifscCode = ifscCode;
  }
  
  public String getAccountNumber()
  {
    return this.accountNumber;
  }
  
  public void setAccountNumber(String accountNumber)
  {
    this.accountNumber = accountNumber;
  }
  
  public String getPhotoUrl()
  {
    return this.photoUrl;
  }
  
  public void setPhotoUrl(String photoUrl)
  {
    this.photoUrl = photoUrl;
  }
}
