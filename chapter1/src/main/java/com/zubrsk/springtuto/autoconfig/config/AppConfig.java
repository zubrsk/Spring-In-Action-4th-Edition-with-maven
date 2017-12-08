package com.zubrsk.springtuto.autoconfig.config;

import com.zubrsk.springtuto.autoconfig.knight.BraveKnight;
import com.zubrsk.springtuto.autoconfig.knight.Knight;
import com.zubrsk.springtuto.autoconfig.minstrel.Minstrel;
import com.zubrsk.springtuto.autoconfig.quest.DragonSlayingQuest;
import com.zubrsk.springtuto.autoconfig.quest.Quest;
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
