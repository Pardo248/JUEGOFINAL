import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class WIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WIN extends CombatMap
{
    String nom;
    float[] records = new float[3];
    String[] nombres = new String[3];
    
    float top1Score = 0;
    float top2Score = 0;
    float top3Score = 0;    
    
    String nom1 = "";
    String nom2 = "";
    String nom3 = "";
    
    
    Return back = new Return();
    /**
     * Constructor for objects of class WIN.
     * 
     */
    
    public WIN(int x, int y, int z)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,z);
    }
    protected void setRecords(float score,String nom){
        if(score > top1Score){
            top3Score = top2Score;
            nom3 = nom2;
            top2Score = top1Score;
            nom2 = nom1;
            top1Score = score;
            nom1 = nom;
        }else if(score > top2Score){
            top3Score = top2Score;
            nom3 = nom2;
            top2Score = score;
            nom2 = nom;
        }else if(score > top3Score){
            top3Score = score;
            nom3 = nom;
        }
    }
    protected void PrintScore(float score,World currentWorld,Records records){
      
      nom = Greenfoot.ask("Cual es tu nombre?") +"-" ;
      showText("Score: "+ nom + score,600,100);
      
      getRecords(records);
      
      setRecords(score,nom);
      setRecords(records,score);
      
      showText(nom1 + top1Score + ". \n" + nom2 + top2Score + ". \n" + nom3 + top3Score +".\n Presiona F para volver",600,500);
      
      back.Return(currentWorld);
      addObject(back,600,375);
    }
    public void getRecords(Records records){
     
        this.records = records.getRecords();
        this.nombres = records.getNombres();
        
        top1Score = this.records[0];
        top1Score = this.records[1];
        top1Score = this.records[2];
        
        nom1 = this.nombres[0];
        nom2 = this.nombres[1];
        nom3 = this.nombres[2];
        
        
    }
    public void setRecords(Records records,float score){ 

        this.records[0] = top1Score;
        this.records[1] = top1Score;
        this.records[2] = top1Score;
        
        this.nombres[0] = nom1;
        this.nombres[1] = nom2;
        this.nombres[2] = nom3;
        
        records.setRecords(this.records);
        records.setNombres(this.nombres);
    }
}
