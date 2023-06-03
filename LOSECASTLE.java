import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOSECASTLE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSECASTLE extends LOSSE
{

    /**
     * Constructor for objects of class LOSECASTLE.
     * 
     */
    public LOSECASTLE(float score,World currentWorld)
    {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(1200, 750, 1);
      PrintScore(score,currentWorld);
    }
}