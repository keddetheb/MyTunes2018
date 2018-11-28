/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myTunes.be.Song;

/**
 *
 * @author simge
 */
public class SongModel
    {
            
    //create a new song
    public void createNewSong(int year, String title)
        {
            Song song = new Song(2, 2016, My Love);
            Song.add(song);
        }
    //edit a song
    //save songlist in database
    //delete a song
    public void deleteSong()
        {
        
        }
    }

