/* task
 * make a class song
 * make 4 provate property id title duration and artiset
 * make 2 public property album and dscription
 * make constructor to set title and duration only
 * make setter for id duration and artiset
 * make getter for id title duration and artisets
 * make 2 object of song
 * fill all the attributes
 * change the duration f 1st object
 * chanfe the artists of 2nd object
 * prrint the followign fr both object
 * OUTPUT
 * song1
 * title:abc
 * duration:1- artsts;xyz
 * album:xx
 * descripton:lorem ipsum
 * song2
 
 
 */

public class ConstructorReviseTask {
    public static void main(String[] args) {
        // Creating objects of Song class
        Song song1 = new Song("abc", 3);
        Song song2 = new Song("def", 4);
        
        // Filling attributes
        song1.setId(1);
        song1.setArtist("xyz");
        song1.setAlbum("xx");
        song1.setDescription("Lorem ipsum");
        
        song2.setId(2);
        song2.setArtist("pqr");
        song2.setAlbum("yy");
        song2.setDescription("Dolor sit amet");
        
        // Changing attributes
        song1.setDuration(2);
        song2.setArtist("mno");
        
        // Printing details
        System.out.println("song1");
        System.out.println("title: " + song1.getTitle());
        System.out.println("duration: " + song1.getDuration() + " - artists: " + song1.getArtist());
        System.out.println("album: " + song1.getAlbum());
        System.out.println("description: " + song1.getDescription());
        
        System.out.println("\nsong2");
        System.out.println("title: " + song2.getTitle());
        System.out.println("duration: " + song2.getDuration() + " - artists: " + song2.getArtist());
        System.out.println("album: " + song2.getAlbum());
        System.out.println("description: " + song2.getDescription());
    }

    
}

class Song{
    private int id;
    private String title;
    private int duration;
    private String artist;
    private String album;
    private String description;
    
    // Constructor to set title and duration only
    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    
    // Setter methods
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getAlbum() {
        return album;
    }
    
    public String getDescription() {
        return description;
    }
}
