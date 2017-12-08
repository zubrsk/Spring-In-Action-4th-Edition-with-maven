package com.zubrsk.springtuto.autoconfig;

import com.zubrsk.springtuto.autoconfig.knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
    Knight knight = applicationContext.getBean("knight", Knight.class);
    knight.embarkOnQuest();
    applicationContext.close();
  }
}
