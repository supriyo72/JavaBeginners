// Create a class circle and use inheritance to create cylinder
class Circ{
    public int radius;

    public Circ(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylind extends Circ{
    public int height;

    public Cylind(int r,int h){
        super(r);
        this.height=h;
    }
    public double vol(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class CircCylInheritance {
    public static void main(String[] args) {
        Cylind obj=new Cylind(10, 5);
        System.out.println(obj.vol());
        System.out.println(obj.area());
    }
}
