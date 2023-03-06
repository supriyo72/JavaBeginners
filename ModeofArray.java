import java.util.Scanner;
import java.util.Arrays;

public class ModeofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int num= sc.nextInt();

        

        if(num<=20){
            int abc[] = new int[num];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<num;i++){
                abc[i]=sc.nextInt();
            }
            
            int maxcount=0;
            int mode=0;
            for(int i=0;i<num;i++){
                int loc=i;
                int count=0;
                for(int j=0;j<num;j++){
                    if(abc[i]==abc[j]){
                        count=count+1;
                        loc=j;

                    }
                }
                if(count>maxcount){
                    maxcount=count;
                    mode=abc[loc];
                }
            }
            int c=0;
            for(int k=0;k<num;k++){                
                for(int l=0;l<num;l++){
                    if(abc[k]==abc[l]){
                        c=c+1;
                    }
                }
            }
            if(c==num){
                System.out.println("The mode of the array is none");
            }    
            else{
            System.out.println("The mode of the array is "+mode);
            }
        }
    }
}


