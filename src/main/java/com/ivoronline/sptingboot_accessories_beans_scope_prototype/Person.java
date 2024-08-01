package com.ivoronline.sptingboot_accessories_beans_scope_prototype;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person implements DisposableBean {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  //@PreDestroy
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
