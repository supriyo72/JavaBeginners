import java.util.Scanner;

public class practiceSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // q-2
        // System.out.println("Enter physics marks: ");
        // byte m1= sc.nextByte();
        // System.out.println("Enter chem marks: ");
        // byte m2= sc.nextByte();
        // System.out.println("Enter maths marks: ");
        // byte m3= sc.nextByte();

        // float Total= (m1+m2+m3)/300.0f * 100.0f;
        // System.out.println("Your overall percentage is: "+Total+"%");
        // if(Total>40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Failed");
        // }


        // q-3
        // System.out.println("Enter your income: ");
        // float income= sc.nextFloat();
        // float tax= 0;

        // if(income<=2.5f){
        //     tax=tax+0;
        // }
        // else if(income >2.5f && income<=5.0f){
        //     tax= tax+ 0.05f*(income - 2.5f);
        // }
        // else if(income >5.0f && income <=10.0f){
        //     tax= tax+ 0.05f*(5.0f - 2.5f);
        //     tax= tax+ 0.20f*(income- 5.0f);
        // }
        // else if(income> 10.0f){
        //     tax= tax+ 0.05f*(5.0f - 2.5f);
        //     tax= tax + 0.20f*(10.0f- 5.0f);
        //     tax= tax+ 0.30f*(income- 10.0f);
        // }
        // System.out.println("The tax to be paid for the amount "+income+" is: "+ tax);

        
        // q-4
        // System.out.println("Enter a day no: ");
        // int day= sc.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");

        // }



        // q-5

        // System.out.println("Enter year: ");
        // int year = sc.nextInt();

        // if(((year%4==0) && (year%100!=0)) || (year%400==0) ){
        //     System.out.println("Leap year");
        // }
        // else{
        //     System.out.println("Not an leap year");
        // }


        // q-6

        System.out.println("Enter the website link: ");
        String web = sc.next();

        if(web.endsWith(".con")){
            System.out.println("Commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(web.endsWith(".in")){
            System.out.println("Inndian website");
        }





    }
}
