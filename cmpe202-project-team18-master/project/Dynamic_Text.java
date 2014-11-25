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
   
    
    GreenfootImage im;
     public Dynamic_Text()
     {
         
     }
     
     public void write_text(String txtadd, World world,int x1,int y1, int type){
       Caption  msg= new Caption();
       GreenfootImage gimg;
       gimg = new GreenfootImage(220,22);
       if(type == 0){
           gimg = new GreenfootImage(600,40);
        }
        //gimg.setColor(java.awt.Color.BLACK);
        gimg.setTransparency(255);
        //gimg.fill();
        gimg.setColor(java.awt.Color.WHITE);
        //gimg.setTransparency(255);
        Font myFont = new Font("SANS_SERIF", Font.BOLD, 14);
        gimg.setFont(myFont);
        gimg.drawString(txtadd,20, 10);
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
<<<<<<< HEAD
    public void writeScore(String txtadd, World world,int x1,int y1, int type){
       Caption  msg= new Caption();
       GreenfootImage gimg;
       gimg = new GreenfootImage(320,222);
       if(type == 0){
           gimg = new GreenfootImage(600,40);
        }
        //gimg.setColor(java.awt.Color.BLACK);
        gimg.setTransparency(255);
        //gimg.fill();
        gimg.setColor(java.awt.Color.WHITE);
        //gimg.setTransparency(255);
        Font myFont = new Font("SANS_SERIF", Font.BOLD, 24);
        gimg.setFont(myFont);
        System.out.println("text add:" + txtadd);
        gimg.drawString(txtadd,50, 20);
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
=======
>>>>>>> origin/master
      public void cleanUp(World world){
         System.out.println("World is :" + world);
        List<Caption> c = world.getObjects(Caption.class);
        int i = 0;
        if (null != c && c.size() > 0){
                for(Caption caption : c){
                 world.removeObject(caption);
                 System.out.println("Captions remved: " + ++i);
            }
        }
        
      }
    }