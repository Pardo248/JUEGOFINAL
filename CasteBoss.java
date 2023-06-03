import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CasteBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasteBoss extends Mob
{
    private World currentMap;
    TrophyCollector listatrofeo;
    private Records records;
    public CasteBoss(World currentMap, TrophyCollector listatrofeo,Records records){
        this.currentMap = currentMap;
        this.listatrofeo = listatrofeo;
        this.records = records;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            CASTLE castleBoss = new CASTLE(listatrofeo.getSize(), 3, currentMap, this, records);
            Greenfoot.setWorld(castleBoss);
        }
    }
}
