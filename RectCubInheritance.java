class Rect{
    public int length;
    public int breadth;

    public Rect(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public double area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rect{
    public int height;

    public Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    public double SurfArea(){
        return 2*this.length*this.breadth +2*this.breadth*this.height+ 2*this.height*this.length;
    }
}
public class RectCubInheritance {
    public static void main(String[] args) {
        Cuboid obj=new Cuboid(10,5,4);
        System.out.println(obj.area());
        System.out.println(obj.SurfArea());
    }
}
