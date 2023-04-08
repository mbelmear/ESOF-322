public class NoWordsDisplay implements StringObserver {
    public void update(String s){
        String[] numwords = s.split("\\s+");
        System.out.println("Number of words in string: " + numwords.length);
    }
}