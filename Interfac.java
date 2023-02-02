interface Bicycle{
    public void speedUp(int increment);
    public void speedDown(int decrement);
}
class Speeds implements Bicycle{
    int speed1=45;
    int speed2=40;

    public void speedUp(int increment){
        speed1=speed1+increment;
        System.out.println(speed1);
    }
    public void speedDown(int decrement){
        speed2=speed2-decrement;
        System.out.println(speed2);
    }

}
public class Interfac {
    public static void main(String[] args) {
        Speeds obj= new Speeds();
        obj.speedUp(10);
        obj.speedDown(5);
    }
}
