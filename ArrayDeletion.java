import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int num= sc.nextInt();
        
        


    if(num<=20){
        int arr[] = new int[num];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int d= sc.nextInt();
        if(d>0 && d<=num){
            System.out.println("Array after deletion is");
            for(int j=0;j<num;j++){
                if(j==(d-1)){
                    continue;
                }
                else{
                    System.out.println(arr[j]);
                }
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        
    }else{
        System.out.println("Invalid Input");
    }
    
}
}
