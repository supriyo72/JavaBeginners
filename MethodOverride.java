// class phone{
//     public void greet(){
//         System.out.println("Hello how are you??");
//     }
//     public void name(){
//         System.out.println("Tera naam kya??");
//     }
// }
// class smartPhone extends phone{
//     public void swagat(){
//         System.out.println("Swagat hai aapka");
//     }
//     public void name(){
//         System.out.println("Your name is ____.");
//     }
// }
// public class MethodOverride {
//     public static void main(String[] args) {

//         smartPhone obj= new smartPhone();
//         obj.name();
//     }
// }
// op: Your name is ____.







// class phone{
//     public void greet(){
//         System.out.println("Hello how are you??");
//     }
//     public void name(){
//         System.out.println("Tera naam kya??");
//     }
// }
// class smartPhone extends phone{
//     public void swagat(){
//         System.out.println("Swagat hai aapka");
//     }
//     public void name(int x){
//         System.out.println("Your name is ____."+x);
//     }
// }
// public class MethodOverride {
//     public static void main(String[] args) {

//         smartPhone obj= new smartPhone();
//         obj.name();
//     }
// }
//op Tera naam kya??








// class phone{
//     public void greet(){
//         System.out.println("Hello how are you??");
//     }
//     public void name(){
//         System.out.println("Tera naam kya??");
//     }
// }
// class smartPhone extends phone{
//     public void swagat(){
//         System.out.println("Swagat hai aapka");
//     }
//     public void name(int x){
//         System.out.println("Your name is ____."+x);
//     }
// }
// public class dynamic_dispatch {
//     public static void main(String[] args) {
        
//         phone obj = new phone();
//         obj.name();
//         smartPhone objj= new smartPhone();
//         objj.name();
//     }
// }
// op Tera naam kya?? Tera naam kya??






class phone{
    public void greet(){
        System.out.println("Hello how are you??");
    }
    public void name(){
        System.out.println("Tera naam kya??");
    }
}
class smartPhone extends phone{
    public void swagat(){
        System.out.println("Swagat hai aapka");
    }
    public void name(int x){
        System.out.println("Your name is ____."+x);
    }
}
public class MethodOverride {
    public static void main(String[] args) {

        smartPhone obj= new smartPhone();
        obj.name(100);
    }
}
// op Your name is ____.100