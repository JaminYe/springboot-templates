package com.cj.springboottemplates;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cj.springboottemplates.dao")
public class SpringbootTemplatesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootTemplatesApplication.class, args);
  }
}
