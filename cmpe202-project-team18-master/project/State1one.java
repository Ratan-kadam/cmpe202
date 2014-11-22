
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;
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
public class State1one extends Actor implements StateInterfaceone
{
    private int x; 
    private  static int answerIndex;
    public static Integer questionCount = 1;
    StateRouterone sr;
    Map<String, List<String>> questionsMap = new HashMap<String, List<String>>();
    List<String> formatedQuestion = new ArrayList<String>();
    
   
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

    
   public int throwQuestion(World world){
       String question,answer,option1,option2,option3, option4;
     questionsMap = readAndparse();
     if(questionCount <= questionsMap.keySet().size()){
           formatedQuestion = questionsMap.get("Q".concat(questionCount.toString()));
     //questionsMap.remove("");
        int length = formatedQuestion.size();
        answerIndex = Integer.parseInt(formatedQuestion.get(length-1));
        question = formatedQuestion.get(0);
        option1 = formatedQuestion.get(1);
        option2 = formatedQuestion.get(2);
        option3 = formatedQuestion.get(3);
        option4 = formatedQuestion.get(4);
        answer = formatedQuestion.get(answerIndex);
        Dynamic_Text ob2=Project.getDynamic_Text();
        ob2.write_text(question,world,500,450,0);
        ob2.write_text(option1,world,335,508,1);
        ob2.write_text(option2,world,670,508,1);
        ob2.write_text(option3,world,335,560,1);
        ob2.write_text(option4,world,670,560,1);
    }
    return 0;
     
    }
    
       
     public void onMousePress(int mouseX, int mouseY, Caption caption) 
    {
       // int mouseX, mouseY ;
        ///System.out.println(this.getClass().getName());
        /*List<Caption> c = getWorld().getObjects(Caption.class);
        for(Caption caption : c)
        {
            if(Greenfoot.mousePressed(caption)) {  */        
            System.out.println("hellooo");
            //MouseInfo mouse = Greenfoot.getMouseInfo();  
            //mouseX=mouse.getX();  
           // mouseY=mouse.getY();
            int optionClicked = Options.checkOption(mouseX, mouseY);
            System.out.println( optionClicked + " and: " + answerIndex);
            Color clr = java.awt.Color.RED;
            if (optionClicked == answerIndex){
                clr = java.awt.Color.GREEN;
             }
             GreenfootImage gimg = caption.getImage();
                gimg.setTransparency(80);
                gimg.setColor(clr);
                gimg.fill();
                caption.setImage(gimg);
                getWorld().addObject(caption,caption.getX(),caption.getY());
                Greenfoot.delay(1000);
            
       // }
       // }
        
    } 
    
       
    public Map<String, List<String>> readAndparse(){
      Integer i = 0;
      String token1 = "\\?";
      String token2 = "/";
      Map<String, List<String>> questionAnswersMap = new HashMap<String, List<String>>();
         try {  
            String input;
            BufferedReader file = new BufferedReader(new FileReader("./questionset/DifficultSet.txt")); 
            while ((input = file.readLine()) != null) {  
                List<String> questionAnswersList = new ArrayList<String>();
                String[] tempQnA = input.split(token1);
                questionAnswersList.add(tempQnA[0]);
                StringTokenizer tokenize = new StringTokenizer(tempQnA[1], token2);
                while(tokenize.hasMoreElements()){
                    questionAnswersList.add(tokenize.nextElement().toString());
                }
                String makeQ = "Q".concat((++i).toString());
                System.out.println(makeQ);
//                System.out.println
                questionAnswersMap.put(makeQ,questionAnswersList);
                //ob2.write_text(input,world,470,355);
            }  
        }  

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }      
        catch (IOException e) {
            e.printStackTrace();
        }    
        return questionAnswersMap;  
}
}

