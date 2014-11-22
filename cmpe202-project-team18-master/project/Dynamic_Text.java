import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
     
     public void write_text(String txtadd, World world,int x1,int y1, int type)
      {
          World world1 = getWorld();
       Caption  msg= new Caption();
       GreenfootImage gimg;
       gimg = new GreenfootImage(220,22);
       if(type == 0){
           gimg = new GreenfootImage(600,40);
        }
        gimg.setColor(java.awt.Color.BLACK);
        gimg.fill();
        gimg.setColor(java.awt.Color.WHITE);
        Font myFont = new Font("SANS_SERIF", Font.BOLD, 14);
        gimg.setFont(myFont);
        gimg.drawString(txtadd,20, 10);
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
      
      
        
     
}
