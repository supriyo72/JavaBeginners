abstract class parent2{
    public parent2(){
        System.out.println("I am constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends parent2{
    public child2(){
        System.out.println("child2 constructor");
    }
    public void greet(){
        System.out.println("Greeting you");
    }
    public void greet2(){
        System.out.println("Greeting you twice");
    }
}
abstract class child3 extends parent2{
    public void hii(){
        System.out.println("hiiiiii");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        child2 obj =  new child2();
        // child3 objj = new child3(); ---> error
        // parent2 objjj = new parent2(); ---> error
    }
}
