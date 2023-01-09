// public class MethodOverloading {

//     static void greeting(){
//         System.out.println("Hello");

//     }
//     public static void main(String[] args) {
//         greeting();
//     }
// }





// public class MethodOverloading {

//     static int mySum(int x,int y){
//         int sum;
//         sum= x+y;
//         return sum;
//     }

//     public static void main(String[] args) {

//         int a=5;
//         int b=10;
//         int res;
//         MethodOverloading obj= new MethodOverloading();
//         res= obj.mySum(a, b);
//         System.out.println(res);
//     }
// }





public class MethodOverloading {

    static void greeting(){
        System.out.println("Hello");

    }
    // changing the integer
    static void change(int a){
        a=45;
    }
    // changing array
    static void change2(int [] arr){
        arr[0] = 98;
    }
    // method overloading

    static void foo(){
        System.out.println("vada paw");
    }

    static void foo(int a){
        System.out.printf("%d vada paw",a);
        System.out.println("");
    }

    static void foo(int a,int b){
        System.out.printf("%d vada paw and %d samosa paw",a,b);
        System.out.println(a+" vada paw");
        System.out.println(b+" vada paw");
    }

    // parameters need to be changed in method overloading not methods.
    public static void main(String[] args) {

        // changing the integer
        // int x=98;
        // change(x);
        // System.out.println(x);

        // changing array
        // int [] marks= {45,74,76,83,55};
        // change2(marks);
        // System.out.println(marks[0]);


        // Method Overloading
        foo();
        foo(22);
        foo(10,20);


    }
}