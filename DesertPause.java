import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesertPause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertPause extends PauseMenuScreen
{
    public DesertPause(Map mapWorld, TrophyCollector lista)
    {
        prepare(mapWorld, new TrofeoDesierto(this, lista));
    }
    
}
