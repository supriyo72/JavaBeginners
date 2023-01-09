// public class Methods {
//     public static void main(String[] args) {
        
//         int a=5;
//         int b=6;
//         int c;
//         if(a>b){
//             c= a+b;
//         }
//         else{
//             c= (a+b)*5;
//         }
//         System.out.println(c);

//         int a1=15;
//         int b1=6;
//         int c1;
//         if(a1>b1){
//             c1= a1+b1;
//         }
//         else{
//             c1= (a1+b1)*5;
//         }
//         System.out.println(c1);
//     }
// }






// public class Methods {
//     static int logic(int x,int y){
//         int z;
//         if(x>y){
//             z=x+y;
//         }
//         else{
//             z=(x+y)*5;
//         }
//         return z;
//     }
//     public static void main(String[] args) {
        
//         int a=5;
//         int b=6;
//         int c;
//         c=logic(a, b);

//         int a1=15;
//         int b1=6;
//         int c1;
//         c1=logic(a1, b1);

//         System.out.println(c);
//         System.out.println(c1);
//     }
// }




// public class Methods {
//     static int mySum(int x,int y){
//         int sum;
//         sum= x+y;
//         return sum;
//     }
//     public static void main(String[] args) {
//         int a= 5;
//         int b= 19;
//         int c;
//         c= mySum(a,b);
//         System.out.println(c);
//     }
// }







public class Methods {
    int mySum(int x,int y){
        int sum;
        sum= x+y;
        return sum;
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 19;
        int c;

        Methods obj= new Methods();
        c= obj.mySum(a,b);
        System.out.println(c);
    }
}
