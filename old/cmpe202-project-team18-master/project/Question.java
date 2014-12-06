import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question extends Actor
{
    /**
     * Act - do whatever the Professor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question()
    {
        GreenfootImage question = new GreenfootImage("./images/QuestionTemplate.png");
        // question.scale(990, 610);
        this.setImage(question);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
