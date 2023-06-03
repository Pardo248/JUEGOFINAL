import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{
    Records records = new Records();
    protected TrophyCollector listaTrofeos = new TrophyCollector();
    
    public Map(int x, int y, int z)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,z); 
        prepare();
    }
    
    private void prepare(){

    }
}
