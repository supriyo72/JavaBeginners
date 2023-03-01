public class ArrayParams {

    public static void details(int [] arr){
        // System.out.println(arr[0]);
        for(int e: arr){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        details(arr);
    }
}
