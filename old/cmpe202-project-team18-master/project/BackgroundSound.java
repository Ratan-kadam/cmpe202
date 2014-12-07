import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BackgroundSound extends Actor
{
    int i=1;
    public GreenfootSound gs;
    public void act() 
    {
       World world = getWorld();
       GameController gc = Project.getGameController();
       if(gc.getScreen().getClass().getName()=="GameScreen"&&i==1)
       {
        gs.play();
        i--;
        }
      
    }
    
    public BackgroundSound()
    {
       gs = new GreenfootSound("gamelong.mp3");
    }
}