package com.zubrsk.springtuto.autoconfig.knight;

import com.zubrsk.springtuto.autoconfig.quest.Quest;

public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }


  public void embarkOnQuest() {
    quest.embark();
  }
}
