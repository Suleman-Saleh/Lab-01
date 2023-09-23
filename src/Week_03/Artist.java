package Week_03;

public class Artist {
    private String name;
    private String nationality;
    private String ranking;

    Artist(String name, String nationality, String ranking){
        this.name = name;
        this.nationality = nationality;
        this.ranking = ranking;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String toString(){
        String artist = String.format("Name:%-20s Nationality:%-20s Ranking:%-20s",name,nationality,ranking);
        return artist;
    }
}

