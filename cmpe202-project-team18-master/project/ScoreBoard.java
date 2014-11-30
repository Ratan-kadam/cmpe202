import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ScoreBoard extends Actor 
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private Player player;
    String score = "";
    String lives ="";
    
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
   
 
    //Displat score act as a Update method 
    private void displayScore()
    {
       // GreenfootImage image;
        GreenfootImage livesCount[]=new GreenfootImage[3];
       
        Dynamic_Text ob2 = Project.getDynamic_Text();
        
        ob2.writeScore(score,getWorld(),1290,110,0);
        
        ob2.writeScore(lives,getWorld(),1350,230,0);
       // for(int i=0;i<3;i++)
        //{
        //    livesCount[i]= new GreenfootImage("./images/life.png");
        //    livesCount[i].scale(50,50);
       // }
        
      //  for(int i=0;i<3; i++)
      //  {
      //    GreenfootImage image;
      //    image.drawImage(livesCount[i], 50+(i*80), 150);
      //  }
    
    }
    
    public void update() {
        score = "" +  Project.getScore();
        int curr_lives = Project.getLives();
        GameController gc = Project.getGameController();
        if ( curr_lives  < 0)
         { 
           IScreen gameOver = new GameOverScreen();   
           gc.setScreen(gameOver);
           gc.showScreen();
           // Greenfoot.delay(5);
            displayScore();
         }
         else
         { 
            lives = "" + Project.getLives();
            displayScore();
        }
}

}

