import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WINBOSQUE extends WIN
{

    /**
     * Constructor for objects of class WIN.
     * 
     */
    //private Boolean time = false;
    //MyWorld NewWorld = new MyWorld();
    public WINBOSQUE(float score,World currentWorld, Records records)
    {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(1200, 750, 1);
      PrintScore(score,currentWorld,records);
    }
}