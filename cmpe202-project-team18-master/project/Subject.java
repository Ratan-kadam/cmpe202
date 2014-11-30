/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    public void attach(StateInterfaceone obj);
    public void detach(StateInterfaceone obj);
    public void notifyObservers();
}
