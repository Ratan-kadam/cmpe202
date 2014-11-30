import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
 import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{ 
    public Player()
    {
        GreenfootImage player = new GreenfootImage("./images/spartan.png");
        player.scale(150, 150);
        this.setImage(player);
    }
    public void act() 
    {
        // Add your action code here.
    }    

}
