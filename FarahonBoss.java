import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FarahonBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FarahonBoss extends Mob
{
    private World currentMap;
    private TrophyCollector listatrofeo;
    private Records records;
    public FarahonBoss(World currentMap, TrophyCollector listatrofeo,Records records){
        this.currentMap = currentMap;
        this.listatrofeo = listatrofeo;
        this.records = records;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            DESERT desertMob = new DESERT(listatrofeo.getSize(), 2, currentMap, this, records);
            Greenfoot.setWorld(desertMob);
        }
    }
}
