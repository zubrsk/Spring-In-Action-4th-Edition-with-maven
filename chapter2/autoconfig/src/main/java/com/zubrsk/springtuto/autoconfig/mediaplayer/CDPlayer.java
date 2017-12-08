package com.zubrsk.springtuto.autoconfig.mediaplayer;

import com.zubrsk.springtuto.autoconfig.media.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

  @Autowired
  private CompactDisc compactDisc;

  public void play() {
    compactDisc.play();
  }
}
