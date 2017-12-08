import com.zubrsk.knight.BraveKnight;
import com.zubrsk.knight.Knight;
import com.zubrsk.quest.Quest;
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
