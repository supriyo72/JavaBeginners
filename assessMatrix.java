
import java.util.Scanner;
public class assessMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("");
        int b=sc.nextInt();
        int [][] flats;
        flats= new int [a][b];
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt(); 
            }
  
        }
        for(int i=0;i<flats.length;i++){
            int sum=0;
            for(int j=0;j<flats[i].length;j++){
                sum=sum+flats[i][j]; 
            }
            System.out.println("Sum of the row "+i+" = "+sum);
        }
        for(int i=0;i<flats.length;i++){
            int sum1=0;
            for(int j=0;j<flats[i].length;j++){
                sum1=sum1+flats[j][i]; 
            }
            System.out.println("Sum of the column "+i+" = "+sum1);
        }
    }
}