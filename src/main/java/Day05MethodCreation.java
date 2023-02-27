public class Day05MethodCreation {

    /*
    Bir string içindeki karakterleri en fazla bir kere yazdıran method create ediniz.
    örn: "aasbsbsbsaaa" --> çıktı asb olacak..

     */

    public static void main(String[] args) {
        birkereyazdir("oommerrr");
    }

    private static void birkereyazdir(String str) {
        String output="";// bir çıktı alacağız onlar buraya geleecek...
        for (int i = 0; i <str.length() ; i++) {
            if (!output.contains(str.substring(i,i+1))){//tekrarrsız kareketereri döndüreceğiz.
output= output + str.substring(i,i+1);
            }

        }
        System.out.println(output);
    }


}
