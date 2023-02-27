import java.util.Scanner;

public class Upskillstring {
    public static void main(String[] args) {

        // String a= "aman gupta BOAT";
        // String b="kutta";
        // String c=" Sumon";
        // int n=100;
        // System.out.println(a+b);/
        // String str= b.concat(c);
        // System.out.println(str);
        // System.out.println(a.toLowerCase());
        // System.out.println(a.toUpperCase());

        // System.out.println(b+n);
        // System.out.println(a.length());

        String space= "    ram lakshman seeta    ";
        // System.out.println(space.trim());
        String e="";
        // System.out.println(e.isEmpty());
        // System.out.println(c.isEmpty());

        /*
        if both the strings are same--> 0
        if o/p is +ve--> str1>str2
        if o/p is -ve--> str2>str1
        */
        // String c1= "ABCD";
        // String c2= "ABCD";
        // System.out.println(c1.compareTo(c2));


        // String c3= "ABCDE";
        // String c4= "aBCDE";
        // System.out.println(c3.compareTo(c4));
        // System.out.println(c3.toLowerCase().compareTo(c4.toLowerCase()));
        // System.out.println(c3.compareToIgnoreCase(c4));

        // System.out.println(c1.equals(c2));
        // System.out.println(c3.equals(c4));
        // System.out.println(c3.equalsIgnoreCase(c4));


        // String m= "[A-Z]{1,}";
        // System.out.println(c3.matches(m));

        // if(c3.equals(c4)){
        //     System.out.println("it is equal");
        // }else{
        //     System.out.println("Not equal");
        // }

        // String sup= "I love fam also love to fans";
        // String supp= "fam";
        // String su="kamal";
        // String ss= "FAm";
        // System.out.println(sup.contains(supp));
        // System.out.println(sup.contains(su));
        // System.out.println(sup.toLowerCase().contains(ss.toLowerCase()));
        // String hat= "harryabryabrry";
        // System.out.println(hat.startsWith("ab"));
        // System.out.println(hat.startsWith("har"));
        // System.out.println(hat.endsWith("rr"));
        // System.out.println(hat.endsWith("ry"));

        // System.out.println(sup.indexOf("love"));
        // System.out.println(sup.indexOf("love",6));
        // System.out.println(sup.lastIndexOf("love"));
        // System.out.println(hat.lastIndexOf("ry"));
        // String hat= "harryabrryabrry"; -->o/p 8
        // String hat= "harryabryabrry";  -->o/p 7
        // System.out.println(hat.lastIndexOf("ry",8));



        String splt= "A_B_c_f";
        String def= "_";
        String deff="c";

        String [] arr10= splt.split(deff);
        for(String ee:arr10){
            System.out.println(ee);
        }

        String garbage= "ujffjf 9*9{]';:/.'juddikk ddh+_3'[].3xxfr`fgfg vf {|} :{$%%^22";

        String replgar= "[^A-Za-z0-9\\s]";
        System.out.println(garbage.replaceAll(replgar,""));

        int num=110;
        System.out.println(Integer.toString(num));
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

        String str1= "110";
        String str2="1101110";
        String str3="156";
        String str4="6e";

        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.parseInt(str1,2));
        System.out.println(Integer.parseInt(str1,8));
        System.out.println(Integer.parseInt(str1,16));



    }
}



// public class Upskillstring {

//     public static void main(String[] args) {
//         // int [] arr1= {4,32,128,256,256,0};
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();

//         int start=4;
// 		int div=8;


//         for(int i=0;i<num;i++){
// 			System.out.print(start+" ");
// 			start= start*(div);
// 			div=div/2;
//         }
//     }
// }



