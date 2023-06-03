import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpearGirl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearGirl extends Mob
{
    private World currentMap;
    private TrophyCollector listatrofeo;
    private Records records;
    public SpearGirl(World currentMap, TrophyCollector listatrofeo,Records records){
        this.currentMap = currentMap;
        this.listatrofeo = listatrofeo;
        this.records = records;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            CASTLE castleMob = new CASTLE(listatrofeo.getSize(), 6, currentMap, this, records);
            Greenfoot.setWorld(castleMob);
        }
    }
}
