import java.util.Scanner;
public class classmate{
    public String name;
    public int roll;
    public double percent;
}

public class ArrObjPar {
    public void display(classmate[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].roll);
            System.out.println(arr[i].name);
            System.out.println(arr[i].percent);
        }
    }
    public static void main(String[] args) {
        // int [] arr= new int[5];
        classmate Student[] = new classmate[2];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<Student.length;i++){
            Student[i]= new classmate();

            System.out.println("Enter for "+i+" Index number");
            System.out.println("Enter your Name: ");
            Student[i].name= sc.nextLine();

            System.out.println("Enter for "+i+" Index number");
            System.out.println("Enter your Roll no: ");
            Student[i].roll= Integer.parseInt(sc.nextLine());

            System.out.println("Enter for "+i+" Index number");
            System.out.println("Enter your Roll no: ");
            Student[i].percent= Double.parseDouble(sc.nextLine());
        }
        ArrObjPar a= new ArrObjPar();
        a.display(Student);

    }

}
