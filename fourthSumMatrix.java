import java.util.Scanner;
public class fourthSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        int b=sc.nextInt();

        int [][] flats;
        flats= new int [a][b];
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt(); 
            }
  
        }
        System.out.println("The sum matrix is");
        
        int res=0;
        for(int i=0;i<flats.length;i++){
            int sum=0;
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
                sum=sum+flats[i][j];
            }
            System.out.print(sum);
            res=res+sum;
            System.out.println(" ");
  
        }
        for(int i=0;i<b;i++){
            int sum1=0;
            for(int j=0;j<a;j++){
                sum1=sum1+flats[j][i]; 
            }
            System.out.print(sum1+" ");
            
        }
        System.out.print(res);
        System.out.println(" ");
    }
}