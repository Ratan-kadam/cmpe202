import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ScoreBoard extends Actor 
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private Player player;
    String score = "0";
    String lives ="3";
    
    public ScoreBoard()
    {
        background = getImage();
       //background.scale(100, 30);
        this.setImage("./images/sb.png");
     }
    
    public void act() 
    {
        displayScore();
    }
   
 
    //Displat score act as a Update method 
    private void displayScore()
    {
       // GreenfootImage image;
       
        GreenfootImage livesCount[]=new GreenfootImage[3];
       
        Dynamic_Text ob2 = Project.getDynamic_Text();
        ob2.writeScore(score,getWorld(),1290,110,0);
        ob2.writeScore(lives,getWorld(),1350,230,0);
          
    }
    
    public void update() {
        score = "" +  Project.getScore();
        int curr_lives = Project.getLives();
        GameController gc = Project.getGameController();
        /*if ( curr_lives  < 0)
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
        }*/
        lives = "" + Project.getLives();
        displayScore();
}

}

