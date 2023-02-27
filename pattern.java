import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int div=(num/2);
        if(num>=6 && num%2==0){
        for(int i=0;i<div-1;i++){
                for(int j=0;j<num;j++){
                    if(j>=div-i && j<div+i){
                        System.out.print("S");
                    }
                    else{
                        System.out.print("C");
                    }
                }
                System.out.println("");
            }
        for(int i=0;i<2;i++){
            for(int j=0;j<num;j++){
                System.out.print("S");
            }
                System.out.println("");
            }

        for(int i=div-2;i>=0;i--){
                for(int j=0;j<num;j++){
                    if(j>=div-i && j<div+i ){
                        System.out.print("S");
                    }
                    else{
                        System.out.print("K");
                    }
                }
                System.out.println("");
            }
        }


}
}
/*
CCCCCCCC
CCCSSCCC
CCSSSSCC
SSSSSSSS
SSSSSSSS
KKSSSSKKK
KKKSSKKKK
KKKKKKKKK
*/