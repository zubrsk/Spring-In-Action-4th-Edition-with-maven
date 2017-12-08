package com.zubrsk;

import com.zubrsk.config.CDPlayerConfig;
import com.zubrsk.media.CompactDisc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfigMain {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    CompactDisc cd = context.getBean("sgtPeppers", CompactDisc.class);
    cd.play();
    context.close();
  }

}
