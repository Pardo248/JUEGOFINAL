import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Mob
{
    protected static final int DIRECTION_TOP = -1;
    protected static final int DIRECTION_BOTTOM = 1;
    protected static int OFFSET = 3;
    protected int direction = DIRECTION_TOP;
    
    private World currentMap;
    private TrophyCollector listatrofeo;
    private Records records;
    public Zombie(World currentMap, TrophyCollector listatrofeo,Records records){
        this.currentMap = currentMap;
        this.listatrofeo = listatrofeo;
        this.records = records;
    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            DESERT desertMob = new DESERT(listatrofeo.getSize(), 5, currentMap, this, records);
            Greenfoot.setWorld(desertMob);
        }
        
        switch(direction){
                case DIRECTION_TOP:
                    //setImage("RiverSlimeGirl (1).png");
                    setLocation(getX(), getY() + OFFSET);
                    if (isTouching(MobObstacle.class)){
                        direction *= -1;
                        setLocation(getX() - OFFSET, getY());
                    };
                    break;
                
                case DIRECTION_BOTTOM:
                    //setImage("RiverSlimeGirlLeft.png");
                    setLocation(getX(), getY() - OFFSET);
                    if (isTouching(MobObstacle.class)){
                        direction *= -1;
                        setLocation(getX() + OFFSET, getY());
                    };
                    break;
        }
    }
}
