import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StateRouterone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateRouterone extends Actor implements StateInterfaceone
{
    StateInterfaceone state1one = new State1one(this);
    StateInterfaceone state2one = new State2one(this);
    StateInterfaceone state3one = new State3one(this);

   StateInterfaceone Current;
   
    /**
     * Constructor for objects of class StateRouter
     */
    public StateRouterone()
    {
        System.out.println("inside State Router con ");
        
    }
    public int throwQuestion(World world){
        System.out.println("Inside throw question");
        return 0;}
    
    public int throwQuestionRouter()
    {
        System.out.println("Inside throw router");
        World world = getWorld();
  
  Current.throwQuestion(world);
    return 99999;
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
      return 0;
    }
   // @override
    public void setState(StateInterfaceone S)
    {
       this.Current = S;
    }
    
    public StateInterfaceone getState1()
    {
       return state1one;
    }
    
    public StateInterfaceone getState2()
    {
       return state2one;
    }
    
    public StateInterfaceone getState3()
    {
       return state3one;
    }
    
    public void onMousePress(int mouseX, int mouseY, Caption caption) 
    {
             
    }
    
}