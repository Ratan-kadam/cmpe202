import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StateRouterone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateRouterone extends Actor {
    
    StateInterfaceone state1;
    StateInterfaceone state2;
    StateInterfaceone state3;
    StateInterfaceone state4;
    
    StateInterfaceone currentState;
    
    /**
     * Constructor for objects of class StateRouter
     */
   
    public StateRouterone(){
        state1 = new State1one(this);
        state2 = new State2one(this);
        state3 = new State3one(this);
        state4 = new State4one(this);
    }
    
    public int level1(World world){
        return currentState.level1(world);
    }
    
    public int level2(World world){
        return currentState.level2(world);
    }
    
    public int level3(World world){
        return currentState.level3(world);
    }
    
    public int level4(World world){
        return currentState.level4(world);
    }
    
    public int throwQuestion(World world){
      return 0;
    }
    
    public int throwQuestionRouter()
    {
        World world = getWorld();
        currentState.throwQuestion(world);
        return 99999;
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
       
    // @override
    public void setState(StateInterfaceone state)
    {
       this.currentState = state;
    }
    
        public StateInterfaceone getState1()
    {
       return state1;
    }
    
    public StateInterfaceone getState2()
    {
       return state2;
    }
    
    public StateInterfaceone getState3()
    {
       return state3;
    }
    
    public StateInterfaceone getState4()
    {
       return state4;
    }

    public StateInterfaceone getCurrentState()
    {
       return currentState;
    }
    
    public void onMousePress(int mouseX, int mouseY, Caption caption, World world){
             currentState.onMousePress(mouseX, mouseY, caption, world);
    }
    
       
}