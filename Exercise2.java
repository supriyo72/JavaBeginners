import java.util.Random;
import java.util.Scanner;


public class Exercise2 {

    public static void main(String[] args) {
        // 0= stone 1= paper 2=scissor

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number 0->stone, 1->paper 2->scissor");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        

        if(UserInput==ComputerInput){
            System.out.println("Draw!!");
        }
        else if(UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 || UserInput== 2&& ComputerInput==1){
            System.out.println("You won!!");
        }
        else{
            System.out.println("Computer won");
        }

        System.out.println("Your input: "+UserInput);
        System.out.println("Computer input: "+ComputerInput);



    }
    
}
