import java.util.ArrayList;
import java.util.List;

public class StringData implements Subject{
    private List<StringObserver> observers;
    private String userinput;

    public StringData(){
        observers = new ArrayList<StringObserver>();
    }

    public void registerObserver(StringObserver o){
        observers.add(o);
    }

    public void removeObserver(StringObserver o){
        observers.remove(o);
    }

    public void notifyObserver(){
        for(StringObserver o : observers){
            o.update(userinput);
        }
    }

    public void inputChanged(){
        notifyObserver();
    }
}