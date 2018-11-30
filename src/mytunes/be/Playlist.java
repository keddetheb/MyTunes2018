/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.be;

import java.util.List;

/**
 *
 * @author Kristian Bertelsen
 */
public class Playlist
    {
    private String name;
    private List<Song> songs;

    
    public Playlist(String name)
        {
        this.name = name;
        }
    public String getName()
        {
        return name;
        }
    public List<Song> getSongs()
        {
        return songs;
        }
    // beregner tiden fra listen af sange
    public double getTime()
        {
        return -1;
        }
    @Override
    public String toString()
        {
        return "Playlist{" + "name=" + name + ", songs=" + songs.size() + ", time=" + getTime() + '}';
        }
    }
