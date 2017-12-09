package com.zubrsk.springtuto.demo.config;

import com.zubrsk.springtuto.demo.knight.BraveKnight;
import com.zubrsk.springtuto.demo.knight.Knight;
import com.zubrsk.springtuto.demo.minstrel.Minstrel;
import com.zubrsk.springtuto.demo.quest.DragonSlayingQuest;
import com.zubrsk.springtuto.demo.quest.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Quest quest() {
    return new DragonSlayingQuest(System.out);
  }

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  @Bean
  public Minstrel minstrel() {
    return new Minstrel(System.out);
  }
}
