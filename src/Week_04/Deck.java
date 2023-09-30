package Week_04;

import java.util.Random;
public class Deck {
    String suits[] = {"Club", "Diamonds", "Hearts", "Spades"};
    String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Cards cards[] = new Cards[52];

    Deck() {
        int counter = 0;
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                cards[counter++] = new Cards(suits[i], ranks[j]);
    }
        public void displayCards(){
                for(int i = 0; i < cards.length; i++)
                    System.out.println(cards[i]);

    }
    public void shuffle(){
        Random ran = new Random();
        for(int i = 0; i < 6000; i++){
            Cards temp = cards[0];
            int random = ran.nextInt(52);
            cards[0] = cards[random];
            cards[random] = temp;

        }

    }
}
