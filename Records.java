import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends Actor
{
    float[] records = new float[3];
    String[] nombres = new String[3];
    
    public void act()
    {
        // Add your action code here.
    }
    public void setRecords(float[] records){
        this.records = records;
    }
    public float[] getRecords(){
        return records;
    }
    public void setNombres(String[] nombres){
        this.nombres = nombres;
    }
    public String[] getNombres(){
        return nombres;
    }
}
