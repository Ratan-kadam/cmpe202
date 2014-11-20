import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
 import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{ 
    /** Life must be either of these so using enum **/
    


/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    /**
     * Act - do whatever the Professor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        GreenfootImage player = new GreenfootImage("./images/spartan.png");
        // question.scale(990, 610);
        this.setImage(player);
    }
    public void act() 
    {
        // Add your action code here.
    }    


	/*public static enum LifeLine{ZERO, ONE, TWO, THREE};

	private int marks;
	private Life life;
	private List<Reward> rewards;
	private ArrayList<Observer> observers = new ArrayList<Observer>() ;
	private static Player instance = null;
    
    public static Player getInstance(){
        if(instance == null){
            instance = new Player();
        }
        return instance;
    }
    
	private Player() {
	    reset();
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
		notifyObservers();
	}
	
	public Life getLife() {
		return life;
	}
	
	public int getLives() {
		switch(getLife()) {
		case THREE:
			return 3;
			
		case TWO:
			return 2;
			
		case ONE:
			return 1;
			
		case ZERO:
			return 0;
		}
		return 0;
	}
	
	public void setLife(final Life life) {
		this.life = life;
		notifyObservers();
	}
	
	public void decretementLife() {
	    System.out.println("In Decrement Life ....");
	    
		switch(getLife()) {
			case THREE:
				setLife(Life.TWO);
				break;
				
			case TWO:
				setLife(Life.ONE);
				break;
				
			case ONE:
				setLife(Life.ZERO);
				break;
				
			default:
				setLife(Life.ZERO);
				break;
		}
	}
	
	public void addReward(Reward reward) {
	    rewards.add(reward);
	}
	
	public List<Reward> getRewards() {
	    return rewards;
	}

	public void attach(Observer obj) {
        observers.add(obj) ;
    }
    
    public void detach(Observer obj) {
        observers.remove(obj) ;
    }
    
    public void notifyObservers() {
        for (Observer obj  : observers)
        {
            obj.update();
        }
    }
    
    public void reset(){
		setScore(0);
		setLife(Life.THREE);
		rewards = new ArrayList<Reward>();
    }

}*/

    
}
