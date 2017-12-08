package com.zubrsk;

import com.zubrsk.knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
    Knight knight = applicationContext.getBean("knight", Knight.class);
    knight.embarkOnQuest();
    applicationContext.close();
  }
}
