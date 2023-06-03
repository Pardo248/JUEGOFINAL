import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DESERT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DESERT extends CombatMap
{
    /**
     * Constructor for objects of class DESERT.
     * 
     */
    public DESERT(int trofeos,int enemy, World currentMap, Mob callingMob,Records records){    
        super(1200, 750, 1);// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        Prepare(trofeos,enemy,currentMap, callingMob, records);
    }
}
