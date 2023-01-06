public class ForEachArrays {
    public static void main(String[] args) {
        int [] marks= {24,58,76,34,98,32};

        // Using For loop
        System.out.println("Using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Using for loop in reverse order");
        for(int i= marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }


        System.out.println("For each loop: ");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
