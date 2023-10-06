package Week4_GameofCards;

public class Card {
   final String rank;
   final String suit;

   Card(String rank, String suit){
       this.rank = String.valueOf(rank);
       this.suit = String.valueOf(suit);
   }
   public String getRank(){
       return rank;
   }

   public String getSuit(){
       return suit;
   }

   @Override
    public String toString(){
       return rank +" of "+ suit;
   }

}
