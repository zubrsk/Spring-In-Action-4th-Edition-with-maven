package com.zubrsk.knight;

import com.zubrsk.quest.Quest;

public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }


  public void embarkOnQuest() {
    quest.embark();
  }
}
