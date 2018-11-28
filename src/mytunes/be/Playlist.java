/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.be;

/**
 *
 * @author Kristian Bertelsen
 */
public class Playlist
    {
    private String name;
    private int songs;
    private int time;
    
    public Playlist(String name, int songs, int time)
        {
        this.name = name;
        this.songs = songs;
        this.time = time;
        }
    public String getName()
        {
        return name;
        }
    public int getSongs()
        {
        return songs;
        }
    public int getTime()
        {
        return time;
        }
    @Override
    public String toString()
        {
        return "Playlist{" + "name=" + name + ", songs=" + songs + ", time=" + time + '}';
        }
    }
