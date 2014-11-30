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
    Target target = new GpaAdapter();
   
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
    
    public int level4(World world1){
        if(null != world1){
        target.calculateMarks();
        List<Actor> actors = world1.getObjects(Actor.class);
        actors.remove(actors.indexOf(Project.getGameController().getScoreBoard()));
        world1.removeObjects(actors);
        String gpa = "GPA: " + Project.GPA;
        Dynamic_Text ob2 = Project.getDynamic_Text();
        ob2.writeScore(gpa,world1,2500,140,0);
        GreenfootImage gi =  this.getImage();
        gi.scale(1347, 537);
        gi.setTransparency(160);
        this.setImage(gi);
        world1.repaint();
        world1.addObject(this,500,300);
        }
        return -1;
    }
    
    public int throwQuestion(World world){return -1;}
    public void onMousePress(int x, int y, Caption c, World world){}
    public void update(){
    }
     
}
