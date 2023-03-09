import java.util.Scanner;
public class RowSumColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int a= sc.nextInt();
        System.out.println("Enter the column size");
        int b=sc.nextInt();
        int [][] flats;
        flats= new int [a][b];

        System.out.println("Enter the matrix values");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt(); 
            }

        }

        System.out.println("The matrix is");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println("");
        }

        for(int i=0;i<flats.length;i++){
            int sum=0;
            for(int j=0;j<flats[i].length;j++){
                sum=sum+flats[i][j]; 
            }
            System.out.println("Row "+(i+1)+" sum is "+sum);
        }
        for(int i=0;i<b;i++){
            int sum1=0;
            for(int j=0;j<a;j++){
                sum1=sum1+flats[j][i]; 
            }
            System.out.println("Sum of the column "+i+" = "+sum1);
        }
    }
}