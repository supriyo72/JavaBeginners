public class Break_Continue_loop {
    public static void main(String[] args) {
        // Break

        // For loop
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);

        //     if(i==2){
        //     System.out.println("Loop ends");
        //     break;
        //     }
        // }
        // System.out.println("Khatam!!");



        // While loop
        // int i=0;
        // while(i<=10){
        //     System.out.println(i);
        //     if(i==2){
        //         System.out.println("Loop ends");
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("Khatam");



        // Do while loop
        // int i=1;
        // do{
        //     System.out.println(i);
        //     if(i==2){
        //         System.out.println("Loop ends");
        //         break;
        //     }
        //     i++;
        // }
        // while(i<=5);
        // System.out.println("khatam!!");



        // Continue:

        // For
        // for(int i=0;i<=5;i++){

        //     if(i==2){
        //     System.out.println("Two won't print because it is continued");
        //     continue;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Khatam!!");





        // While loop

        // int i=0;
        // while(i<=5){
        //     i++;
        //     if(i==3){
        //         System.out.println("Loop ends");
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Khatam");




        // Do while loop
        int i=1;
        do{
            i++;
            System.out.println(i);
            if(i==4){
                System.out.println("Loop ends");
                continue;
            }
            System.out.println("Hello ");
        }
        while(i<=5);
        System.out.println("khatam!!");


    }
}