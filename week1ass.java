import java.util.Scanner;

public class week1ass {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        int temp=-1;
        for(int i=0;i<a.length();i++){
            char c= a.charAt(i);
            if(a.indexOf(c) == a.lastIndexOf(c)){
                temp=i;
                break;
            }
        }
        if(temp>-1 && temp<a.length()){
            System.out.println(temp);
        }else{
            System.out.println("-1");
        }
    
    }
}



