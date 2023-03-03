import java.util.Scanner;

public class Mocktest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        float arr1 [] = new float[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextFloat();
            System.out.print("");
        }
        
        int pos=sc.nextInt();
        int ele= sc.nextInt();

        float numarr[] = new float[n+1];
        for(int i=n;i>=pos;i--){
            numarr[i]=arr1[i-1];
        }
        numarr[pos-1]=ele;
        for(int i=0;i<pos-1;i++){
            numarr[i]=arr1[i];
        }
        for(float e:numarr){
            System.out.print(e+" ");
        }
        System.out.print(" ");
        for(int k=0;k<n+1;k++){
            int count=0;
            for(int l=k+1;l<n+1;l++){
                if(numarr[k]==numarr[l]){
                    count=count+1;
                }
            }
            System.out.println("");
            if(count>=1){
                System.out.println((float) k);
            }
        }

    }
}
