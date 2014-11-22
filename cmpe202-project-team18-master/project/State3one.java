import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class State3one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State3one extends Actor implements StateInterfaceone
   {
       
       
    // instance variables - replace the example below with your own
    private int x;
   StateRouterone sr;
    /**
     * Constructor for objects of class State3
     */
    public State3one(StateRouterone sr)
    {
        this.sr = sr;
    }

    public int throwQuestion(World world)
    {
        
    System.out.println(" State 3 : In Throw question module ");
     Dynamic_Text ob2=Project.getDynamic_Text();
    // ob2.write_text("Question 3 : xxxxxxxxxx",world,600,455);
      //ob2.write_text("Question 3.1 : rrrrrrrrr",world,600,555);
    return 1;
    }
    
    public void onMousePress(int mouseX, int mouseY, Caption caption) 
    {
             
    }
} 

