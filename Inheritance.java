class Base{
    int a;
    
    public void setX(int x) {
        System.out.println("setting x");
        this.a = x;
    }
    public int getX() {
        return a;
    }
}
class Derived extends Base{
    int b;
    public void setY(int y) {
        System.out.println("Setting Y");
        this.b = y;
    }
    public int getY() {
        return b;
    }
    

}
public class Inheritance {
    public static void main(String[] args) {
        Base objj = new Base();
        objj.setX(7);
        //objj.setY(10);   //error
        System.out.println(objj.getX());
        //System.out.println(objj.getY());    //Error


        Derived obj = new Derived();
        obj.setX(45);
        obj.setY(1100);
        System.out.println(obj.getX());
        System.out.println(obj.getY());

    }
}
