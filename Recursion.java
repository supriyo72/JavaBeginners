import java.util.Scanner;

public class Recursion {
    static int factorial_recursive(int n){

        if(n==0 || n==1){
            return 1;
        }
        else{
            return n* factorial_recursive(n-1);
        }
        /*
        At Return:
        ex: n=5  5*fact_r(4)...5*4*fact_r(3)...
        */

    }
    static int fact_iterative(int n){
        int product=1;
        for(int i=n;i>0;i--){
            product= product*i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        int res= factorial_recursive(x);
        System.out.printf("Factorial of %d using recursive is %d",x,res);
        System.out.print("\n");


        System.out.println("Enter a number: ");
        int y= sc.nextInt();
        int reslt= fact_iterative(y);
        System.out.printf("Factorial of %d using iterative is %d",y,reslt);
        System.out.print("\n");


    }
}
