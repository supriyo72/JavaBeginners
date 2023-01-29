class phone{
    public void greet(){
        System.out.println("Hello how are you??");
    }
    public void name(){
        System.out.println("your name is phone");
    }
    public void ringTone(){
        System.out.println("Ringing phone....");
    }
}
class smartPhone extends phone{
    public void swagat(){
        System.out.println("Swagat hai aapka");
    }
    public void name(){
        System.out.println("your name is  smartphone");
    }
    public void ringTone(){
        System.out.println("Ringing Smartphone....");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {

        // dynamic_dispatch


        // phone obj = new phone();
        // obj.name();
        // smartPhone objj= new smartPhone();
        // objj.name();


        //smartPhone o = new phone();  //ERROR

        // reference=phone,object=smartphone
        phone ob = new smartPhone();
        ob.name();  // op= your name is smartphone
        //ob.swagat();  //Not allowed
        ob.greet();
        ob.ringTone();   //op  Ringing Smartphone....

    }
}
