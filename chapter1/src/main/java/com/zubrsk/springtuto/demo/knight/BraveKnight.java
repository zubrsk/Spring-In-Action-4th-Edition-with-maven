package com.zubrsk.springtuto.demo.knight;

import com.zubrsk.springtuto.demo.quest.Quest;

public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }


  public void embarkOnQuest() {
    quest.embark();
  }
}
