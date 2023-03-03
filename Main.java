// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();
//         int i=2;
//         int temp=0;
//         while(i<=num/2){
//             if(num%i==0){
//                 temp=temp+1;
//                 break;
//             }
//             i++;
//         }
//         if(temp>0){
//         System.out.println("Not prime");
//         }
//         else if(temp==0){
//             System.out.println("prime");
//         }
//     }
// }



import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        

        String m= "[A-Za-z]{1,}";
        String n= "[0-9]{1,}";
        
        int count=0;
        do{
            
            
            char a1= a.charAt(0);
            char a2= a.charAt(1);
            char a3= a.charAt(2);
            char a4= a.charAt(3);
            String str1= String.valueOf(a1);
            String str2= String.valueOf(a2);
            String str3= String.valueOf(a3);
            String str4= String.valueOf(a4);

            boolean b1= str1.matches(n);
            boolean b2= str2.matches(n);
            boolean b3= str3.matches(m);
            boolean b4= str4.matches(m);
        
            if(b1==true && b2==true && b3==true && b4==true && a.length()==4){
                String b= sc.nextLine();
                String y=sc.nextLine();

                count=count+1;
                String aa=sc.nextLine();
                a=aa;
                
            }
            else{
                break;
            }
        
       
        }while(a.length()==4);
        
        System.out.println("");
        System.out.println(count);


        
        
    }
}