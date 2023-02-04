interface camera{
    void takeSnap();
    void recordVideo(int megapixel);

    // cant use greet() at class MySmartPhone becoz it is private..
    private void greet(){
        System.out.println("Good Morning...");
    }

    //it is not necessary to write EditPhoto at class MySmartPhone becoz it is default..
    default void EditPhoto(){
        greet();
        System.out.println("Editing on Inshot");
    }
}
interface wifi{
    String [] getNetwork();
    void connectTonetworks(String networks);
    int routerNo();
}
class MycellPhone{
    public void MobileNo(int phoneNo){
        System.out.println("My phone no: "+ phoneNo);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MycellPhone implements camera,wifi{
    public void takeSnap(){
        System.out.println("Clicking photo...");
    }
    public void recordVideo(int megapixel){
        System.out.println("Recording film pathaan on imax having pixel of: "+megapixel);
    }
    // if i write the default method and overwrite it then it will run the overwrite one
    // if i make the method EditPhoto() default then it will not give an error instead of not writing it on MySmartPhone class

    // public void EditPhoto(){
    //     System.out.println("Editing photo");
    // }
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
}
public class Interface_Default_Example {
    public static void main(String[] args) {
        MySmartPhone obj = new MySmartPhone();

        // obj.MobileNo(993012209);
        // obj.pickCall();
        //obj.greet();       //Error becoz greet() is private
        obj.connectTonetworks("Airtel");
        obj.EditPhoto();
        for(String element:obj.getNetwork()){
            System.out.println(element);
        }

    }
}
