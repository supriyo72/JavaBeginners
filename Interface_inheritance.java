// class cannot extend interface but interface can extend interface
interface BiggBoss{
    void contestant();
    void makers();
}
interface Voot extends BiggBoss{
    String [] Task();
    void nomination();
}
class Salman implements BiggBoss,Voot{
    public void contestant(){
        System.out.println("stan,shiv");
    }
    public void makers(){
        System.out.println("Endemol");
    }
    public String [] Task(){
        System.out.println("Task playing...");
        String [] a= {"Torture task","TTF task","TimeLimit task"};
        return a;
    }
    public void nomination(){
        System.out.println("elimination for nominated contestants...");
    }
}
public class Interface_inheritance {
    public static void main(String[] args) {
        Salman obj= new Salman();
        for(String e:obj.Task()){
            System.out.println(e);
        }
    }
}
