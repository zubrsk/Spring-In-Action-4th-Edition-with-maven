package com.zubrsk.config;

import com.zubrsk.knight.BraveKnight;
import com.zubrsk.knight.Knight;
import com.zubrsk.minstrel.Minstrel;
import com.zubrsk.quest.DragonSlayingQuest;
import com.zubrsk.quest.Quest;
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
