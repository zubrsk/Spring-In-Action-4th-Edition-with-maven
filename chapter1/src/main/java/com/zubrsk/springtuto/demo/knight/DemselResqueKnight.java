package com.zubrsk.springtuto.demo.knight;

import com.zubrsk.springtuto.demo.quest.DamselResqueQuest;

public class DemselResqueKnight implements Knight {

  private DamselResqueQuest damselResqueQuest;

  public void embarkOnQuest() {
    damselResqueQuest.embark();
  }
}
