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
    private IScreen screen = null;
     StateRouterone st = new StateRouterone();
     StateInterfaceone st1 = new State1one(st);
    //Project world = null;
    
    public GameController()
    {
        //world = project;
        
        screen = new WelcomeScreen();
       
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();
            System.out.println("Clicked1!!!!!!!!");
            if((mouseX >= 760 && mouseX <= 950) && (mouseY >= 500 && mouseY <=555)&&screen.getClass().getName()=="WelcomeScreen")
            {
                System.out.println("play selected");    
                setScreen(new GameScreen());
                showQuestion();
                showProfessor();
                showPlayer();
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
                    st1.onMousePress(mouseX, mouseY, caption); 
                    State1one.questionCount++;
                    //Greenfoot.delay(1000);
                    int gameover = st.throwQuestionRouter();
                }
            }
    } 
    
    public void showScreen()
    {
        GreenfootImage gi =  screen.getScreen();
        //System.out.println(screen.getClass().getName());
        this.setImage(gi);
        World world1 = getWorld();
        world1.addObject(this, 900, 118);
        /*World world = getWorld();
        Welcome screen1 = new Welcome();
        GreenfootImage welcomeBackground = new GreenfootImage("./images/WelcomeScreen.png");
        welcomeBackground.scale(1347, 537);
        screen1.setImage(welcomeBackground);
        world.addObject(screen1, 484, 318);*/
    }
    
    public void showProfessor()
    {
        World world1 = getWorld();
        Professor professor = new Professor();
        world1.addObject(professor,284,318);
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
        world1.addObject(player,950,130);
    }
    public void setScreen(IScreen sc)
    {
        screen = sc;
    }
    
    public void level1()
    {
        World world = getWorld();
        world.addObject(st,550,100);
        world.addObject((State1one)st1,550,100);
       // addObject(st,455,0); 
        st.setState( st.getState1());
          
        // addObject(st1,455,0);
    
     for ( int i=0 ; i < 3 ; i++)
    {
       int gameover = st.throwQuestionRouter();
       
        if (gameover == 1)
           i = 3;
    }
    }
    
}
