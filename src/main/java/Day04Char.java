import java.util.Scanner;

public class Day04Char {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir kelime");
        String str= input.next();
        char ortanca= str.charAt((str.length()-1)/2);
        if (str.length()%2==1 && str.length()>=3){
            System.out.println(ortanca);
        }
    }
}
