import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WINCASTLE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WINCASTLE extends WIN
{

    /**
     * Constructor for objects of class WINCASTLE.
     * 
     */
    public WINCASTLE(float score,World currentWorld, Records records)
    {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(1200, 750, 1);
      PrintScore(score,currentWorld,records);
    }
}