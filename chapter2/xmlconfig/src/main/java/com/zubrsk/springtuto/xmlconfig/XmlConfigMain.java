package com.zubrsk.springtuto.xmlconfig;

import com.zubrsk.springtuto.xmlconfig.media.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigMain {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-context.xml");
    CompactDisc cd = context.getBean("sgtPepper", CompactDisc.class);
    cd.play();
    context.close();
  }

}
