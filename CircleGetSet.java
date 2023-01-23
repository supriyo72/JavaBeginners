class Circle{
    private float side;

    public void setArea(float s){
        side=s;
    }
    public float getArea(){
        return 3.14f*side*side;
    }
    public void setper(float s){
        side=s;
    }
    public float getper(){
        return 2*3.14f*side;
    }

}
public class CircleGetSet {
    public static void main(String[] args) {
        
        Circle obj= new Circle();
        obj.setArea(10);
        obj.setper(5);
        System.out.println(obj.getArea());
        System.out.println(obj.getper());

    }
}
