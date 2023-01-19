// prob-1
// prob-2: create a class cellphone with methods to print ringing,vibrating...etc
// prob-3: create a class square, initialize its side area perimeter\
// prob-4: Do same with rectangle
// prob-5: create a class viceCity for rockstar games capable of hitting(print hitting),running,firing etc
// prob-6: do same with circle
class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing phone.....");
    }
    public void holding(){
        System.out.println("holding phone.....");
    }
    public void rejecting(){
        System.out.println("rejecting phone.....");
    }

}
class square{
    int side;

    public int area(){
        return side*side;
    }
    public int perim(){
        return 4*side;
    }
}
class rect{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perim(){
        return 2*(length+breadth);
    }
}
class viceCity{
    public void hit(){
        System.out.println("hit the enemies...");
    }
    public void run(){
        System.out.println("run from the enemies...");
    }
    public void fire(){
        System.out.println("fire on the enemies...");
    }
}
class circle{
    float side;

    public float area(){
        return 3.14f*side*side;
    }
    public float perim(){
        return 2*3.14f*side;
    }
}
public class PracticeSetOops {
    public static void main(String[] args) {
        /*
        // prob-1
        Employee supu=  new Employee();
        supu.salary=38756;
        supu.setName("Supriyo Ghosh");
        System.out.println(supu.getsalary());
        System.out.println(supu.getName());

        // prob-2
        CellPhone obj=new CellPhone();
        obj.ringing();
        obj.holding();
        obj.rejecting();
        */

        // prob-3
        square objj= new square();
        objj.side=3;
        System.out.println(objj.area());
        System.out.println(objj.perim());

        // prob-4
        rect ob= new rect();
        ob.length=5;
        ob.breadth=4;
        System.out.println(ob.area());
        System.out.println(ob.perim());

        // prob-5
        viceCity rockgames= new viceCity();
        rockgames.run();
        rockgames.hit();
        rockgames.fire();


        // prob-6
        circle o= new circle();
        o.side=4;
        System.out.println(o.area());
        System.out.println(o.perim());
    }
}
