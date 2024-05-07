package com.jpractice.javaPractice.deitel.ch7_arrayAndArrayList;

public class DeckOfCardsTest {

  public static void main(String[] args) {
    DeckOfCards myDeckOfCards = new DeckOfCards();
    myDeckOfCards.shuffle();

    for(int i = 0; i < 52; i++){
      System.out.println("Deal Card: " + myDeckOfCards.dealCard());
      if(i %4 == 0){
        System.out.println();
      }
    }
  }

}
