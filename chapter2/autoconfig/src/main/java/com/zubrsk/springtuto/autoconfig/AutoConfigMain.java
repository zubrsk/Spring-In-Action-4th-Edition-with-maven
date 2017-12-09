package com.zubrsk.springtuto.autoconfig;

import com.zubrsk.springtuto.autoconfig.config.CDPlayerConfig;
import com.zubrsk.springtuto.autoconfig.media.CompactDisc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfigMain {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    CompactDisc cd = context.getBean("sgtPeppers", CompactDisc.class);
    cd.play();
    context.close();
  }

}
