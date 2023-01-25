// q-1 get-set rad and height of cylinder

// class Cylinder{
//     private int radius;
//     private int height;

//     public void setRad(int r){
//         this.radius=r;
//     }
//     public int getRad(){
//         return radius;
//     }
//     public void setHeight(int h){
//         this.height=h;
//     }
//     public int getHeight(){
//         return height;
//     }
// }
// public class GetSetpracticeSet {
//     public static void main(String[] args) {
//         Cylinder obj= new Cylinder();
//         obj.setRad(10);
//         obj.setHeight(15);
//         System.out.println(obj.getHeight());
//         System.out.println(obj.getRad());
//     }
// }







// q-2 get set surf area and vol of cylinder
// class Cylinder{
//     private float radius;
//     private float height;
    
    
//     public void setVol(float r){
//         this.radius=r;
//     }
//     public float getVol(){
//         return 3.142f*radius*radius*height;
//     }

//     public void setSurf(float h){
//         height=h;
//     }
//     public float getSurf(){
//         return 2*3.142f*radius*height+2*3.142f*radius*radius;
//     }


// }
// public class  GetSetpracticeSet{
//     public static void main(String[] args) {
        
//         Cylinder obj= new Cylinder();
//         obj.setVol(9);
//         obj.setSurf(12);
//         System.out.println(obj.getVol());
//         System.out.println(obj.getSurf());

//     }
// }







// q-2
// class Cylinder{

//     private int radius;
//     private int height;

//     public void setVol(int r){
//         this.radius=r;
//     }
//     public double getVol(){
//         return Math.PI*radius*radius*height;
//     }

//     public void setSurf(int h){
//         height=h;
//     }
//     public double getSurf(){
//         return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
//     }

// }
// public class  GetSetpracticeSet{
//     public static void main(String[] args) {
        
//         Cylinder obj= new Cylinder();
//         obj.setVol(9);
//         obj.setSurf(12);
//         System.out.println(obj.getVol());
//         System.out.println(obj.getSurf());

//     }
// }






//q-3 use constructor and repeat-1
// class Cylinder{
//     private int radius;
//     private int height;


//     public Cylinder(int r,int h){
//         this.radius=r;
//         this.height=h;
//     }
//     public int getRad(){
//         return radius;
//     }
//     public int getHeight(){
//         return height;
//     }
// }
// public class GetSetpracticeSet {
//     public static void main(String[] args) {
//         Cylinder obj= new Cylinder(10,5);
//         System.out.println(obj.getHeight());
//         System.out.println(obj.getRad());
//     }
// }






// q-4 overload a constructor of rect with len and breadth
// q-5 Repeat 1 for sphere
class Rectangle{
    private int length;
    private int breadth;


    public Rectangle(){
        length=11;
        breadth=5;
    }
    public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int getLen(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class GetSetpracticeSet {
    public static void main(String[] args) {
        Rectangle obj= new Rectangle(10,5);
        // Rectangle obj= new Rectangle();
        System.out.println(obj.getLen());
        System.out.println(obj.getBreadth());
    }
}