import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForestPause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestPause extends PauseMenuScreen
{
    public ForestPause(Map mapWorld, TrophyCollector lista)
    {
        prepare(mapWorld, new TrofeoBosque(this, lista));
    }
}
