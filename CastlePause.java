import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastlePause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastlePause extends PauseMenuScreen
{
    public CastlePause(Map mapWorld, TrophyCollector lista)
    {
        prepare(mapWorld, new TrofeoCastillo(this, lista));
    }
}
