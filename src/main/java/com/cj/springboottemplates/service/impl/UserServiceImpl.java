package com.cj.springboottemplates.service.impl;

import com.cj.springboottemplates.dao.UserDao;
import com.cj.springboottemplates.entity.User;
import com.cj.springboottemplates.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/26 13:48<br>
 *     用户service层接口实现
 */
@Service
public class UserServiceImpl implements UserService {
  @Resource private UserDao userDao;

  @Override
  public List<User> getAllUser(String userName) {
    return userDao.getAllUser(userName);
  }

  @Override
  public User userUpload(Integer userId) {
    return userDao.userUpload(userId);
  }

  @Override
  public int userUpdate(String userName, String userPassword, Integer userId) {
    return userDao.userUpdate(userName, userPassword, userId);
  }

  @Override
  public int delUser(Integer userId) {
    return userDao.delUser(userId);
  }

  @Override
  public int userAdd(User user) {
    return userDao.userAdd(user.getUserName(), user.getUserPassword());
  }
}
