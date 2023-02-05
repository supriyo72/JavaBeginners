interface camera2{
    void takeSnap();
    void recordVideo(int megapixel);

    private void greet(){
        System.out.println("Good Morning...");
    }

    default void EditPhoto(){
        greet();
        System.out.println("Editing on Inshot");
    }
}
interface wifi2{
    String [] getNetwork();
    void connectTonetworks(String networks);
    int routerNo();
}
class MycellPhone2{
    public void MobileNo(int phoneNo){
        System.out.println("My phone no: "+ phoneNo);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MycellPhone2 implements camera2,wifi2{
    public void takeSnap(){
        System.out.println("Clicking photo...");
    }
    public void recordVideo(int megapixel){
        System.out.println("Recording film pathaan on imax having pixel of: "+megapixel);
    }
    public String [] getNetwork(){
        System.out.println("Getting list of networks");
        String [] Networks= {"Airtel","Jio","VI"};
        return Networks;
    }
    public void connectTonetworks(String networks){
        System.out.println("Connect to network: "+networks);
    }
    public int routerNo(){
        System.out.println("Router no are:");
        int rn= 72085;
        return rn;
    }
    public void Sample(){
        System.out.println("Sample method");
    }
}
public class Polymorphism_Interface {
    public static void main(String[] args) {
        camera2 obj= new MySmartPhone2();   //can only use camera2 methods
        obj.recordVideo(56);
        obj.takeSnap();
        obj.EditPhoto();

        // obj.connectTonetworks();  -->Not allowed
        // obj.routerNo();  -->Not allowed
        // obj.Sample();  -->Not allowed

        MySmartPhone2 s= new MySmartPhone2();
        s.connectTonetworks("VI");
        s.MobileNo(1002);
        s.Sample();

    }
}
