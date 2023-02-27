import java.util.Scanner;

public class Day05MehodCreationOrnek {

    // Kullıcıdan bir cm değeri iste,bu metreye ve km ye çeviren bir moethod crate et..

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir cm değeri giriniz");
        double cmValue= scan.nextDouble();

        convert(cmValue);

    }

    private static void convert(double cmValue) {
        double metre= cmValue/100;
        double km=cmValue/100000;
        System.out.println("cm değeriniz=" + metre + "olup" + "cm değeriniz aynı zamanda =" + km + "kmdir");
    }


}
