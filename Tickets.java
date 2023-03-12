import java.util.Scanner;

class Ticket{
    int ticketid;
    int price;
    static int totalnooftickets;
    int nooftickets;

    public void setTotTickets(int totalnooftickets){
        this.totalnooftickets=totalnooftickets;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setFinalTickets(int nooftickets){
        this.nooftickets=nooftickets;
    }
    public void displayDetails(){
        System.out.println("Total no of tickets: "+this.totalnooftickets);
        System.out.println("Total amount: "+price);
    }
    public int Calculatetotalamount(){
        int res= nooftickets;
        return res;
    }
}
public class Tickets{
    public static void main(String[] args) {
        Ticket obj= new Ticket();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of objects:");
        int objects= sc.nextInt();
        System.out.println("Enter the Total no of tickets:");
        int TotTick= sc.nextInt();

        int c=0;
        while(true){
            int FinPrice=0;

            System.out.println("Enter the ticketid:");
            int id= sc.nextInt();

            System.out.println("Enter the price:");
            int price=sc.nextInt();

            System.out.println("Enter the no of tickets:");
            int noTick=sc.nextInt();

            if(noTick>TotTick){
                System.out.println("Total no of tickets: "+TotTick);
                System.out.println("Sorry tickets not available.");
                c=c+1;
                continue;
            }

            FinPrice= noTick*price;
            int AfterBook= TotTick-noTick;

            obj.setPrice(FinPrice);
            obj.setTotTickets(TotTick);
            
            obj.displayDetails();
            obj.setFinalTickets(AfterBook);
            System.out.println("Total no of ticket after booking: "+obj.Calculatetotalamount());

            
            TotTick=AfterBook;
            c=c+1;
            if(c>=objects || TotTick<0 ){
                break;
            }
        }
    }
}
