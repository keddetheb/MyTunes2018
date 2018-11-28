/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTunes.be;

/**
 *
 * @author maxim
 */
public class Song
{
    private int id;
    private int releaseyear;
    private String title;
    
    /**
     *
     * @param id
     * @param title
     * @param releaseyear
     */
    public Song(int id, int releaseyear, String title)
    { 
        this.id = id;
        this.title = title;
        this.releaseyear = releaseyear;
        
    public int getId()
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public int getReleaseyear() 
    {
        return releaseyear;
    }
    
      public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setReleaseyear(int releaseyear) 
    {
        this.releaseyear = releaseyear;
    }
}
