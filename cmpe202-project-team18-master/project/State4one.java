import greenfoot.*;
import java.util.*;

/**
 * Write a description of class State4one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State4one extends Actor implements StateInterfaceone
{
    StateRouterone sr;
    public static Integer questionCount = 1;
   
    /**
     * Constructor for objects of class State4one
     */
    public State4one(StateRouterone sr){
        this.sr = sr;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int level1(World world){
       return -1;
    }
    
    public int level2(World world){
       return -1;
    }
    
    public int level3(World world){
       return -1;
    }
    
    public int level4(World world){
        if (Project.Score >=  50){
            if(Project.Score >=  200){
                if(Project.Score >=  300){
                    if(Project.Lives == 3){
                        Project.GPA = 4.0;
                    }
                    else {
                        Project.GPA = 3.75;
                    }
                }
            else {
                Project.GPA = 3.3;
            }
        }
        else {
            Project.GPA = 2.5;
        }
    }
    else {
        Project.GPA = 2.0;
    }
      /* String gpa = "GPA: " + Project.GPA;
        gc = Project.getGameController();
        scoreboard=gc.getScoreBoard();
        scoreboard.update();*/
        return -1;
    }
    
    public int throwQuestion(World world){return -1;}
    public void onMousePress(int x, int y, Caption c, World world){}
     
}
