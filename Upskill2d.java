// public class Upskill2d {
//     public static void main(String[] args) {

//         int [][] arr= new int[2][3];
//         arr[0][0]= 101;
//         arr[0][1]= 102;
//         arr[0][2]= 103;
//         arr[1][0]= 201;
//         arr[1][1]= 202;
//         arr[1][2]= 203;

//         for(int [] x:arr){
//             for(int y:x){
//                 System.out.println(y);
//             }
//         }

//     }
// }



// public class Upskill2d {
//     public static void main(String[] args) {

//         int [][] arr= new int[2][];
//         arr[0]= new int [3];
//         arr[1]= new int [2];

//         arr[0][0]= 101;
//         arr[0][1]= 102;
//         arr[0][2]= 103;
//         arr[1][0]= 201;
//         arr[1][1]= 202;

//         for(int [] x:arr){
//             for(int y:x){
//                 System.out.println(y);
//             }
//         }

//     }
// }



public class Upskill2d {
    public static void main(String[] args) {

        String [][] arr= {{"A","B","C"},{"D","E"},{"F","G","K","I"}};
        arr[2][2]="H";
        // for(String [] e:arr){
        //     for(String x:e){
        //         System.out.println(x);
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("____________");
        }


    }
}
