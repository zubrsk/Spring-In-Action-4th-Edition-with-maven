package com.zubrsk.springtuto.javaconfig;

import com.zubrsk.springtuto.javaconfig.media.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigMain {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-context.xml");
    //Bean name is same as function in CDPlayerConfig file.
    CompactDisc cd = context.getBean("compactDisc", CompactDisc.class);
    cd.play();
    context.close();
  }

}
