import java.util.Scanner;

public class xand0patt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        char [][]flats= new char[m][n];

        int rowStart= 0;
        int rowEnd= m-1;
        int colStart= 0;
        int colEnd= n-1;
        int i,j;

        char x= 'X';
        
        while(rowStart<=rowEnd  && colStart<=colEnd && m>2 && n>2){
            

            for(i=colStart; i<=colEnd;i++){
                flats[rowStart][i]= x;
            }
            rowStart=rowStart+1;

            for(i=rowStart;i<=rowEnd;i++){
                flats[i][colEnd]= x;
            }
            colEnd=colEnd-1;

            if(rowStart<=rowEnd){
                for(i=colEnd;i>=colStart;i--){
                    flats[rowEnd][i]= x;
                }
            }
            rowEnd=rowEnd-1;

            if(colStart<=colEnd){
                for(i=rowEnd;i>=rowStart;i--){
                    flats[i][colStart]= x;
                }
            }
            colStart=colStart+1;

            x = (x == '0')? 'X': '0';

        }
        for(i=0;i<flats.length;i++){
            for(j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println(" ");
        }

    
    }
}