// import java.util.Arrays;
import java.util.Scanner;

public class MedianArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int num= sc.nextInt();

        int abc[] = new int[num];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<num;i++){
            abc[i]=sc.nextInt();
        }

        for(int i=0;i<abc.length;i++){
            for(int j=i+1;j<abc.length;j++){
                int temp=0;
                if(abc[i]>abc[j]){
                    temp=abc[i];
                    abc[i]=abc[j];
                    abc[j]=temp;
                }

            }
        }
        
        if(num%2!=0){
            int res1= (num-1)/2;
            float ans1= abc[res1];
            System.out.printf("The median of the array is %.2f",ans1);
        }
        else if(num%2==0){
            int res2= num/2;
            int res3= res2-1;
            float ans2= (abc[res2]+abc[res3])/2f;
            System.out.printf("The median of the array is %.2f",ans2);

        }


    }
}