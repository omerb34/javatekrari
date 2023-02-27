import java.util.Scanner;

public class Day04StringManupulations_parseDouble {
    public static void main(String[] args) {
//   // kullanıcıdan ismini ve soy ismini girmesini isteyin. sonra konsolatam ısmı büyük harfler ile yazınız..

//   Scanner input = new Scanner(System.in);
//   System.out.println("lütfen isminizi giriniz");
//   String isim = input.nextLine();
//   System.out.println("lütfen soy isminizi giriniz");
//   String soyisim = input.nextLine();
//   String tamisim = isim.toUpperCase() + " " + soyisim.toUpperCase();
//   System.out.println("tamisim=" + tamisim);

//ru 2  kullanıcıdan iki isim al birinci hecelerini sil kalanları topla

//   Scanner input2 = new Scanner(System.in);
//   System.out.println("lütfen birinci kelime ");
//   String kelime1 = input2.nextLine();
//   System.out.println("lütfen ikinci kelime.. ");
//   String kelime2 = input2.nextLine();
//   String yenikelime = kelime1.substring(1) + kelime2.substring(1);
//   System.out.println(yenikelime);
//züm açıklaması: burada substring kullandık ve 1. indeksten sonrasını yazdırdık sonra ikisini topladık...
//   // replace() aklımıza geldi ancak kullanıcının hangi kelimeyi gireceğini bilmediğimiz için kullanamadık.

//   //************************************************************************************************//

//   /*
//   NOT===>>> parseDouble() ,parseInteger methodları String bir ifadeyi sayıya dönüştürmektedir......

//    */

//ring biçimde verilen iki fiyatın toplamını bulunuz....?

        String str1 = "$12.99";
        String str2 = "$14.85";
        str1 = str1.replaceAll("\\D", ""); //1299 oldu. noktalamaların tamamı \\D ile gitti..
        str2 = str2.replaceAll("\\D", "");// 1485 oldu.noktalamaların tamamı \\D ile gitti.
        System.out.println(str1 + str2);// burada iki sayının toplamı değil iki stringin concaat olması sonucu ortaya çıkar.Ki amacımız bu değil..

        double sayi1 = Double.parseDouble(str1);// string alan 12.99 doları double a çevirdik
        double sayi2 = Double.parseDouble(str2);
        double toplam = (sayi1 + sayi2) / 100;// toplamı 100 e bolduk kı sonuc double cıksın....
        System.out.println("$" + (sayi1 + sayi2));


        //kullanıcıdan 3 tane kelime alın. ilk kelimin ilk harfi büyük olacak bıcımde hepsnini yanyana yazıdırınız..

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kelime");
        String kelime1 = scan.next().toLowerCase();
        System.out.println("ikinci kelime");
        String kelime2 = scan.next().toLowerCase();
        System.out.println("ücüncü kelime");
        String kelime3 = scan.next().toLowerCase();
        System.out.print(kelime1.substring(0, 1).toUpperCase() + kelime1.substring(1) + "," + kelime2 + "," + kelime3);


    }

}


