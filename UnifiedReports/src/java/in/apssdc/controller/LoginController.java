package in.apssdc.controller;

import com.andromeda.commons.model.Response;
import in.apssdc.model.EmployeeDetails;
import in.apssdc.model.Login;
import in.apssdc.model.User;
import in.apssdc.service.LoginService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/auth"})
public class LoginController
{
  @Autowired
  private LoginService loginService;
  
  @ResponseBody
  @RequestMapping(value={"loggedin"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Boolean isUserLoggedIn(@RequestBody Login login)
    throws JSONException
  {
    Boolean status = Boolean.valueOf(this.loginService.isUserLoggedIn(login));
    return status;
  }
  
  @ResponseBody
  @RequestMapping(value={"login"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response login(@RequestBody User user)
  {
    return this.loginService.login(user);
  } 
  
  @ResponseBody
  @RequestMapping(value={"logout"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public void logout(@RequestBody Login login)
  {
    this.loginService.logout(login);
  }
  
  @ResponseBody
  @RequestMapping(value={"deviceVerify"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response deviceVerify(@RequestBody Login login)
  {
    return this.loginService.deviceVerify(login);
  }
  
  @ResponseBody
  @RequestMapping(value={"insertDeviceId"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response insertDeviceId(@RequestBody Login login)
  {
    return this.loginService.insertDeviceId(login);
  }
  
  @ResponseBody
  @RequestMapping(value={"UpdateEmpBankDetails"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response UpdateEmpBankDetails(@RequestBody EmployeeDetails employeeDetails)
  {
    return this.loginService.UpdateEmpBankDetails(employeeDetails);
  }
     
  @ResponseBody
  @RequestMapping(value={"getFCMToken"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response getFCMToken(@RequestBody User user)
  {
    return this.loginService.getFCMToken(user);
  }
  
  @ResponseBody
  @RequestMapping(value={"updateFCM"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response updateFCM(@RequestBody User user)
  {
    return this.loginService.updateFCM(user);
  }
  
  @ResponseBody
  @RequestMapping(value={"UpdateEmpDetails"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
  public Response UpdateEmpDetails(@RequestBody EmployeeDetails employeeDetails)
  {
    return this.loginService.UpdateEmpDetails(employeeDetails);
  }
}
