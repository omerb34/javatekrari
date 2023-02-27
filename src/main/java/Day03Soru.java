public class Day03Soru {
    public static void main(String[] args) {
        String name1="fatmam";
        String name2="omer";
        //1.yol
       // if (name1.length()%2==0){
            //System.out.println(name1.substring(0,3)+name2+name1.substring(2));
        //}else
      //  System.out.println("name1 cift sayisi olmadığı için ortasına koyamadık");

//2.yol
        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
        }else
            System.out.println("name1 cift sayisi olmadığı için ortasına koyamadık");
        
    }
}
