import java.util.Scanner;

public class Day03Devamı {
    //Soru:  bir string giriniz, girilen stringde xyz varsa true, yoks false dönen bir method yazınız..
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen beir kelime yazınız");
        String str= input.nextLine().toLowerCase();
        xyzVarmi(str);
        System.out.println(xyzVarmi(str));
    }

    private static boolean xyzVarmi(String str) {
        if(str.contains("xyz")){
            return true;
        }else
        return false;
    }

}

