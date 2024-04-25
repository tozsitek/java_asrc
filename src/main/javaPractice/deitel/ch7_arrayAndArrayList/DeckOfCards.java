package deitel.ch7_arrayAndArrayList;
import java.security.SecureRandom;

public class DeckOfCards {
  private static final SecureRandom randomNumbers = new SecureRandom();
  private static final int NUMBER_OF_CARDS = 52;
  private Card[] deck = new Card[NUMBER_OF_CARDS];
  private int currentCard = 0;

  //constructor fills deck of Cards
  public DeckOfCards(){
    String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
    //populate deck with Card objects
    for (int count = 0; count < deck.length; count++){
      deck[count] = new Card(faces[count % 13], suites[count / 13]);
    }
  }

  public void shuffle() {
    currentCard = 0;
    for(int first=0; first < deck.length; first++){
      int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
      //swap currect card with random
      Card temp = deck[first];
      deck[first] = deck[second];
      deck[second] = temp;
    }
  }

  public Card dealCard(){
    if (currentCard < deck.length){
      return deck[currentCard++];  // return current card in array
    }else{
      return null; // all cards were dealt
    }
  }




}
