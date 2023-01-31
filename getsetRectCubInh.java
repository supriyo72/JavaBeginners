class Rect{
    public int length;
    public int breadth;

    public void setLen(int l){
        this.length=l;
    }
    public void setBre(int b){
        this.breadth=b;
    }
    public double area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rect{
    public int height;
    
    public void setHei(int h){
        this.height=h;
    }
    public double SurfArea(){
        return 2*this.length*this.breadth +2*this.breadth*this.height+ 2*this.height*this.length;
    }
}
public class getsetRectCubInh {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid();
        obj.setLen(15);
        obj.setBre(100);
        obj.setHei(5);
        System.out.println(obj.SurfArea());
        System.out.println(obj.area());

    }
}
