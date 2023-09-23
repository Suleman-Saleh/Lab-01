package Week_03;

public class Music {
    private String title;
    private Artist artist;

    private int duration;
    private String albumName;
    private Date releasedate;

    Music(String title, Artist artist, int duration, String albumName, Date releasedate){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.albumName = albumName;
        this.releasedate = releasedate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String toString(){
        String music = String.format("%-20s %-20s %-20d %-20s %-20s",title,artist,duration,albumName,releasedate);
        return music;
    }
    public boolean equals (Object o){
        Music ms = (Music) o;
        if (ms.getTitle().equals(this.title) && ms.getArtist().equals(this.artist)) {
            return true;
        }
        else
            return false;


    }
}
