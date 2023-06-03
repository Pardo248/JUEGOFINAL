import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPlayer extends CombatMode
{
    int health;
    Player player;
    
    int time = 0;
    float score;
    
    int enemyNumber;
    private World currentWorld;
    
    public void HealthPlayer(Player actualPlayer,int enemyNumber , World currentWorld ){
        
        player = actualPlayer;
        this.enemyNumber = enemyNumber;
        
        health = player.getHealth();
        this.currentWorld = currentWorld;
        
        setImage(new GreenfootImage(100,30));
        getImage().drawRect(0,0,98,29);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,28);
    }
    public void act()
    {
        setImage(new GreenfootImage(100,30));
        getImage().drawRect(0,0,98,29);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,99,28);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,28);
        
        time++;
    }
    public void LoseHeart(int damage){
        health = health - damage;
        if (health <= 0){
            LOSSE();
        }
    }
    public void GainHealth(int healthGain){
        health = health + healthGain;
    }
    public void LOSSE (){
        
        score = time / 1000;
        
        if ( enemyNumber == 1 || enemyNumber == 4){
            LOSEBOSQUE losse = new LOSEBOSQUE(score,currentWorld);
            Greenfoot.setWorld(losse);
         }else if( enemyNumber == 2 || enemyNumber == 5){
            LOSEDESERT losse = new LOSEDESERT(score,currentWorld);
            Greenfoot.setWorld(losse);
         }else if( enemyNumber == 3 || enemyNumber == 6){
            LOSECASTLE losse = new LOSECASTLE(score,currentWorld);
            Greenfoot.setWorld(losse);
         }
    }
}

