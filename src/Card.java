/*
 * Written by Joseph Still
 * thetechconspiracy@outlook.com
 */

public class Card {
  String text;
  int effectID; //Cards effect.

  //TODO: create card effects

  public Card(String text, int effectID){
    if(this.effectID < 0 || this.effectID > CardEffects.getEffectsNum()) //Bounds checking
      return;
    this.text = text;
    this.effectID = effectID;
  }
}
