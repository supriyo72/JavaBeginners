import java.util.Scanner;
public class SumofMatrix {
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
        int sum=0;
        for(int i=0;i<flats.length;i++){
            
            for(int j=0;j<flats[i].length;j++){
                sum=sum+flats[i][j];
            }
        }
        System.out.println("The sum of the elements in the matrix is "+sum);
    }
}