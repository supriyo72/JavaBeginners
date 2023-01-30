import java.util.Random;
import java.util.Scanner;

class Game{

    public int UserInput;
    public int ComputerInput;
    public int number;
    public int noOfGuesses=0;

    Game(){
        Random rand = new Random();
        this.ComputerInput=rand.nextInt(100);
    }
    void User(){
        System.out.println("Guess the no: ");
        Scanner sc= new Scanner(System.in);
        UserInput= sc.nextInt();
    }
    boolean isCorrectNo(){
        noOfGuesses++;
        if(UserInput==ComputerInput){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(UserInput<ComputerInput){
            System.out.println("you Guessed a less no");
        }
        else if(UserInput>ComputerInput){
            System.out.println("You guessed a high no");
        }
        return false;
    }
}
public class Exercise3 {
    public static void main(String[] args){

        Game g=new Game();
        boolean b=false;
        while(b==false){
        g.User();
        b= g.isCorrectNo();
        System.out.println(b);
        }
    }
}



