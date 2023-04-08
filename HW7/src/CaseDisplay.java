public class CaseDisplay implements StringObserver{
    public void update(String s){
        int lowercounter = 0;
        int uppercounter = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowercounter++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                uppercounter++;
            }
        }

        System.out.println("Number of lowercase letters in string: " + lowercounter);
        System.out.println("Number of uppercase letters in string: " + uppercounter);
    }
}