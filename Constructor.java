// class Myconstructor{
//     private int id;
//     private String name;

//     public Myconstructor(){
//         id=27;
//         name="Supriyo Ghosh";
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
// }
// public class Constructor {
//     public static void main(String[] args) {
//         Myconstructor obj= new Myconstructor();
//         System.out.println(obj.getId());
//         System.out.println(obj.getName());
//     }
// }







// class Myconstructor{
//     private int id;
//     private String name;

//     public Myconstructor(int Myid,String Myname){
//         id=Myid;
//         name=Myname;
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
// }
// public class Constructor {
//     public static void main(String[] args) {
//         Myconstructor obj= new Myconstructor(10,"Supu");
//         System.out.println(obj.getId());
//         System.out.println(obj.getName());
//     }
// }






// Method overloading in constructor:
class Myconstructor{
    private int id;
    private String name;

    public Myconstructor(){
        id=27;
        name="Supriyo Ghosh";
    }

    public Myconstructor(int Myid,String Myname){
        id=Myid;
        name=Myname;
    }

    public Myconstructor(String Myname){
        name=Myname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        // Myconstructor obj= new Myconstructor();
        Myconstructor obj= new Myconstructor("raja");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}