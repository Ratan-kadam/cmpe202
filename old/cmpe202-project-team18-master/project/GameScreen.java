import greenfoot.*;
/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends Screen 
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class GameScreen
     */
    public GameScreen()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public GreenfootImage getScreen()
    {
        GreenfootImage greenfootImage = new GreenfootImage("./images/spartan.png");
       // greenfootImage.scale(96, 181);
        return greenfootImage;
    }
}
