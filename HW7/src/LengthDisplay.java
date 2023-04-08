public class LengthDisplay implements StringObserver{
    public void update(String s){
        System.out.println("Length of string: " + s.length());
    }
}