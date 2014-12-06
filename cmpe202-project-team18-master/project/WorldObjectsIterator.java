import greenfoot.*;

/**
 * Write a description of class WorldObjectsIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface WorldObjectsIterator  
{
    Actor first();
	Actor next();
	Actor currentItem();
	boolean isDone();
}
