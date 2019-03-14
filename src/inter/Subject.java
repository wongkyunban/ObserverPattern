package inter;

/**
 * 主题
 */
public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObservers();
}
