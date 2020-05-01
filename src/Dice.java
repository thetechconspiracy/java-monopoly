/*
 * Written by Joseph Still
 * thetechconspiracy@outlook.com
 */

import java.util.Random;

public class Dice {
  Random rand;
  int die1, die2;
  boolean doubles;
  int diceSize;

  public Dice(){
    rand = new Random();
    die1 = die2 = 0;
    doubles = false;
    diceSize = 6;
  }

  public DiceRoll rollDice(){
    die1 = rand.nextInt() % diceSize;
    if (die1 < 0)// Convert to positive
      die1 *= -1;
    die1++;//Increment to get "real" number

    die2 = rand.nextInt() % diceSize;
    if(die2 < 0)
      die2 *= -1;
    die2++;

    return new DiceRoll(die1, die2);
  }

  public int getDiceSize(){ return this.diceSize; }
}
