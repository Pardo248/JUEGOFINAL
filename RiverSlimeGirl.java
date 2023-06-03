import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RiverSlimeGirl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RiverSlimeGirl extends Mob
{
    protected static final int DIRECTION_RIGHT = 0;
    protected static final int DIRECTION_LEFT = 1;
    protected static int OFFSET = 1;
    protected int direction = DIRECTION_RIGHT;
    
    private World currentMap;
    private int trophySize;
    private Records records;
    public RiverSlimeGirl(World currentMap, int trophySize,Records records){
        this.currentMap = currentMap;
        this.trophySize = trophySize;
        this.records = records;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            BOSQUE bosqueMob = new BOSQUE(trophySize, 4, currentMap, this, records);
            Greenfoot.setWorld(bosqueMob);
        }
        
        switch(direction){
                case DIRECTION_RIGHT:
                    setImage("RiverSlimeGirl (1).png");
                    setLocation(getX() + OFFSET, getY());
                    if (isTouching(MobObstacle.class)){
                        direction = (int)(Math.random()*2);
                        setLocation(getX() - OFFSET, getY());
                    };
                    break;
                
                case DIRECTION_LEFT:
                    setImage("RiverSlimeGirlLeft.png");
                    setLocation(getX() - OFFSET, getY());
                    if (isTouching(MobObstacle.class)){
                        direction = (int)(Math.random()*2);
                        setLocation(getX() + OFFSET, getY());
                    };
                    break;
        }
    }
}
