// class Base1{

//     public Base1(){
//         System.out.println("I am constructor");
//     }
// }

// class Derived1 extends Base1{
//     public Derived1(){
//         System.out.println("I am DERIVED constructor");
//     }
// }
// public class ConstrInh {
//     public static void main(String[] args) {

        // Base1 obj= new Base1();
//         Derived1 objj= new Derived1();
//     }
// }
//op I am constructor  I am DERIVED constructor







// class Base1{
//     public Base1(){
//         System.out.println("A");
//     }
//     public Base1(int a){
//         System.out.println("overload constructor: "+a);
//     }
// }

// class Derived1 extends Base1{
//     public Derived1(){
//         System.out.println("B");
//     }
// }
// public class ConstrInh {
//     public static void main(String[] args) {

        // Base1 obj= new Base1();
//         Derived1 objj= new Derived1();
//     }
// }
// o/p A B





// class Base1{
//     public Base1(){
//         System.out.println("A");
//     }
//     public Base1(int a){
//         System.out.println("overload constructor: "+a);
//     }
// }

// class Derived1 extends Base1{
//     public Derived1(){
//         super(100);
//         System.out.println("B");
//     }
// }
// public class ConstrInh {
//     public static void main(String[] args) {
//         Derived1 objj= new Derived1();
//     }
// }
// o/p   overload constructor:100   B





// class Base1{
//     public Base1(){
//         System.out.println("A");
//     }
//     public Base1(int a){
//         System.out.println("Base overload constructor: "+a);
//     }
// }

// class Derived1 extends Base1{
//     public Derived1(){
//         System.out.println("B");
//     }
//     public Derived1(int a,int b){
//         super(a);
//         System.out.println("Derived overload constructor: "+b);
//     }
// }
// public class ConstrInh {
//     public static void main(String[] args) {
//         Derived1 objj= new Derived1(10,89);
//     }
// }
/*
when super(a) is not included: o/p= A,Derived overload constructor: 89
when super(a) is included: o/p= Base overload constructor:10,Derived overload constructor: 89
*/






// class Base1{
//     public Base1(){
//         System.out.println("A");
//     }
//     public Base1(int a){
//         System.out.println("Base overload constructor: "+a);
//     }
// }

// class Derived1 extends Base1{
//     public Derived1(){
//         System.out.println("B");
//     }
//     public Derived1(int a,int b){
//         System.out.println("Derived overload constructor: "+b);
//     }
// }
// class childDerived extends Derived1{
//     public childDerived(){
//         System.out.println("XYZ");
//     }
//     public childDerived(int a,int b,int c){
//         super(a,b);
//         System.out.println("child-Derived overload constructor: "+c);
//     }
// }
// public class ConstrInh {
//     public static void main(String[] args) {
//         childDerived objj= new childDerived(10,89,76);
//     }
// }

/*
A
Derived overload constructor: 89
child-Derived overload constructor: 76
*/






class Base1{
    public Base1(){
        System.out.println("A");
    }
    public Base1(int a){
        System.out.println("Base overload constructor: "+a);
    }
}

class Derived1 extends Base1{
    public Derived1(){
        System.out.println("B");
    }
    public Derived1(int a,int b){
        super(a);
        System.out.println("Derived overload constructor: "+b);
    }
}
class childDerived extends Derived1{
    public childDerived(){
        System.out.println("C");
    }
    public childDerived(int a,int b,int c){
        super(a,b);
        System.out.println("child-Derived overload constructor: "+c);
    }
}
public class ConstrInh {
    public static void main(String[] args) {
        // childDerived objj= new childDerived();
        childDerived objj= new childDerived(10,89,76);
    }
}
//1: A B C

/*
2: Base overload constructor: 10
   Derived overload constructor: 89
   child-Derived overload constructor: 76

*/