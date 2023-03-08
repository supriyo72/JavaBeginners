import java.util.Scanner;

public class stockspan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int arr1[] = new int[num];
        for(int i=0;i<num;i++){
            arr1[i]= sc.nextInt();
        }

        int arr2[] = new int[num];

        arr2[0]=1;
        for(int k=1;k<num;k++){
            for(int l=k-1;l>=0;l--){
                // System.out.println("kk: "+k+"ll: "+l);
                if(arr1[k]>=arr1[l]){
                    int a=k;
                    int b= a-l+1;
                    arr2[k]=b;

                    System.out.println("k: "+k+"l: "+l);
                    
                }
                else if(arr1[k]<=arr1[k-1]){
                    System.out.println("k: "+k+"k-1: "+(k-1));
                    arr2[k]=1;
                    break;
                }

            }
        }
        for(int x:arr2){
            System.out.print(x+" ");
        }
    }
}
