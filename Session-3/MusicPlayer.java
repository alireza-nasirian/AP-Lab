

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * @author Alireza Nasirian
 * @version 2.0
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param music The file to be played.
     */
    public void startPlaying(Music music)
    {
        System.out.println(music.getTitle() + " is playing...");
        isPlaying = true;
    }

    /**
     * stop playing the music.
     */
    public void stop()
    {
        System.out.println("player is stopped!");
        isPlaying = false;
    }



}