/*
 * Written by Joseph Still
 * Description
 */

public class DiceRoll {
  private int sum;
  private int[] dice;
  private boolean doubles;

  public DiceRoll(int die1, int die2){
    dice = new int[2]; //Don't forget to init arrays!

    this.dice[0] = die1;
    this.dice[1] = die2;

    this.sum = die1+die2;

    if (die1 == die2)
      this.doubles = true;
    else
      this.doubles = false;
  }

  public int getSum(){ return this.sum; }
  public boolean isDoubles(){ return this.doubles; }
  public int[] getRoll(){ return this.dice; }
}
