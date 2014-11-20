import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
     
     public void write_text(String txtadd, World world,int x1,int y1)
      {
          World world1 = getWorld();
       Caption  msg= new Caption();
       GreenfootImage gimg;
  
        gimg= new GreenfootImage(180,22);
        gimg.setColor(java.awt.Color.BLUE);
        gimg.fill();
        gimg.setColor(java.awt.Color.WHITE);
        gimg.drawString(txtadd,10, 10);
        msg.setImage(gimg);
        world.addObject(msg,x1,y1);
      }
      
      
      
        
     
}
