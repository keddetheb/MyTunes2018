/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.be;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import mytunes.be.Playlist;
import mytunes.be.Song;
/**
 *
 * @author simge
 */
public class PlaylistModel
    {
    Playlist pl;
    private int currentSong;
    private boolean isPlaying;
    private MediaPlayer mediaPlayer;
    
    //file that contains song list
    File songlist = new File("");
    String path = songlist.getPath();

    public void createPlayList(String name)
        {
        pl = new Playlist(name);
        }

    //add a song to a playlist
    public void addSong(Song song)
        {
        //pl.getSongs().add(song);
        }

    //play a song in a playlist
    public void playSong(Song song)
        {
        Media hit = new Media(new File(songlist.getPath()).toURI().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        }

    //play next song in a playlist
    public void playNextSong(Song song)
        {
        if(!isPlaying)
        {
            currentSong = 0;
        }
        if(isPlaying)
        {
            currentSong++;
        }
        mediaPlayer.play();
        }

    //move a song in a playlist
    public void moveSong()
        {

        }

    //delete a song from a playlist
    public void deleteSong(Song song) throws FileNotFoundException
        {
        pl.getSongs().remove(song);
        }
    //save playlist in database
    public void savePlayList()
        {
        
        }

    //delete a playlist
    public void deletePlayList(Song song)
        {
        pl.getSongs().remove(song);
        
        }
    }
