package Week4_GameofCards;

import java.util.Random;

public class Deck {
     private static final int DECK_SIZE = 52;
     private final Card[] card ;
     private int topCardIndex;

    public Deck(){
         card = new Card[DECK_SIZE];
         initializeDeck();
         shuffle();
     }
     private void initializeDeck(){
         int index = 0;
         for(Suit suit : Suit.values()){
             for(Rank rank : Rank.values()){
               //  card[index++] = new Card(String suit,String rank);
             }
         }
     }
     public void shuffle(){
         Random rand = new Random();
         for(int i = DECK_SIZE - 1; i > 0; i--){
             int j = rand.nextInt(i+1);
             Card temp = card[i];
             card[i] = card[j];
             card[j] = temp;
         }
         topCardIndex = 0;
     }
     public Card dealCard(){
        return topCardIndex < DECK_SIZE ? card[topCardIndex++] : null;
     }



}
