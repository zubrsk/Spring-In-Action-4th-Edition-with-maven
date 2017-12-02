package com.zubrsk;

import com.zubrsk.knight.BraveKnight;
import com.zubrsk.knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights.xml");
    Knight knight = applicationContext.getBean("knight", BraveKnight.class);
    knight.embarkOnQuest();
  }
}
