public class ArrayObject {
    public static void main(String[] args) {
        Object [][] arr= {{"Aman",25,3.4,'A'},{"Raj",57,7.3,'B'},{"Kalpesh",85,22.9,'C'}};
  
    

    for(Object [] x:arr){
            for(Object y:x){
                System.out.println(y+" ");
            }
            System.out.println("__________________");
        }

        }
}
