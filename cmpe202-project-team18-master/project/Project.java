import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Project here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project extends World
{
      int gameover;
        static Dynamic_Text h2=new Dynamic_Text();
       StateRouterone st = new StateRouterone();
        StateInterfaceone st1 = new State1one(st);

    /**
     * Constructor for objects of class Project.
     * 
     */
    public Project()
    {    
        super(990, 610, 1);
        
        prepare();
    }

 private void prepare()
    {
        /*final Welcome screen1 = new Welcome();
        GreenfootImage welcomeBackground = new GreenfootImage("./images/WelcomeScreen.png");
        welcomeBackground.scale(1347, 537);
        screen1.setImage(welcomeBackground);
        addObject(screen1, 484, 318);*/
        //---------
      
        //-----
        GameController gc = new GameController();
        GreenfootImage blank = new GreenfootImage("./images/blank.jpeg");
        blank.scale(990,610);
        gc.setImage(blank);
        addObject(gc,484,318);
        gc.showScreen();
       //---------------------------------------------
      //   addObject(st,455,0); 
      //  st.setState( st.getState1());
          
       //  addObject(st1,455,0);
    //     for ( int i=0 ; i < 3 ; i++)
   // {
    //    gameover = st.throwQuestionRouter();
    //   if (gameover == 1)
     //      i = 3;
   // }
        
        /*Play play = new Play();
        GreenfootImage play1 = new GreenfootImage("./images/Play.png");
        play.setImage(play1);
        addObject(play, 484, 318);
        */
        //levelScreen.setNextScreen(gamePlayScreen);
        //gamePlayScreen.setNextScreen(levelCompleteScreen);
        //levelCompleteScreen.setNextScreen(gameOverScreen);
        
        //addObject(screen1, 484, 318);
        
        //final UIHandler uihandler = new UIHandler();
        /*new Thread(new Runnable() 
        {
            
            @Override
            public void run() 
            {
                try
                {
                    Thread.sleep(WELCOME_SCREEN_TIMEOUT);  
                }
                catch(Exception e) 
                {}
                finally{
                    removeObject(screen1);
                    levelScreen.showScreen(ScreenType.LEVEL);       
                }
            }
        }).start();
    }*/
 }
 
    public static Dynamic_Text getDynamic_Text()
    {
     return h2;
    }
}