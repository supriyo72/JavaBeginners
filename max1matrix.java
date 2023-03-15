import java.util.Scanner;
public class max1matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        int [][] flats;
        flats= new int [a][b];
        
        int res=0;
        int min=0;
        for(int i=0;i<flats.length;i++){
            int max=0;
            for(int j=0;j<flats[i].length;j++){
                flats[i][j]= sc.nextInt(); 
                if(flats[i][j]==1){
                    max=max+1;
                }
            }
            if(max>min){
                res= i;
                min=max;
            }

        }
        System.out.println(res);
    }
}