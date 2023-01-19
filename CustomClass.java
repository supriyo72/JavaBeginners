// class Employee{
//     int id;
//     String name;
// }
// class CustomClass {
//     public static void main(String[] args) {
//         System.out.println("Custom class");

//         Employee supu= new Employee();
//         supu.id=27;
//         supu.name= "Supriyo";
//         System.out.println(supu.id);
//         System.out.println(supu.name);
//     }
// }




class Employee{
    int id;
    String name;
    int salary;

    public void Personaldetails(){
        System.out.println(id);
        System.out.println(name);
    }
    public int getsalary(){
        return salary;
    }
}
class CustomClass {
    public static void main(String[] args) {
        System.out.println("Custom class");

        Employee supu= new Employee();
        Employee ram= new Employee();
        supu.id=27;
        supu.name= "Supriyo";
        supu.salary=79676;
        

        ram.id=29;
        ram.name= "rameshwar";
        
        supu.Personaldetails();
        ram.Personaldetails();

        int salary=  supu.getsalary();
        System.out.println(salary);
    }
}