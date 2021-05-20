package in.apssdc.dao;

import com.andromeda.commons.dao.BaseDAO;

import in.apssdc.model.Colleges;
import in.apssdc.model.Employee;
import in.apssdc.model.EmployeeDetails;
import in.apssdc.model.Login;
import in.apssdc.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

@Repository
public class LoginDAO
  extends BaseDAO   
{
  public void add(Login login)
  {
    Map<String, Login> params = new HashMap();
    params.put("p", login);
    this.sqlSessionTemplate.insert("Login.Add", params);
  }
  
  public Employee getUserDetails(User login)
  {
    List<Employee> data = null;
    Employee result = null;
    Map<String, Object> params = new HashMap();
    params.put("p", login);
    
    data = this.sqlSessionTemplate.selectList("Login.GetDetails", params);
    if (!CollectionUtils.isEmpty(data)) {
      result = (Employee)data.get(0);
    }
    return result;
  }
     
  public Login getLoginByUserContext(Login login)       
  {
    Map<String, Login> params = new HashMap();
    params.put("p", login);
    List<Login> logins = this.sqlSessionTemplate.selectList("Login.GetLoginByUserContext", params);
    Login result = null;
    if (!CollectionUtils.isEmpty(logins)) {
      result = (Login)logins.get(0);
    }
    return result;
  }
  
  public void delete(Login login)
  {
    Map<String, Login> params = new HashMap();
    params.put("p", login);
    this.sqlSessionTemplate.delete("Login.Delete", params);
  }
  
  public String deviceVerify(Login login)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", login);
    String deviceId = null;
    try
    {
      deviceId = (String)this.sqlSessionTemplate.selectOne("Login.DeviceVerify", params);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return deviceId;
  }
  
  public boolean insertDeviceId(Login login)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", login);
    boolean status = false;
    int i = 0;   
    i = this.sqlSessionTemplate.update("Login.updateDeviceId", params);
    if (i != 0) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }   
  
  public boolean UpdateEmpBankDetails(EmployeeDetails employeeDetails)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", employeeDetails);
    boolean status = false;
    int i = 0;
    i = this.sqlSessionTemplate.update("Login.UpdateEmpBankDetails", params);
    if (i != 0) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }
  
  public boolean UpdateEmpDetails(EmployeeDetails employeeDetails)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", employeeDetails);
    boolean status = false;
    int i = 0;
    i = this.sqlSessionTemplate.update("Login.updateEmpDetails", params);
    if (i != 0) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }

	public List<Colleges> getCollege(String collegeid) {
		
		List<Colleges> logins = this.sqlSessionTemplate.selectList("Login.GetColleges", collegeid); 
		return logins;
	}
}
