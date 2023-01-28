class Tiger{
    public int demo1(){
        return 1;
    }
    
    public void train1(){
        System.out.println("Train 1 method");
    }
    public void plane1(int x){
        System.out.println("plane 1 method "+x);
    }
}
class Cubs extends Tiger{

    //plane1 is not an override
    public void plane1( ){
        System.out.println("plane 1 method ");
    }
    // @Override
    public void train1(){
        System.out.println("Override Train 1 method");
    }
    public void train2(){
        System.out.println("Train 2 method");
    }
}
public class Override {
    public static void main(String[] args) {
        Tiger a = new Tiger();
        Cubs b=new Cubs();
        // a.train1();
        b.train1();
        b.train2();
        // b.plane1(100);

    }
}
