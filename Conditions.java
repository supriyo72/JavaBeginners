import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int a = sc.nextInt();
        // ==,>=,<=,!=,>,<
        // if(a>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not an adult");
        // }

        // int age= 14;
        // boolean cond= (age==18);
        // if(cond){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not an adult");
        // }

        if(a>45){
            System.out.println("experienced");
        }
        else if(a>35){
            System.out.println("Semi experienced");
        }
        else if(a>24){
            System.out.println("Mini experienced");
        }
        else{
            System.out.println("Not experienced");
        }
    }
}
