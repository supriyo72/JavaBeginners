// public class VarArg {
//     static int mySum(int a,int b){
//         int sum= a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         int res= mySum(5, 5);
//         System.out.println("Sum of a and b is: "+ res);
//     }
// }



// public class VarArg {
//     static int mySum(int a,int b){
//         return a+b;
//     }
//     static int mySum(int a,int b,int c){
//         return a+b+c;
//     }
//     static int mySum(int a,int b,int c,int d){
//         return a+b+c+d;
//     }
//     public static void main(String[] args) {
//         System.out.println("Sum of a and b is: "+ mySum(5,6));
//         System.out.println("Sum of a b c is: "+ mySum(5,6,7));
//         System.out.println("Sum of a,b,c&d is: "+ mySum(5,6,88,9));
//     }
// }





//using variable argument:

// public class VarArg {
//     static int mySum(int ...arr){
//         int sum=0;
//         for(int e: arr){
//             sum=sum+e;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println("Sum of a and b is: "+ mySum(5,6));
//         System.out.println("Sum of a b c is: "+ mySum(5,6,7));
//         System.out.println("Sum of a,b,c&d is: "+ mySum(5,6,88,9));
//         System.out.println("Sum of Nothing is: "+ mySum());
//     }
// }





public class VarArg {
    static int mySum(int x,int ...arr){
        int res=x;
        for(int e: arr){
            res=res+e;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Sum of a and b is: "+ mySum(5,6));
        System.out.println("Sum of Nothing now becomes: "+ mySum(4));
    }
}