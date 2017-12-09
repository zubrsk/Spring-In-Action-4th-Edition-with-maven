package com.zubrsk.springtuto.javaconfig.mediaplayer;

import com.zubrsk.springtuto.javaconfig.media.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {

  private CompactDisc compactDisc;

  @Autowired
  public CDPlayer(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }
}
