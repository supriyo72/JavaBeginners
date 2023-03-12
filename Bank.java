import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

class Customer{
    String name;
    String account;
    Double balance;
    static int noOfTransactions;

    // public void setBalance(Double balance){
    //     this.balance=balance;
    // }

    public void deposit(double amount){
        this.balance=amount;
    }
    public void displayDeposit(){
        System.out.println("Your balance after the transaction is : "+ balance);

    }
    public void withdrawl(double amount){

    }

}
public class Bank {
    public static void main(String[] args) {
        Customer obj=new Customer();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name");
        String identity= sc.nextLine();
        System.out.println("Enter the accountType [Current , Savings, Demat]");
        String accType= sc.next();
        System.out.println("Enter the balance");
        Double bal= sc.nextDouble();

    double FinalBal=0;
    int transactions=0;
    while(true){
        System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
        Double num=sc.nextDouble();

        if(num==1){
            System.out.println("Enter the amount to deposit");
            Double dep=sc.nextDouble();
            bal=dep+bal;
            obj.deposit(bal);
            obj.displayDeposit();
            // System.out.println("Your balance after the transaction is : "+ bal);
            transactions=transactions+1;

        }
        else if(num==2){
            System.out.println("Enter the amount to withdraw");
            Double withd= sc.nextDouble();
            if(withd>bal){
                System.out.println("Insufficient Balance");
            }
            else{
                FinalBal=bal-withd;
                System.out.println("Your balance after the transaction is : "+ FinalBal);
                transactions=transactions+1;
                bal=FinalBal;
            }
        }
        else if(num==3){
            System.out.println("Number of Transactions done : "+transactions);
            break;
        }

    }
    }
}
