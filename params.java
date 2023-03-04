// public class params {
//     public static int no(){
//         int a=100;
//         return a;
//     }
//     public static void main(String[] args) {
//         params obj= new params();
//         System.out.println(obj.no());
//     }
// }



// public class params {
//     public static int []no(){
//         int [] a= {10,20,30,40};
//         return a;
//     }
//     public static void main(String[] args) {
//         params obj=new params();
//         int [] result= no();
//         for(int i=0;i<result.length;i++){
//             System.out.println(result[i]);
//         }
        
//     }
// }



public class params {

    public static void printDetails(int [] arr){
        // System.out.println(arr[0]);
        for(int e: arr){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int [] arr={10,20,39,47,59};
        printDetails(arr);

    }
}