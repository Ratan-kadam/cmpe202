import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GameController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameController extends Actor
{
    private int i= 1, gameover;
    private IScreen screen = null;
     StateRouterone stateRouter = new StateRouterone();
     StateInterfaceone state = stateRouter.getState1();
     ScoreBoard scoreboard;
     Timer t;
     Thread timer;
    
    public GameController()
    {
        t = new Timer(10);
       // timer = new Thread(t);
        screen = new WelcomeScreen();
       
    }
    
    public Timer getTimer(){
        return t;
    }
    
    public void act(){
        int mouseX, mouseY, gameover ;
        if (i == 1){
            Greenfoot.playSound("./sounds/KBC_intro.mp3");
            i--;
        }
        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();
            if((mouseX >= 760 && mouseX <= 950) && (mouseY >= 500 && mouseY <=555)&&screen.getClass().getName()=="WelcomeScreen")
            {
                setScreen(new GameScreen());
                showQuestion();
                showProfessor();
                showPlayer();
                showScore();
                showScreen();
                level1(); 
            }
        }
        List<Caption> c = getWorld().getObjects(Caption.class);
            for(Caption caption : c){
                if(Greenfoot.mousePressed(caption)) { 
                    MouseInfo mouse = Greenfoot.getMouseInfo();  
                    mouseX=mouse.getX();  
                    mouseY=mouse.getY();
                    stateRouter.onMousePress(mouseX, mouseY, caption, getWorld()); 
                    gameover = stateRouter.level1(getWorld());
                    gameover = stateRouter.level2(getWorld());
                    gameover = stateRouter.level3(getWorld());
                    gameover = stateRouter.level4(getWorld());
                   }
            }
    } 
    
    public void showScreen()
    {
        GreenfootImage gi =  screen.getScreen();
        this.setImage(gi);
        World world1 = getWorld();
        world1.addObject(this, 900, 118);
       
    }
    
    public IScreen getScreen(){
        return screen;
    }
    
    public void showProfessor()
    {
        World world1 = getWorld();
        Professor professor = new Professor();
        world1.addObject(professor,900,350);
    }
    
    public void showQuestion()
    {
        World world1 = getWorld();
        Question question = new Question();
        world1.addObject(question,500,310);
    }
    
      public void showPlayer()
    {
        World world1 = getWorld();
        Player player = new Player();
        world1.addObject(player,100,340);
    }
    
     public void showScore()
    {
        World world1 = getWorld();
        scoreboard = new ScoreBoard();
        world1.addObject(scoreboard,850,130);
    }
  
    
    public void setScreen(IScreen sc)
    {
        screen = sc;
    }
    
    public void level1(){
        World world = getWorld();
        world.addObject(stateRouter,550,100);
        world.addObject((Actor)stateRouter.getState1(),900,140);
        stateRouter.setState(stateRouter.getState1());
        int gameover = stateRouter.level1(world);
        t.attach(stateRouter.getState1());
        t.attach(stateRouter.getState2());
        t.attach(stateRouter.getState3());
        world.addObject(t,495,230);
        BackgroundSound sound = new BackgroundSound();
        world.addObject(sound,100,100);
        
   }
   
    public World getGameWorld()
   {
    World world = getWorld();
    return world;
    }
    
    public ScoreBoard getScoreBoard()
    {
        return scoreboard;
    }
    
   
    
}
