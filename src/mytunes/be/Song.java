/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.be;

/**
 *
 * @author maxim
 */
public class Song
{
    private int id;
    private int releaseyear;
    private double time;
    private String title;
    private String genre;
    private String artist;
    
    /**
     *
     * @param id
     * @param title
     * @param releaseyear
     * @param genre
     * @param time
     */
    public Song(int id, int releaseyear, double time, String title, String genre, String artist)
    { 
        this.id = id;
        this.title = title;
        this.releaseyear = releaseyear;
        this.genre = genre;
        this.time = time;
        this.artist = artist;
    }

    Song(int releaseyear, double time, String title, String genre, String artist)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId()
    {
        return id;
    }

    public int getReleaseyear() 
    {
        return releaseyear;
    }
    
    public double getTime()
    {
        return time;
    }
    public String getGenre()
    {
        return genre;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getArtist() 
    {
        return artist;
    }
    
    public void setId(int id) 
    {
        this.id = id;
    }
    
    public void setReleaseyear(int releaseyear) 
    {
        this.releaseyear = releaseyear;
    }
    
    public void setTime(double time) 
    {
        this.time = time;
    }
    
    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
    
    public void setTitle(String title) 
    {
        this.title = title;
    }
    
    public void setArtist(String artist) 
    {
        this.artist = artist;
    }
    
    @Override
   public String toString()
        {
        return "Song{" + "id" + id + ", releaseyear" + releaseyear + ", time" + time + ", title" + title + ", genre" + genre + ", artist" + artist + '}';
        }
}
