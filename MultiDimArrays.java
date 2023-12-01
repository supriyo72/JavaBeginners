public class MultiDimArrays {
    public static void main(String[] args) {
        int [][] flats;
        //              r  c  
        flats= new int [2][3];

/*
      j=0 j=1 j=2
      
 i=0  0,0 0,1 0,2
 i=1  1,0 1,1 1,2
*/

        //    i  j
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;

        // System.out.println(flats.length);      // 2=rows

        for(int i=0;i<flats.length;i++){
            //System.out.println(i);              // 0,1
            //System.out.println(flats[i].length);  //System.out.println(flats[0].length);  //3


            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
