package com.cj.springboottemplates.dao;

import com.cj.springboottemplates.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/26 13:44<br>
 *     用户dao层接口
 */
@Repository
public interface UserDao {
  /**
   * 查询所有用户
   *
   * @return user集合
   */
  List<User> getAllUser(@Param("userName") String userName);

  /**
   * 通过用户id查询用户信息
   *
   * @param userId
   * @return
   */
  User userUpload(@Param("userId") Integer userId);

  /**
   * 用户信息修改
   *
   * @param userName 用户名
   * @param userPassword 密码
   * @param userId 用户id
   * @return 修改行数
   */
  int userUpdate(
      @Param("userName") String userName,
      @Param("userPassword") String userPassword,
      @Param("userId") Integer userId);

  /**
   * 用户删除
   *
   * @param userId 用户id
   * @return int
   */
  int delUser(@Param("userId") Integer userId);

  /**
   * 添加用户
   *
   * @param userName 用户名
   * @param userPassword 密码
   * @return int
   */
  int userAdd(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
