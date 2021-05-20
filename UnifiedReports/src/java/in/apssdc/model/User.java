package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class User
  extends BaseModel
{
  private String username;
  private String password;
  private String fcmToken;
  private String roleid;
  private String deviceid;
  
  
   
  public String getDeviceid() {
	return deviceid;
}

public void setDeviceid(String deviceid) {
	this.deviceid = deviceid;
}

public String getRoleid() {
	return roleid;
}

public void setRoleid(String roleid) {
	this.roleid = roleid;
}

public String getFcmToken() {
	return fcmToken;
  }      

  public void setFcmToken(String fcmToken) {
	this.fcmToken = fcmToken;
 }

public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
}
