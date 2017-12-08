import com.zubrsk.springtuto.autoconfig.knight.BraveKnight;
import com.zubrsk.springtuto.autoconfig.knight.Knight;
import com.zubrsk.springtuto.autoconfig.quest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest quest = mock(Quest.class);
    Knight knight = new BraveKnight(quest);
    knight.embarkOnQuest();
    verify(quest, times(1)).embark();
  }
}
