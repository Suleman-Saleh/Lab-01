package Week_04;

public class Cards {
    final private String suits;
    final private String ranks;

    Cards(String suits, String ranks){
        this.suits = suits;
        this.ranks = ranks;
    }

    public String getSuits() {
        return suits;
    }

    public String getRanks() {
        return ranks;
    }

    public String toString(){
        return ranks + " of " + suits;
    }
}
