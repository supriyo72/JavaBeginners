
import java.util.Scanner;

class Player{
    String name;
    int age;
    String country;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
}
public class getsetproblem1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a= sc.nextLine();
        System.out.println("Enter Age: ");
        int b= sc.nextInt();
        System.out.println("Enter Country: ");
        String c= sc.next();
        System.out.println("Player Details:");


        Player obj=new Player();
        obj.setName(a);
        obj.setAge(b);
        obj.setCountry(c);

        System.out.println("Name:"+obj.getName());
        System.out.println("Age:"+obj.getAge());
        System.out.println("Country:"+obj.getCountry());
    }
}
