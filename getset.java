class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        // id=i;
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        // name=n;
        this.name=n;
    }
    public String getName(){
        return name;
    }
}
public class getset {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();
        // obj.name="Harry";    -->Throws error becoz of private access mod
        // obj.id=10;           -->Throws error becoz of private access mod

        obj.setId(10);
        obj.setName("Supriyo");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
