import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Project here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project extends World
{
     static double GPA = 0.0;
     static int Score = 0;
     static int Lives = 3;
     static Dynamic_Text h2=new Dynamic_Text();
     StateRouterone st = new StateRouterone();
     StateInterfaceone st1 = new State1one(st);
     static GameController gc;

    /**
     * Constructor for objects of class Project.
     * 
     */
    public Project()
    {    
        super(990, 610, 1);
        
        prepare();
    }

 private void prepare()
    {
        gc = new GameController();
        GreenfootImage blank = new GreenfootImage("./images/blank.jpg");
        blank.scale(990,610);
        gc.setImage(blank);
        addObject(gc,484,318);
        gc.showScreen();
       
 }
 
    public static Dynamic_Text getDynamic_Text()
    {
     return h2;
    }
    
    public static int getScore()
    {
     return  Score;
    }
    
    public static void setScore(int score)
    {
      Score = Score + score;
     }
    
    public static GameController getGameController()
     {
       return gc;
     }  
     
      public static void setLives()
    {
      Lives = Lives - 1;
     }
    
     public static int getLives()
    {
      return Lives;
    }
}
  