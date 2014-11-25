import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ScoreBoard extends Actor 
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private Player player;
    String score = "";
    
    public ScoreBoard()
    {
        background = getImage();
       //background.scale(100, 30);
        this.setImage("./images/sb.png");
        
       // player = AdroitTutorWorld.getPlayer();
       // player.attach(this);
        //displayScore();
    }
    
    public void act() 
    {
        displayScore();
       // System.out.println("Inside act()");
    }
   
    public void displayLives(GreenfootImage image)
    {
        GreenfootImage lives[]=new GreenfootImage[3];
        // todo at constructor
        for(int i=0;i<3;i++)
        {
            lives[i]= new GreenfootImage("life.png");
            lives[i].scale(50,50);
        }
        
        // lives => displaying lives on scoreboard
        //int no_of_lives= player.getLives();
        
       // for(int i=0;i<no_of_lives; i++)
        for(int i=0;i<2; i++)
        {
            image.drawImage(lives[i], 50+(i*80), 150);
        }
        
    }
    
    //Displat score act as a Update method 
    private void displayScore()
    {
       
        Dynamic_Text ob2 = Project.getDynamic_Text();
        
        ob2.writeScore(score,getWorld(),1290,110,0);
    
        
      
    }
    
    public void update() {
        System.out.println("Inside update score board function ");
        score = "" +  Project.getScore(); 
        displayScore();
	}
}


