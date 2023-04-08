public class VowelsDisplay implements StringObserver{
    public void update(String s){
        String str = s.toLowerCase();
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                counter++;
            }
        }
        
        System.out.println("Number of vowels in string: " + counter);
    }
}