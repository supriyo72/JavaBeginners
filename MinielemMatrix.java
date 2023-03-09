import java.util.Scanner;

public class MinielemMatrix {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int [][]flats= new int[a][b];

        int min=Integer.MAX_VALUE;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt();

                if(flats[i][j] <=min){
                    min= flats[i][j];
                }
            }
        }
        System.out.println("The minimum element is "+min);

    }
}
