import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        String arr[] = new String[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.next();
        }

        

        String temp= new String();
        for(int i=0;i<num;i++){
            temp= " ";
            for(int j=i+1;j<num;j++){
                if(arr[i].length()>arr[j].length()){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(String e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
