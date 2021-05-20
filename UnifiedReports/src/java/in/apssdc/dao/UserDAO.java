package in.apssdc.dao;

import com.andromeda.commons.dao.BaseDAO;
import in.apssdc.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

@Repository
public class UserDAO
  extends BaseDAO
{
  public User get(String userName)
  {
    List<User> users = this.sqlSessionTemplate.selectList("User.GetUsers");
    User user = null;
    if (!CollectionUtils.isEmpty(users)) {
      user = (User)users.get(0);
    }
    return user;
  }
  
  public User getUserByCredentials(User user)
  {
    User result = null;
    HashMap<String, Object> params = new HashMap();
    params.put("p", user);
    List<User> users = this.sqlSessionTemplate.selectList("User.GetUserByCredentials", params);
    if (!CollectionUtils.isEmpty(users)) {
      result = (User)users.get(0);
    }
    return result;
  }
  
  public String getFCMToken(User user)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", user);
    String token = (String)this.sqlSessionTemplate.selectOne("User.verifyToken", params);
    if (token != null) {
      return token;
    }
    return null;
  }
  
  public boolean updateFCM(User user)
  {
    Map<String, Object> params = new HashMap();
    params.put("p", user);
    int i = 0;
    boolean status = false;
    i = this.sqlSessionTemplate.update("User.updateToken", params);
    if (i != 0) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }
}
