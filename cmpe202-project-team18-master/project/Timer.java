import greenfoot.*;  
import java.awt.Color;  
import java.util.*;
  
public class Timer extends Actor implements Runnable
{  
    public static int count; // the counter field  
    private int initialCount; // the initial time given before event occurs  
    public static boolean isActive;  
    private String subjectState;
     
    private List<StateInterfaceone> observers = new ArrayList<StateInterfaceone>() ;
  
    public void act(){}
  
    public void attach(StateInterfaceone obj) {
        observers.add(obj) ;
    }

    public void detach(StateInterfaceone obj) {
        observers.remove(obj) ;
    }

    public void notifyObservers() {
        for (StateInterfaceone obj  : observers)
        {
            obj.update();
        }
    }

  
    public Timer(int timeBeforeEvent) // int value given in seconds  
    {  
        setTimer(timeBeforeEvent);
        isActive = true;
        updateImage();  
         
    }  
  
    public void setTimer(int timeBeforeEvent)  
    {  
       // initialCount = 60 * timeBeforeEvent;  
        count = timeBeforeEvent;  
    }  
    
    public void setIsActive(boolean isActive){
        isActive = isActive;
    }
  
    private void updateImage()  
    {  
        //String prefix = "T - ";  
        if (count >= 0) ;  
        int time = count ;  
       
       int secs=time;
        String s = "00" + secs;  
        while (s.length() > 2) s = s.substring(1);  
        String text = s ;  
        GreenfootImage textImage = new GreenfootImage(text, 70, Color.RED, new Color(0, 0, 0, 0));  
        setImage(textImage);  
    }  
  
     public void resetClock(int timeBeforeEvent) {
        count = timeBeforeEvent;
     // isActive = true;
     
    }
    
    public void run()  
    {  
       while ((count > 0) && isActive){
           updateImage();
           Greenfoot.delay(500);
           count--;
        }
        if(count == 0){
           notifyObservers();
        }
        resetClock(10);
        
    }  
  
   
}  