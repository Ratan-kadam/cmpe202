import java.util.*;

/**
 * Write a description of class BuildIteratorImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildIteratorImpl implements BuildIterator
{
    public WorldObjectsIterator createIterator(List list){
        return new WorldObjectsIteratorImpl(list);
    }
}

