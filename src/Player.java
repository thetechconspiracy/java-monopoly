/*
 * Written by Joseph Still
 * thetechconspiracy@outlook.com
 */

public interface Player {
  public void setName(String name);
  public String getName();

  public void setTokenIndex(int index);
  public int getTokenIndex();

  /**
   * Sets the players money
   * @param money: Amount of money to set money as
   */
  public void setMoney(int money);

  /**
   * Gets the current amount of money
   * @return: value of money
   */
  public int getMoney();

  /**
   * Adds a specified amount of money to the players total
   * @param money: Amount of money to add
   */
  public void addMoney(int money);
  /**
   * Subtracts a specified amount of money from the players total
   * @param money: Amount of money to subtract
   */
  public void subMoney(int money);
  /**
   * Adds a specified percentage of money to the players total
   * @param percentage: Percentage to add multiplied by 100
   */
  public void addPercentMoney(int percentage);
  /**
   * Subtracts a specified percentage of money from the players total
   * @param percentage: Percentage to subtract multiplied by 100
   */
  public void subPercentMoney(int percentage);

  /**
   * Gets the net worth of a player
   * @return: Net worth
   */
  public int getNetWorth();

}
