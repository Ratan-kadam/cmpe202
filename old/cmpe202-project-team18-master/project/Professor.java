import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Professor extends Actor
{
    /**
     * Act - do whatever the Professor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Professor()
    {
        //GreenfootImage professor = new GreenfootImage("./images/Professor.png");
        //professor.scale(150, 150);
        //this.setImage(professor);
    }
    public void act() 
    {
        // Add your action code here.
    }
    
     public void calculateGPA()
    {
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
    
    }
    
}
