import java.util.Scanner;

public class compatible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if(n<=15){

            int arr1[]= new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }

            int arr2[]= new int[n];
            for(int j=0;j<n;j++){
                arr2[j]=sc.nextInt();
            }

            int flag=0;

            for(int k=0;k<n;k++){
                if(arr1[k]>=arr2[k]){
                    flag=1;
                }else{
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Incompatible");
            }
            else{
                System.out.println("Compatible");
            }
        }
    }
}