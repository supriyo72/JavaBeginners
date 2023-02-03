interface Bicycle{
    int a=300;
    public void speedUp(int increment);
    public void speedDown(int decrement);
}
interface Horn{
    void HornCycle();
    void HornBike();
}
class Speeds implements Bicycle,Horn{
    int speed1=45;
    int speed2=40;

    public void demo(){
        System.out.println("DEMO method");
    }
    public void speedUp(int increment){
        speed1=speed1+increment;
        System.out.println(speed1);
    }
    public void speedDown(int decrement){
        speed2=speed2-decrement;
        System.out.println(speed2);
    }
    public void HornBike(){
        System.out.println("Bike poo poo poo poo");
    }
    public void HornCycle(){
        System.out.println("Cycle pee pee pee pee");
    }

}
public class interfacE {
    public static void main(String[] args) {
        Speeds obj= new Speeds();
        obj.speedUp(10);
        obj.speedDown(5);
        //obj.a=100;  //can't modify interfaces as they are final
        // System.out.println(obj.a);
        obj.HornBike();
        obj.HornCycle();
    }
}
