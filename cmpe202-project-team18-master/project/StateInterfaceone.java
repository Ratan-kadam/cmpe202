import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StateInterfaceOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Write a description of class StateInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class StateInterfaceone  extends Actor
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StateInterface
     */
    public StateInterfaceone()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
     public abstract  int throwQuestion(World world);
   
}

