import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.io.InputStream;
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;  
import java.io.FileNotFoundException;

/**
 * Write a description of class State1one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State1one extends StateInterfaceone
{
     // instance variables - replace the example below with your own
    private int x;
    private int QuestionCount = 1;
    //static Dynamic_Text h2=new Dynamic_Text();
    StateInterfaceone st;
    StateRouterone sr;
   // QuestionActor S1Q1 = new QuestionActor();
    /**
     * Constructor for objects of class State1
     */
    public State1one( StateRouterone sr)
    {
    System.out.println("in state 1 ");
     this.sr = sr;
      GreenfootImage Image= getImage();
            Image.scale( 40,40 );
            setImage(Image);
    
    }

  
    
   public int throwQuestion(World world)
    {
        
    //World world = getWorld();
    System.out.println(" State1: In Throw question module ");
    System.out.println("given Ans is correct.. moving to state 2");
    Dynamic_Text ob2=Project.getDynamic_Text();
     ob2.write_text("Question 1 : xxxxxxxxxxxxx",world,470,455);
     ob2.write_text(" Option 1 : xxxxxxxxxxxxx",world,370,490);
     ob2.write_text(" Option 2 : xxxxxxxxxxxxx",world,370,555);
     ob2.write_text(" Option 3 : xxxxxxxxxxxxx",world,670,490);
     ob2.write_text(" Option 4 : xxxxxxxxxxxxx",world,670,555);
     
    //S1Q1.displayQuestion("Welcome to Question1");
     //world.addObject(this,200,200);
  try {  
    String input;  
    BufferedReader file = new BufferedReader(new FileReader("./questionset/MediumSet.txt")); 
    String input1 = file.readLine() ;
    System.out.println("input1:" + input1);
    
    while ((input = file.readLine()) != null) {  
      System.out.println("Now reading:");
        System.out.println(input);//or whatever you want to do with the string; 
        
        ob2.write_text(input,world,470,355);
    }  
}  
catch (FileNotFoundException fnfe) {//always catch the more specific Exceptions first; otherwhile the FileNotFoundException will be catched as a IOException because it's a subclass of IOException;  
    System.out.println("exception file");
    //fnfe.printStackTrace();  
    //Also you can add any other code you want to execute if the file is not found;  
}  
catch (IOException ioe) {
    System.out.println("exception file1");
    //ioe.printStackTrace();  
}  
     

  // sr.setState(sr.getState2());
    
    return 0;
     
    }
    
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
     public void act() 
    {
        int mouseX, mouseY ;
        if(Greenfoot.mousePressed(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            if((mouseX >= 760 && mouseX <= 950) && (mouseY >= 500 && mouseY <=555))
            {
                System.out.println(" option selected...");    
          
            }
     }
    } 
    
    public String readText(int row) 
    {  
    //    InputStream is = getClass().getClassLoader().getResourceAsStream("pars.txt");  
    //    BufferedReader r = new BufferedReader(new InputStreamReader(is));  
  
    //    String[] lines = new String[maxLevel-1];  
  
        //for (int i = 0; i < maxLevel-1; i++) {  
    //        lines[i] = r.readLine();  
       // }  
  return "ccc";
      // return lines[row];  
    } 
    
}

