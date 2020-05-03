/*
 * Written by Joseph Still
 * thetechconspiracy@outlook.com
 */

public class Property {
  private String name;
  private int rent; //Rent when players land on property
  private int houses; //1-4, 5 is hotel
  private Player owner;

  /**
   * Constructor
   * @param name: Name of property
   * @param rent: Rent value of property
   */
  public Property (String name, int rent){
    //Validate input
    if(rent < 0)
      return;

    this.owner = null;
    this.houses = 0;
    this.name = name;
    this.rent = rent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRent() {
    return rent;
  }

  public void setRent(int rent) {
    this.rent = rent;
  }

  public int getHouses() {
    return houses;
  }

  public void setHouses(int houses) {
    this.houses = houses;
  }

  public Player getOwner() {
    return owner;
  }

  public void setOwner(Player owner) {
    this.owner = owner;
  }
}
