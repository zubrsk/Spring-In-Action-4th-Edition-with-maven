package com.zubrsk.springtuto.demo.mediaplayer;

import com.zubrsk.springtuto.demo.media.CompactDisc;
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
