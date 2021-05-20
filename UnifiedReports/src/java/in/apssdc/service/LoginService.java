package in.apssdc.service;

import com.andromeda.commons.model.Response;
import com.andromeda.commons.util.CryptoUtils;
import com.andromeda.commons.util.IDGenerator;
import in.apssdc.dao.LoginDAO;
import in.apssdc.dao.UserDAO;
import in.apssdc.model.Colleges;
import in.apssdc.model.Employee;
import in.apssdc.model.EmployeeDetails;
import in.apssdc.model.Login;
import in.apssdc.model.User;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LoginService
{
  Response response = new Response();
  private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
  @Autowired
  private LoginDAO loginDAO;
  @Autowired
  private UserDAO userDAO;
  
  public boolean isUserLoggedIn(Login login)
  {     
    boolean status = false;
    Login result;
    if ((!StringUtils.isEmpty(login.getUserName())) && (!StringUtils.isEmpty(login.getContext())) && 
      ((result = this.loginDAO.getLoginByUserContext(login)) != null)) {
      status = true;
    }      
    logger.info("isUserLoggedIn userName={}, context={}, status={}", 
      new Object[] { login.getUserName(), login.getContext(), Boolean.valueOf(status) });
    return status;
  }   
    
  public Response login(User user)  
  {
    Timestamp logTime = new Timestamp(System.currentTimeMillis());
    this.response.setSuccessful(false);
    if ((user != null) && (!StringUtils.isEmpty(user.getUsername())) && 
      (!StringUtils.isEmpty(user.getPassword())))
    {   
      
      User result = this.userDAO.getUserByCredentials(user);
      //System.out.println("=====>User: " + user);
      if ((result != null) && (result.getUsername().equals(user.getUsername())))
      {
    	Map<String, Object> mapObj = new HashMap<String, Object>(); 
    	Employee data = loginDAO.getUserDetails(user);
    	 	
    	Login login = new Login(user.getUsername(), IDGenerator.getUniqueID(), logTime);
    	login.setRoleid(Integer.parseInt(result.getRoleid()));
        this.loginDAO.add(login);
        this.response.setSuccessful(true);
        mapObj.put("empData", data);
        mapObj.put("loginData", login); 
       
      
        this.response.setResponseObject(mapObj);
      }
      else  
      {   
        this.response.setSuccessful(false);
        this.response.setErrorMessage("Invalid credentials");
      }
    }
    else
    {
      this.response.setSuccessful(false);
      this.response.setErrorMessage("User does not exist");
    }
    return this.response;
  }
  
  public void logout(Login login)
  {
    this.loginDAO.delete(login);
  }
  
  public Response deviceVerify(Login login)
  {
    this.response.setSuccessful(false);
    String dataModel = this.loginDAO.deviceVerify(login);
    this.response.setResponseObject(dataModel);
    this.response.setSuccessful(true);
    return this.response;
  }
  
  public Response insertDeviceId(Login login)
  {
    this.response.setSuccessful(false);
    boolean result = this.loginDAO.insertDeviceId(login);
    this.response.setSuccessful(result);
    return this.response;
  }
  
  public Response UpdateEmpBankDetails(EmployeeDetails employeeDetails)
  {
    this.response.setSuccessful(false);
    boolean result = this.loginDAO.UpdateEmpBankDetails(employeeDetails);
    this.response.setSuccessful(result);
    return this.response;
  }
  
  public Response getFCMToken(User user)
  {
    this.response.setSuccessful(false);
    String result = this.userDAO.getFCMToken(user);
    if (result != null) {
      this.response.setSuccessful(true);
    } else {
      this.response.setSuccessful(false);
    }
    this.response.setRequestObject(result);
    return this.response;
  }
  
  public Response updateFCM(User user)
  {
    this.response.setSuccessful(false);
    boolean result = this.userDAO.updateFCM(user);
    this.response.setSuccessful(result);
    return this.response;
  }
  
  public Response UpdateEmpDetails(EmployeeDetails employeeDetails)
  {
    this.response.setSuccessful(false);
    boolean result = this.loginDAO.UpdateEmpDetails(employeeDetails);
    this.response.setSuccessful(result);
    return this.response;
  }
}
