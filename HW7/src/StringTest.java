import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            System.out.print("Enter a string: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("quit")){
                flag = false;
                sc.close();
            }
            else{
                NoWordsDisplay numwords = new NoWordsDisplay();
                numwords.update(input);
                LengthDisplay len = new LengthDisplay();
                len.update(input);
                VowelsDisplay vow = new VowelsDisplay();
                vow.update(input);
                CaseDisplay cd = new CaseDisplay();
                cd.update(input);
            }
            System.out.println();
        }
    }
}