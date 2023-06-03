import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HadaBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HadaBoss extends Mob
{
    private World currentMap;
    private int trophySize;
    private Records records;
    public HadaBoss(ForestMap currentMap, int trophySize,Records records){
        this.currentMap = currentMap;
        this.records = records;
        //float[] records = currentMap.getRecords();
        this.trophySize = trophySize;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            BOSQUE bosqueMob = new BOSQUE(trophySize, 1, currentMap, this, records);
            Greenfoot.setWorld(bosqueMob);
        }
        
    }
}
