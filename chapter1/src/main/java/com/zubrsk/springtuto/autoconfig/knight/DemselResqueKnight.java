package com.zubrsk.springtuto.autoconfig.knight;

import com.zubrsk.springtuto.autoconfig.quest.DamselResqueQuest;

public class DemselResqueKnight implements Knight {

  private DamselResqueQuest damselResqueQuest;

  public void embarkOnQuest() {
    damselResqueQuest.embark();
  }
}
