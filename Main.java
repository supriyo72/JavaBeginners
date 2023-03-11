import java.util.Scanner;

class ItemType{
    private String name;
    private Double costPerDay;
    private Double deposit;

    public void setName(String name){
        this.name=name;
    }
    public void setCostPerDay(Double costPerDay){
        this.costPerDay=costPerDay;
    }
    public void setDeposit(Double deposit){
        this.deposit=deposit;
    }
    public void display(){
        System.out.println("Item type details");
        System.out.println("Name:" + this.name);
        System.out.printf("CostPerDay: %.2f",this.costPerDay);
        System.out.println("");
        System.out.printf("Deposit: %.2f",this.deposit);
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the item type name");
        String a=sc.nextLine();
        System.out.println("Enter the cost per day");
        Double b=sc.nextDouble();
        System.out.println("Enter the deposit");
        Double c=sc.nextDouble();

        ItemType obj= new ItemType();
        obj.setName(a);
        obj.setCostPerDay(b);
        obj.setDeposit(c); 
        obj.display();
    }
}