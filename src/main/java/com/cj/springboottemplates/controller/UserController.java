package com.cj.springboottemplates.controller;

import com.cj.springboottemplates.entity.User;
import com.cj.springboottemplates.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/26 13:50<br>
 *     用户controller层
 */
@Controller
public class UserController {
  @Resource private UserService userService;

  /**
   * 查询所有用户
   *
   * @param model 存储数据模型
   * @return pageUsers页面
   */
  @RequestMapping("getAll")
  public String getAllUser(
      Model model, @RequestParam(value = "userName", required = false) String userName) {
    List<User> Users = userService.getAllUser(userName);
    model.addAttribute("users", Users);
    return "pageUsers";
  }

  /**
   * 用户修改前的回显
   *
   * @param userId
   * @return 修改页面
   */
  @RequestMapping("userUpload")
  public String userUpload(@RequestParam Integer userId, Model model) {
    User user = userService.userUpload(userId);
    model.addAttribute("User", user);
    return "updateUser";
  }

  /**
   * 用户修改
   *
   * @param user
   * @return
   */
  @ResponseBody
  @RequestMapping("userUpdate")
  public Integer userUpdate(User user) {
    return userService.userUpdate(user.getUserName(), user.getUserPassword(), user.getUserId());
  }

  /**
   * 删除用户
   *
   * @param userId 用户id
   * @return int
   */
  @ResponseBody
  @RequestMapping("userDel")
  public Integer userDel(@RequestParam Integer userId) {
    return userService.delUser(userId);
  }

  /**
   * 添加用户
   *
   * @param user 用户对象
   * @return int
   */
  @ResponseBody
  @RequestMapping("userAdd")
  public Integer userAdd(User user) {
    int i = userService.userAdd(user);
    return i;
  }

  @RequestMapping("toAddUser")
  public String toAddUser() {
    return "addUser";
  }
}
