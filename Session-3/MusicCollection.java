import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author Alireza Nasirian
 * @version 2
 */
public class MusicCollection
{
    private ArrayList<Music> musics;
    private ArrayList<Music> favorite;
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        musics = new ArrayList<Music>();
        favorite = new ArrayList<Music>();
        player = new MusicPlayer();

    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        musics.add(music);
    }

    /**
     * Add a file to favorite list
     * @param music The file to be added.
     */
    public void addFavorite(Music music){
        favorite.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return musics.size();

    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.print("Music " + index + ": ");
        Music music = musics.get(index);
        System.out.println(music.getTitle()+"-artist: "+music.getArtist()+"-Year of production: "+music.getYear());

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("Track listing: ");
        for (Music music : musics){
            System.out.println(music.getTitle()+"-artist: "+music.getArtist()+"-Year of production: "+music.getYear());
        }
        System.out.println();
    }

    /**
     * Show a list of all the favorite musics.
     */
    public void listAllFavorite(){
        System.out.println("Favorite Songs: ");
        for (Music music : favorite){
            System.out.println(music.getTitle()+"-artist: "+music.getArtist()+"-Year of production: "+music.getYear());
        }
        System.out.println();
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)){
            musics.remove(index);
        }
    }

    /**
     * Remove a file from the favorite list.
     * @param index The index of the file to be removed.
     */
    public void removeFileFavorite(int index)
    {
        if(validIndex(index)){
            favorite.remove(index);
        }
    }


    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(musics.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        boolean valid;
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= musics.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }

    /**
     * finds music with name or address and shows information of music.
     * @param name name or address of music that we want to find.
     */
    public void search(String name){
        Iterator<Music> it = musics.iterator();
        while (it.hasNext()){
            Music music = it.next();
            String title = music.getTitle();
            String address = music.getAddress();
            if (title.equals(name)||address.equals(name)){
                System.out.println(music.getTitle()+"-artist: "+music.getArtist()+"-Year of production: "+music.getYear());
                break;
            }
        }
    }
}

