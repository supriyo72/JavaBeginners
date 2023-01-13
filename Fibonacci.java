// Iterative
// import java.util.Scanner;

// public class Fibonacci {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int x= sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int y= sc.nextInt();

//         System.out.print(x);
//         System.out.print(" "+y);
//         for(int i=2;i<10;i++){
//             int c= x+y;
//             System.out.print(" "+ c);
//             x=y;
//             y=c;
//         }
//     }
// }







// Using void type/method overloading
import java.util.Scanner;

public class Fibonacci {
    static void fib(int a,int b){

        for(int m=2;m<10;m++){
            int z= a+b;
            System.out.print(" "+z+ " ");
            a=b;
            b=z;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y= sc.nextInt();

        System.out.print(x);
        System.out.print(" "+y);

        fib(x,y);
    }
}