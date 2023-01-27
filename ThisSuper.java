// class This{
//     public int x;

//     This(int x){
        // x=x;   o/p=0
//         System.out.println("This constructor");
//         this.x=x;
//     }
//     public int getX(){
//         return x;
//     }
// }

// public class ThisSuper {
//     public static void main(String[] args) {
//         This obj= new This(10);
//         System.out.println(obj.getX());
        

//     }
// }
/*
This constructor
10
*/





// class This{
//     public int x;

//     This(int x){
//         System.out.println("This constructor "+x);
//         this.x=x;
//     }
//     public int getX(){
//         return x;
//     }
// }
// class DerivedThis extends This{
//     DerivedThis(int y){
//         super(y);
//         System.out.println("DerivedThis constructor "+y);
//     }

// }
// public class ThisSuper {
//     public static void main(String[] args) {
//         DerivedThis objj= new DerivedThis(10);

//     }
// }

/*
o/p
This constructor 10
DerivedThis constructor 10
*/





class This{
    public int x;

    This(int x){
        System.out.println("This constructor "+x);
        this.x=x;
    }
    public int getX(){
        return x;
    }
}
class DerivedThis extends This{
    DerivedThis(int x,int y){
        super(x);
        System.out.println("DerivedThis constructor "+y);
    }

}
public class ThisSuper {
    public static void main(String[] args) {
        DerivedThis objj= new DerivedThis(10,100);

    }
}
/*
This constructor 10
DerivedThis constructor 100
*/

