import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.*;

/**
 * Write a description of class Dynamic_Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dynamic_Text extends Caption
{
    BuildIterator iterator;
    
    GreenfootImage im;
     public Dynamic_Text()
     {
         iterator = new BuildIteratorImpl();
     }
     
     public void write_text(String txtadd, World world,int x1,int y1, int type){
       Caption  msg= new Caption();
       GreenfootImage gimg;
       gimg = new GreenfootImage(220,26);
       if(type == 0){
           gimg = new GreenfootImage(600,40);
        }
        gimg.setTransparency(255);
        gimg.setColor(java.awt.Color.WHITE);
        Font myFont = new Font("SANS_SERIF", Font.BOLD, 14);
        gimg.setFont(myFont);
        gimg.drawString(txtadd,20, 19);
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
    public void writeScore(String txtadd, World world,int x1,int y1, int type){
       Caption  msg= new Caption();
       GreenfootImage gimg;
       Font myFont;
        if(type == -1)
        {
            gimg = new GreenfootImage(500,100);
            myFont = new Font("SANS_SERIF", Font.BOLD, 42);
            gimg.setColor(java.awt.Color.BLUE);
            gimg.setFont(myFont);
            gimg.drawString(txtadd,50, 40);
        }
        else{
            gimg = new GreenfootImage(600,40);
            gimg.setTransparency(255);
            gimg.setColor(java.awt.Color.RED);
            myFont = new Font("SANS_SERIF", Font.BOLD, 24);
            gimg.setFont(myFont);
            gimg.drawString(txtadd,50, 20);
        }
        
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
      public void cleanUp(World world){
        List<Caption> c = world.getObjects(Caption.class);
        WorldObjectsIterator it = iterator.createIterator(c);
        int i = 0;
        if (null != c && c.size() > 0){
            while ( !it.isDone()  ){
                world.removeObject(it.currentItem());
                it.next();
            }
         }
        
      }
    }