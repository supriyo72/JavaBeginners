// public class passArray {

//     public static int no(int res){
//         return res;
//     }
//     public static void main(String[] args) {
//         passArray obj=new  passArray();
//         int b=obj.no(10);
//         System.out.println(b);
//     }
// }



public class passArray {

    public static int[] no(){
        int []arr = {10,20,30,40};
        return arr;
    }
    public static void main(String[] args) {

        // for(int e:passArray.no()){
        //     System.out.println(e);
        // }
        int [] result= no();
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}




// public class passArray {

//     public static int no(){
//         int res=100;
//         return res;
//     }
//     public static void main(String[] args) {
//         passArray obj=new passArray();
//         int b=obj.no();
//         System.out.println(b);
//     }
// }