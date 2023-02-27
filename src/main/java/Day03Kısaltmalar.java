import java.util.Scanner;

public class Day03Kısaltmalar {
    /*
   \n yada \r => konsolda metni bir alt satırdan itibaren yazdırır.
   \t =>         bir tab miktarı yana kaydırmak için kısaltma..
   \\=>          konsolda \ ters slash yazdırır
   \' =>         konolda ' tek tırnak yazdırır.
   \" =>         konsolda  "" çift tırnak yazdırır.


     */
    public static void main(String[] args) {
        // soru1: Konsola "Hello ", "World \ //" şeklinde yazı yazınız.
        System.out.println("\"Hello \",\"World \\ //\"");
        System.out.println(" ,                                                                                                                                                      hello world");

        // soru 2: pazartesi kelimesini her harfini ayrı bir satıra gelecek bıcımde yaz.
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        //Soru 3: kullanıcıdan iki sayı alınız ve bunları toplayıp, toplamını ekrana yazdırınız.
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz");
        int sayi1=input.nextInt();
        System.out.print("Lütfen İkinci sayıyı giriniz..");
        int sayi2=input.nextInt();
        int toplam= sayi1+sayi2;
        System.out.println("Girdiğiniz iki sayının toplamı:"+toplam);
    }







}
