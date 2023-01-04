import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we can also use sc.nextFloat() so that we can write the marks of the subject in decimals ex: 45.76,87.54
        System.out.println("Enter mwe marks: ");
        float a = sc.nextInt();
        System.out.println("Enter mc marks: ");
        float b = sc.nextInt();
        System.out.println("Enter dl marks: ");
        float c = sc.nextInt();
        System.out.println("Enter ice marks: ");
        float d = sc.nextInt();
        System.out.println("Enter csl marks: ");
        float e = sc.nextInt();

        float sum= a+b+c+d+e;
        float res= sum/500.0f * 100.0f;

        System.out.println("The percentage is: " + res+"%");

    }
}