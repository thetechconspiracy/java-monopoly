/*
 * Written by Joseph Still
 * thetechconspiracy@outlook.com
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDice {
  @Test
  public void TestDiceRoll(){
    DiceRoll roll = new DiceRoll(5,5);
    assertTrue(roll.isDoubles());
    int[] expected = {5,5};
    assertEquals(expected[0], roll.getRoll()[0]);
    assertEquals(expected[1], roll.getRoll()[1]);
    assertEquals(10, roll.getSum());


    roll = new DiceRoll(3,5);
    assertFalse(roll.isDoubles());
    expected = new int[]{3, 5};
    assertEquals(expected[0], roll.getRoll()[0]);
    assertEquals(expected[1], roll.getRoll()[1]);
    assertEquals(8,roll.getSum());
  }

  @Test
  public void TestDice(){

  }
}
