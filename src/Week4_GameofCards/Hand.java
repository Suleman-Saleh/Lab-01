package Week4_GameofCards;

import java.util.Arrays;

public class Hand {
    private final int MAX_CARDS = 5;
    private final Card[] cardsInhand;

    private int currentsize = 0;

    public Hand() {
        cardsInhand = new Card[MAX_CARDS];
    }
    public void addCard(Card card){
        if(currentsize < MAX_CARDS){
            cardsInhand[currentsize++] = card;
        }
    }
    public Card playCard(int index){
        if(index >= 0 && index < currentsize){
            Card card = cardsInhand[index];
            for(int i = index ; i < currentsize - 1; i++){
                cardsInhand[i] = cardsInhand[i+1];
            }
            cardsInhand[currentsize--] = null;
            return card;
        }
        return null;
    }
    public Card[] getCards() {
        Card[] currentCards = new Card[currentsize];
        System.arraycopy(cardsInhand, 0, currentCards, 0, currentsize);
        return currentCards;
    }
}
