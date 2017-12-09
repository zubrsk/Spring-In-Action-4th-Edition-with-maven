package com.zubrsk.springtuto.xmlconfig.mediaplayer;

import com.zubrsk.springtuto.xmlconfig.media.CompactDisc;

public class CDPlayer implements MediaPlayer {

  private CompactDisc compactDisc;

  public CDPlayer(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }
}
