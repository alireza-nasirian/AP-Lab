/**
 * this class contain music information
 */
public class Music {

    private String title;
    private String address;
    private String artist;
    private int year;

    /**
     * Constructor for Music object
     * @param address where Music stored
     * @param artist the Singer of track
     * @param year Year of production
     */
    public Music(String title, String address, String artist, int year){
        this.title = title;
        this.address = address;
        this.artist = artist;
        this.year = year;
    }

    /**
     * @return the name of song
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the year of production
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the address of Music
     */
    public String getAddress() {
        return address;
    }

    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist() {
        return artist;
    }




}
