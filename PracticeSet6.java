import java.util.Scanner;

public class PracticeSet6 {
    public static void main(String[] args) {
        // q-1 create an array of 5 float and calculate their sums

        //using for-each loop
        // float [] res= {23.56f,56.09f,23.98f,342.987f};
        // float sum=0;
        // for(float element: res){
        //     sum=sum+element;
        // }
        // System.out.println(sum);


        //using for loop
        // for(int i=0;i<res.length;i++){
        //     sum=sum+res[i];
        // }
        // System.out.println(sum);




        // q-2 Find out whether the given integer is present in an array or not
        //for-each
        // int [] res = {54,38,75,65,84,25,19,22};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int num= sc.nextInt();
        // boolean result= false;

        // for(int element: res){
        //     if(element==num){
        //         result=true;
        //         break;
        //     }
        // }
        // if(result==true){
        //     System.out.printf("%d is found",num);
        // }
        // else{
        //     System.out.printf("%d is not found",num);
        // }


        // for loop
        // for(int i=0;i<res.length;i++){
        //     if(res[i]==num){
        //         result=true;
        //         break;
        //     }
        // }
        // if(result==true){
        //     System.out.printf("%d is found",num);
        // }
        // else{
        //     System.out.printf("%d is not found",num);
        // }
        



        // q-3 calculate average marks 
        // for each
        // float [] marks= {63.56f,56.09f,76.98f,42.97f};
        // float sum= 0;
        // for(float element: marks){
        //     sum= sum+element;
        // }
        // float res= sum/marks.length;
        // System.out.println(res);



        // q-4 Add two matrices of sixe 2X3
        // int [][] num1={{2,9,5},{3,4,7}};
        // int [][] num2={{4,7,1},{8,10,2}};

        // int [][] sum={{0,0,0},{0,0,0}};

        // for(int i=0;i<num1.length;i++){
        //     for(int j=0;j<num1[i].length;j++){
        //         sum[i][j]= num1[i][j] + num2[i][j];
        //         System.out.println(sum);
        //         System.out.println(" ");
        //     }
        //     System.out.println("");
        // }




        // q-5 Reverse the array
        /*
        Explanation:
i-->    0 1 2 3 4
        4 5 6 7 8
        4 3 2 1 0 -->After replacement (arr.length-i-1)

        for replace: arr.length/2  5/2=2.5==2 using Math.FloorDiv
        4<->8 5<->7 6 remains there only
        
        a b c=temp....want to swap a and b
        now, temp=a means c=a
        a=b and then b= temp means b=a...now a and b are swapped
        */

        // int [] arr= {1,2,3,4,5,6};
        // int l= arr.length;
        // int n= Math.floorDiv(l,2);
        // int temp;
        // for(int i=0;i<n;i++){
        //     temp= arr[i];
        //     arr[i]=arr[l-i-1];
        //     arr[l-i-1]=temp;
        // }
        // for(int element: arr){
        //     System.out.print(element);
        // }




        // q-6 Maximum array
        // int [] arr= {45,23,47,89,-765,87,98,567,345};
        // int max=0
        // int max=Integer.MIN_VALUE;       //Lowest minimum possible

        // for(int e:arr){
        //     if(e>max){
        //         max=e;
        //     }
        // }
        // System.out.printf("%d is maximum",max);



        // q-7 Minimum array
        // int [] arr= {45,23,47,89,765,87,8,567,908,345};
        // int min=Integer.MAX_VALUE;        //Highest maximum value

        // for(int e:arr){
        //     if(e<min){
        //         min=e;
        //     }
        // }
        // System.out.printf("%d is minimum",min);





        // q-8 Array is sorted or not
        int [] arr= {1,2,3,7,5,6};
        boolean res= false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                res= true;
                break;
            }
        }
        if(res==true){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("Sorted");
        }

        






        




    }
}
