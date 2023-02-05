// q-1 Create abs class pen and two abstract method
abstract class Pen{
    abstract public void refill();
    abstract public void write();
}
// q-2 Create a class extending an abstract class with an additional method
class fountainpen extends Pen{
    public void refill(){
        System.out.println("Refill the ink");
    }
    public void write(){
        System.out.println("Writing with blue pen");
    }
    public void ChangeNib(){
        System.out.println("Change Nib from 0.5 to 1");
    }
}
// q-3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Monkey jumping");
    }
    public void bite(){
        System.out.println("Monkey biting");
    }
}
class human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void smile(){
        System.out.println("smiling");
    }
}

// q-6,q-7
interface smartTvRemote{
    void channel();
}
interface TvRemote extends smartTvRemote{
    void smartChann();
}
class Tv implements TvRemote{
    public void channel(){
        System.out.println("Tv Channels");
    }
    public void smartChann(){
        System.out.println("Smart Tv channels");
    }
}
public class Practice_Abstract_Interface {
    public static void main(String[] args) {
        fountainpen obj = new fountainpen();
        obj.ChangeNib();
        obj.refill();

        // q-5 polymorphism
        Monkey m = new human();
        // m.eat();  -->error
        // m.smile(); -->error
        m.jump();

        BasicAnimal b= new human();
        // b.smile();  -->error
        b.eat();
        b.sleep();

        // q-6,q-7
        Tv t= new Tv();
        t.channel();
        t.smartChann();
    }
}
