package com.zubrsk.knight;

import com.zubrsk.quest.DamselResqueQuest;

public class DemselResqueKnight implements Knight {

  private DamselResqueQuest damselResqueQuest;

  public void embarkOnQuest() {
    damselResqueQuest.embark();
  }
}
