package com.cj.springboottemplates.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jamin <br>
 * @date 2019/4/26 13:41<br>
 *     用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  /** 用户id */
  private Integer userId;
  /** 用户名 */
  private String userName;
  /** 用户密码 */
  private String userPassword;
}
