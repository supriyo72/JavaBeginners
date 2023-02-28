class static_keyword{
    static String name;
    int roll;
    String city;

    public void displaydetails(){
        System.out.println("My name is "+name+" Live in "+city+" pincode: "+roll);
    }
    public static void staticdisplay(){
        System.out.println("Static executed::");
    }
}
public class StaticKey {
    public static void main(String[] args) {
        static_keyword obj1= new static_keyword();
        static_keyword obj2= new static_keyword();

        static_keyword.name= "raj";
        obj1.roll=401105;
        obj1.city="Bhayander";

        static_keyword.name= "Aman";
        obj2.roll=401011;
        obj2.city="Kandivali";

        obj1.displaydetails();
        obj2.displaydetails();

        static_keyword.staticdisplay();
    }
}
