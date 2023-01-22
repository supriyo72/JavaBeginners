import java.util.Scanner;

//q-1 Multiplication of n
// public class PracticeSetMethods {
//     static void num(int n){
//         int prod;
//         for(int i=1;i<=10;i++){
//             prod=n*i;
//             System.out.println(prod);
//         }
//     }
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Which table u want: ");
        // int x= sc.nextInt();

//         num(x);
//     }
// }





// q-2 pattern1
// public class PracticeSetMethods {
//     public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
//     }
// }

// using methods
// public class PracticeSetMethods {
//     static void patt1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//     }

//     public static void main(String[] args) {
//         patt1(9);
//     }
// }






//q-3 find sum of n natural nos using recursive
// using method
// public class PracticeSetMethods {
//     static int mySum(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         return sum;

//     }

//     public static void main(String[] args) {
//         int res= mySum(10);
//         System.out.println(res);
//     }
// }

/*
recursive
sum(3)= 3+sum(2)
sum(3)= 3+2+sum(1)=3+2+1=6
*/
// public class PracticeSetMethods {
//     static int mySum(int n){
//         if(n==1){
//             return 1;
//         }
//         else{
//             return n+ mySum(n-1);

//         }
//     }
//     public static void main(String[] args) {
//         int res= mySum(3);
//         System.out.println(res);
//     }
// }





//q-4 pattern2
// public class PracticeSetMethods {
//     static void patt1(int n){
//         for(int i=n;i>0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }

//     }
//     public static void main(String[] args) {
//         patt1(4);
//     }
// }





// q-5 nth term of fibonacci series using recursion,nth means it starts from 1
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
/*
fib(6)=fib(5)+fib(4)+
      fib(4)+fib(3)+
      fib(3)+fib(2)+
      fib(2)+fib(1)
*/

// public class PracticeSetMethods {
//     static int fib(int n){
        // if(n==1){
        //     return 0;
        // }
        // else if(n==2){
        //     return 1;
        // }
//         if(n==1 || n==2){
//             return n-1;
//         }
//         else{
//             return  fib(n-1) + fib(n-2);
//         }

//     }
//     public static void main(String[] args) {

//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter term: ");
//         int x= sc.nextInt();
//         int res=fib(x);
//         System.out.println(res);
//     }
// }





// q-6 find average of a set of nos in the argument:
// public class PracticeSetMethods {
//     static float marksAvg(float ...arr){
//         float sum=0;
//         for(float e: arr){
//             sum=sum+e;
//         }
//         float res= sum/5;
//         return res;
//     }
//     public static void main(String[] args) {
//         System.out.println("Average marks of 5 subj is: "+marksAvg(47,57,73,48,56));
//     }
// }







//q-7: write q-2 using recursion
// public class PracticeSetMethods {
//     static void rec_pattern(int n){
//         if(n>0){
//             rec_pattern(n-1);
//             for(int i=0;i<n;i++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

//     public static void main(String[] args) {
//         rec_pattern(3);
//     }
// }







//q-8: write q-4 using recursion
// public class PracticeSetMethods {
//     static void rec_pattern(int n){
//         if(n>0){
//             for(int i=0;i<n;i++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//             rec_pattern(n-1);
//         }
//     }

//     public static void main(String[] args) {
//         rec_pattern(4);
//     }
// }







// q-9 conversion of celsius to faherenit
// (c * 9 / 5) + 32
// public class PracticeSetMethods {
//     static void fahr(float c){
//         if(c==0){
//             System.out.println("32 Fahrenit");
//         }
//         else{
//             float res= (c * 9 / 5) + 32;
//             System.out.println(res+" fahrenit");
//         }
//     }
//     public static void main(String[] args) {
//         fahr(21);
//     }
// }







// q-10 Repeat 3 in iterative:

public class PracticeSetMethods {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}



