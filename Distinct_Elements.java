import java.util.Scanner;

public class Distinct_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int [] b= new int[a];

        if(a<=15){
            for(int i=0;i<a;i++){
                b[i]= sc.nextInt();
            }
        int [] c= new int[a];
        for(int q=0;q<a;q++){
            c[q]= -1;
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(b[i]==b[j]){
                    c[i]=b[i];
                }
                else if(i==a-1){
                    for(int k=a-1;k<=a-1;k++){
                        for(int l=0;l<=a-2;l++){
                            if(b[k]==b[l]){
                                c[k]=b[l];  
                            }
                        }
                    }
                }
            }
            }
            int count=0;
            for(int z=0;z<a;z++){
                if(c[z] !=-1){
                    count=count+1;
                }
                
            }
            System.out.println(a-count);
           
        }
        }
    }

