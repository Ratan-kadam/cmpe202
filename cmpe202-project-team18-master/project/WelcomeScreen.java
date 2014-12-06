import greenfoot.*;
/**
 * Write a description of class WelcomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeScreen extends Screen 
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class WelcomeScreen
     */
    public WelcomeScreen()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void showScreen()
    {
        GreenfootImage greenfootImage = new GreenfootImage("./images/WelcomeScreen.png");
        greenfootImage.scale(1347, 537);
        this.project.setBackground(greenfootImage);
        
    }
    
    public GreenfootImage getScreen()
    {
        GreenfootImage greenfootImage = new GreenfootImage("./images/WelcomeScreen.png");
        greenfootImage.scale(1347, 537);
        return greenfootImage;
    }
}
