import java.util.Scanner;

public class MatrixSpiral {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int [][]flats= new int[m][n];
    
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt();
            }
        }

        int rowStart= 0;
        int rowEnd= m-1;
        int colStart= 0;
        int colEnd= n-1;

        while(rowStart<=rowEnd  && colStart<=colEnd){

            for(int i=colStart; i<=colEnd;i++){
                System.out.print(flats[rowStart][i]+" ");
            }
            rowStart=rowStart+1;

            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(flats[i][colEnd]+" ");
            }
            colEnd=colEnd-1;

            if(rowStart<=rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    System.out.print(flats[rowEnd][i]+" ");
                }
            }
            rowEnd=rowEnd-1;

            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    System.out.print(flats[i][colStart]+" ");
                }
            }
            colStart=colStart+1;

        }
    }
}
