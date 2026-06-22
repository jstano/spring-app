package com.stano.springapp;

import com.stano.annotations.Generated;
import com.stano.spring_boot_application.MspSpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Generated("spring-boot")
@SpringBootApplication
public class SpringLauncher {
  public static void main(String[] args) {
    MspSpringApplication.run(SpringLauncher.class, args);
  }
}
