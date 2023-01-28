// class Father{
//     int x;
//     Father(int x){
//         System.out.println("I am a Father Constructor: "+x);
//     }
//     public void setX(int x){
//         this.x=x;
//     }
//     public int getX(){
//         return x;
//     }
// }
// public class proxyy {
//     public static void main(String[] args) {
//         Father obj= new Father(200);
//         obj.setX(100);
//         System.out.println(obj.getX());

//     }
// }







// class Father{
//     Father(){
//         System.out.println("I am father construtor with no arg");
//     }
//     Father(int x){
//         System.out.println("I am a Father Constructor: "+x);
//     }
// }
// class Child extends Father{
//     Child(){
//         System.out.println("I am child construtor with no arg");
//     }
//     Child(int x,int y){
//         super(x);
//         System.out.println("Child constructor: "+y);
//     }
// }

// public class proxyy {
//     public static void main(String[] args) {
        // Father obj= new Father(200);
        // Child objj = new Child();
//         Child objj=new Child(10,20);

//     }
// }
