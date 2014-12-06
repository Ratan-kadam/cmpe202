import java.util.*;
import greenfoot.*;

/**
 * Write a description of class WorldObjectsIteratorImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldObjectsIteratorImpl implements WorldObjectsIterator
{
    private List<Actor> results ;
    private int cursor ;
    private int max ;

    public WorldObjectsIteratorImpl(List<Actor> r)
    {
        results = r ;
        cursor = 0 ;
        max = r.size() ;
    }
    
    

    public Actor first() {
		return results.get( 0 ) ;
	}

	public Actor next() {
        cursor++ ;
        if ( !isDone() )
		    return results.get( cursor ) ;
        else
            return null;
	}

	public Actor currentItem() {
		return results.get( cursor ) ;
	}

	public boolean isDone() {
		return (cursor == max) ;
	}
}
