import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSEBOSQUE extends LOSSE
{
    /**
     * Constructor for objects of class LOSE.
     * 
     */
    public LOSEBOSQUE(float score,World currentWorld)
    {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(1200, 750, 1);
      PrintScore(score,currentWorld);
    }
}