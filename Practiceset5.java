import java.util.Scanner;

public class Practiceset5 {
    public static void main(String[] args) {

        // q-1 using for loop
        // for(int i=5;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("\n");
        // }



        // q-2
        // sum first n even numbers using while loop

        // int i =1;
        // int sum=0;
        // while(i<=5){
        //     int mul= i*2;
        //     sum = sum+ mul;
        //     i++;
        // }
        // System.out.println(sum);
        


        // q-3
        // print multn table of a given no n
        // int n=4;
        // for(int i=1;i<=10;i++){
            // int mul= n*i;
            // System.out.println(n+"x"+i+"="+mul);
            // System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }



        // q-4
        // print mul table of 10 in reverse number
        // int n=5;
        // for(int i=10;i>0;i--){
        //     int mul= n*i;
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);

        // }



        // q-5
        // factorial of a no using for loop: 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number you want to factorize: ");
        // int a = sc.nextInt();
        // int res= 1;
        // for(int i=a;i>0;i--){
        //     res = res*i;
        // }
        // System.out.printf("Factorial of %d is %d\n",a,res);



        // q-6
        //Factorial using while loop
        // int i=a;
        // while(i>0){
        //     res= res* i;
        //     i--;
        // }
        // System.out.printf("Factorial of %d is %d\n",a,res);




         // q-7
        // using while loop
        // int i=5;
        // int j=1;

        // while(i>0){
        //     while(j<=i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println("\n");
        //     i--;
        //     j=1;
        // }





        // q-9
        // sum of multiplication of 8

        // int n=8;
        // int sum=0;
        // for(int i=1;i<=10;i++){
        //     int mul= n*i;
        //     sum=sum+mul;
        // }
        // System.out.println(sum);



        // q-11
        // Repeat q-2 in for loop

        int sum=0;
        for(int i=1; i<=5;i++){
            int mul= i*2;
            sum= sum+mul;
        }
        System.out.println(sum);



        

    }
}
