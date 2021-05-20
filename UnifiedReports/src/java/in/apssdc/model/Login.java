package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;
import java.sql.Timestamp;

public class Login
  extends BaseModel
{
  private String userName;
  private String context;
  private Timestamp logTime;
  private String deviceId;
  private Integer roleid;
  
  
  public Login() {}
  
  public Login(String userName, String context, Timestamp logTime)
  {
    this.userName = userName;
    this.context = context;
    this.logTime = logTime;
  }
  
  
  
  public Integer getRoleid() {
	return roleid;
}

public void setRoleid(Integer roleid) {
	this.roleid = roleid;
}

public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public String getContext()
  {
    return this.context;
  }
  
  public void setContext(String context)
  {
    this.context = context;
  }
  
  public Timestamp getLogTime()
  {
    return this.logTime;
  }
  
  public void setLogTime(Timestamp logTime)
  {
    this.logTime = logTime;
  }
  
  public String getDeviceId()
  {
    return this.deviceId;
  }
  
  public void setDeviceId(String deviceId)
  {
    this.deviceId = deviceId;
  }
}
