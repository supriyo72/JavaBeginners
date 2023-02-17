/*
Modifier   class package Subclass World
Public      Y      Y        Y       Y
Protected   Y      Y        Y       N
Default     Y      Y        N       N
Private     Y      N        N       N
*/
class AM{
    public int a=100;
    protected int b= 150;
    private int c= 200;
    int d=300;
    public void math1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifier {

    public static void main(String[] args) {
        AM obj = new AM();
        obj.math1();
    }
}