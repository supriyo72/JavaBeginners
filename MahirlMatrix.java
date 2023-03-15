import java.util.Scanner;

public class MahirlMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();

        int res[][]= new int[r][c];
        for(int j=n;j<=n*n;j+=n){        
            for(int i=j;i>=(j-n)+1;i--){
                System.out.print(i+" ");
            } 
            System.out.println(" ");
        }
        System.out.println(((n*r)-c)+1);
    }
}
