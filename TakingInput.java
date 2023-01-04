import java.util.Scanner;

// public class TakingInput {
//     public static void main(String[] args) {
//         System.out.println("Taking input from user: ");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a no1: ");
        // int a = sc.nextInt();
//         float a = sc.nextFloat();
//         System.out.println("Enter a no2: ");
        // int b = sc.nextInt();
//         float b = sc.nextFloat();
//         float sum= a+b;
//         System.out.println("The sum is: " + sum);

//     }
// }



// boolean-->hasNextInt-->To validate
// hasNext
public class TakingInput {

    public static void main(String[] args) {
        System.out.println("Taking input");

        System.out.println("Enter no1: ");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        Scanner scc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // String str= scc.next();
        String str= scc.nextLine();
        System.out.println("The string is: " + str);
    }
}