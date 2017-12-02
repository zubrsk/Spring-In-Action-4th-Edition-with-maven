package com.zubrsk.quest;

import java.io.PrintStream;

public class DragonSlayingQuest implements Quest {

  private PrintStream printStream;

  public DragonSlayingQuest(PrintStream out) {
    printStream = out;
  }

  public void embark() {
    printStream.println("Dragon slayed");
  }
}
