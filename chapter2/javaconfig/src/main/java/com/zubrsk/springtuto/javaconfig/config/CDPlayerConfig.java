package com.zubrsk.springtuto.javaconfig.config;

import com.zubrsk.springtuto.javaconfig.media.CompactDisc;
import com.zubrsk.springtuto.javaconfig.media.SgtPeppers;
import com.zubrsk.springtuto.javaconfig.mediaplayer.CDPlayer;
import com.zubrsk.springtuto.javaconfig.mediaplayer.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }

  @Bean
  public MediaPlayer mediaPlayer() {
    return new CDPlayer(compactDisc());
  }

}
