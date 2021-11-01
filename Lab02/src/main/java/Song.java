public class Song {
    public String artist;
    public String title;
    public int duration;
    public static String collectionName;

    //constructor
    public Song(String artist, String title, int duration){
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    //puts all song info into one readable line
    public String toString(){
        int mins;
        int seconds;
        mins = this.duration / 60;
        seconds = this.duration % 60;

        return (this.title + " (" + this.artist + ") - " + mins + ":" + seconds);
    }

    //getters
    public String getArtist() {return this.artist;}
    public String getTitle() {return this.title;}
    public int getDuration() {return this.duration;}
    public String getCollectionName() {return this.collectionName;}

    //setters
    public void setArtist(String artist) {artist = this.artist;}
    public void setTitle(String title) {title = this.title;}
    public void setDuration(int duration) {duration = this.duration;}
    public void setCollectionName(String collectionName) {collectionName = this.collectionName;}


}
