
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
    private  static int answerIndex;
    public static Integer questionCount = 1;
    StateRouterone sr;
    Map<String, List<String>> questionsMap = new HashMap<String, List<String>>();
    static List<String> formatedQuestion = new ArrayList<String>();
    GameController gc;
    ScoreBoard scoreboard;
        
   
    /**
     * Constructor for objects of class State1
     */
    public   State1one( StateRouterone sr){
        GreenfootImage img = getImage();
        img.scale(150,70);
        setImage(img);
        this.sr = sr;
    }
    
    public int level1(World world){
        return throwQuestion(world);
    }
    
    public int level2(World world){
        return -1;
    }
    
    public int level3(World world){
        return -1;
    }
    
    public int level4(World world){
        return -1;
    }
    
   public List<String> getFormatedQuestion(){
       return this.formatedQuestion;
   } 

   public void setFormatedQuestion(List<String> list){
       this.formatedQuestion = list;
   }
   
   synchronized public int throwQuestion(World world){
        if(null != world){
            Project.getDynamic_Text().cleanUp(world);
           (new Thread(Project.getGameController().getTimer())).start();
           String question,answer,option1,option2,option3, option4;
           questionsMap = readAndparse();
           if(questionCount <= questionsMap.keySet().size()){
            setFormatedQuestion(questionsMap.get("Q".concat(questionCount.toString())));
            int length = formatedQuestion.size();
            answerIndex = Integer.parseInt(formatedQuestion.get(length-1));
            question = formatedQuestion.get(0);
            option1 = formatedQuestion.get(1);
            option2 = formatedQuestion.get(2);
            option3 = formatedQuestion.get(3);
            option4 = formatedQuestion.get(4);
            answer = formatedQuestion.get(answerIndex);
            Dynamic_Text ob2 = Project.getDynamic_Text();
            ob2.write_text(question,world,520,490,0);
            ob2.write_text(option1,world,355,533,1);
            ob2.write_text(option2,world,680,533,1);
            ob2.write_text(option3,world,355,578,1);
            ob2.write_text(option4,world,680,578,1);
            questionCount++;
            return 0;
        }
        else{
            questionCount = 1;
            sr.stateChange(world);
            world.removeObject((Actor)sr.getState1());
            world.addObject((Actor)sr.getState2(),900,150);
            sr.setState(sr.getState2());
            return -1;
        }
        }
       return -1;
   }
           
    public void onMousePress(int mouseX, int mouseY, Caption caption, World world){
       Timer.isActive = false;
       int optionClicked = Options.checkOption(mouseX, mouseY);
       if(optionClicked != -1){
           Timer.count = 10;
           Color clr = java.awt.Color.RED;
           if (optionClicked == answerIndex){
               clr = java.awt.Color.GREEN;
               Project.setScore(10);
               updateScoreboard();
           }
           else 
           {
             Project.setLives();
             updateScoreboard();
           }
           GreenfootImage gimg = caption.getImage();
           gimg.setColor(clr);
           gimg.setTransparency(255);
           gimg.fill();
           gimg.setColor(java.awt.Color.WHITE);
           gimg.drawString(getFormatedQuestion().get(++optionClicked), 20, 19);
           caption.setImage(gimg);           
        }
        Greenfoot.delay(50);
        Timer.isActive = true;

      } 
    
       
    public Map<String, List<String>> readAndparse(){
      Integer i = 0;
      String token1 = "\\?";
      String token2 = "/";
      Map<String, List<String>> questionAnswersMap = new HashMap<String, List<String>>();
         try {  
            String input = "";
            BufferedReader file = new BufferedReader(new FileReader("./questionSet/Easy.txt")); 
            while ((input = file.readLine()) != null) {  
                List<String> questionAnswersList = new ArrayList<String>();
                String[] tempQnA = input.split(token1);
                questionAnswersList.add(tempQnA[0]);
                StringTokenizer tokenize = new StringTokenizer(tempQnA[1], token2);
                while(tokenize.hasMoreElements()){
                    questionAnswersList.add(tokenize.nextElement().toString());
                }
                String makeQ = "Q".concat((++i).toString());
                questionAnswersMap.put(makeQ,questionAnswersList);
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

        public void updateScoreboard()
        {
              gc = Project.getGameController();
              scoreboard=gc.getScoreBoard();
              scoreboard.update();
               if(Project.getLives() < 1){ 
                 sr.setState(sr.getState4());
                 sr.level4(getWorld());                
                }
               
        }
        
        public void update(){
            if(null != getWorld()){
               Project.setLives();
                updateScoreboard();
               if(Project.getLives() > 0)
                    throwQuestion(getWorld());
                }
        }


   }

