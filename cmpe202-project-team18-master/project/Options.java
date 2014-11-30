import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends Actor
{
    private static int Ax1, Ay1, Ax2, Ay2;
    private static int Bx1, By1, Bx2, By2;
    private static int Cx1, Cy1, Cx2, Cy2;
    private static int Dx1, Dy1, Dx2, Dy2;
    
    public static void setOptions(){
        Ax1 = Cx1 = 235;
        Ay1 = By1 = 480;
        Ax2 = Cx2 = 500;
        Ay2 = By2 = 516;
        Bx1 = Dx1 = 570;
        Cy1 = Dy1 = 532;
        Cy2 = Dy2 = 576;
        Bx2 = Dx2 = 835;
        
    }
    
    public static int checkOption(int x, int y){
        setOptions();
        int optionSelected;
        if (isClicked(Ax1,Ay1,Ax2,Ay2,x,y))
            optionSelected = 0;
        else if(isClicked(Bx1,By1,Bx2,By2,x,y))
             optionSelected = 1;
        else if (isClicked(Cx1,Cy1,Cx2,Cy2,x,y))
            optionSelected = 2;
        else if(isClicked(Dx1,Dy1,Dx2,Dy2,x,y))
             optionSelected = 3;
        else 
            optionSelected = -1;

        return optionSelected;
    }
    /**
     * Act - do whatever the Options wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        
        // Add your action code here.
    }
    
    public static boolean isClicked(int ax1, int ay1, int ax2, int ay2, int x, int y){
        if(((ax1 < x) && (x < ax2)) && ((ay1 < y)&&(y < ay2)))
            return true;
        else 
            return false;
        
    }
}
