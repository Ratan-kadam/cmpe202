import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class State2one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State2one extends Actor implements StateInterfaceone 
{
  
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class State2
     */
    
    StateRouterone sr; 
    
    public State2one(StateRouterone sr)
    {
       
      this.sr = sr;
    }

    public int throwQuestion(World world)
    {
    System.out.println(" State 2: In Throw question module ");
    // Dynamic_Text ob2=Worldexe.getDynamic_Text();
    Dynamic_Text ob2=Project.getDynamic_Text();
     //ob2.write_text("Question 2 : xxxxxxxxxx",world,270,455);
    System.out.println(" Ans is correct .. moving to state 3");
    sr.setState(sr.getState3());
    return 0;
    }
    
    public void onMousePress(int mouseX, int mouseY, Caption caption) 
    {
             
    } 
    
  
}

