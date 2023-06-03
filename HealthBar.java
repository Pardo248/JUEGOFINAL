import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends CombatMode
{
    private int health;
    private Enemy enemy;
    private int enemyNumber;
    private World currentWorld;
    private int time = 0;
    private float score;
    private Mob callingMob;
    private Records records;
    
    public void HealthBar(Enemy enemy, int enemyNumber, World currentWorld, Mob callingMob , Records records){
        this.enemy = enemy;
        health = enemy.getHealth();
        this.enemyNumber = enemyNumber;
        this.currentWorld = currentWorld;
        this.callingMob = callingMob;
        this.records = records;
        
        setImage(new GreenfootImage(1003,12));
        getImage().drawRect(0,0,1002,11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
    }
    public void act()
    {
        setImage(new GreenfootImage(1003,12));
        getImage().drawRect(0,0,1002,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,1002,10);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
        
        time++;
    }
    public void LoseHeart(int damage){
        health = health - damage;
        if (health <= 0){
            WIN();
        }
    }
    public void WIN(){
        score = 100000 / time;
        
      
         if ( enemyNumber == 1 ){
             
            WINBOSQUE win = new WINBOSQUE(score,currentWorld,records);
            Greenfoot.setWorld(win);
         }else if( enemyNumber == 2 ){
            WINDESERT win = new WINDESERT(score,currentWorld,records);
            Greenfoot.setWorld(win);
         }else if( enemyNumber == 3 ){
            WINCASTLE win = new WINCASTLE(score,currentWorld,records);
            Greenfoot.setWorld(win);
         }else {
             currentWorld.removeObject(callingMob);
             Greenfoot.setWorld(currentWorld);
         }
        
    }
    public int getHealth(){
        return health;
    }
}
