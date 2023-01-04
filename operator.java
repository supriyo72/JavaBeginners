// precedence and associativity

// public class operator {
//     public static void main(String[] args) {
        // int a = 8*5-20/10;
        // System.out.println(a);

        // int b= 45/5-7*9;
        // System.out.println(b);
//         int a = 2;
//         int b = 4;
//         int c = 5;
//         int k = (b*b - 4*a*c)/(2*a);
//         System.out.println(k);
//     }    
// }





public class operator {

    public static void main(String[] args) {
        int i= 50;
        int res= i++;  //first res is assigned i(50) and then i is incremented
        System.out.println(res);
        System.out.println(i);
        int k= 56;
        int ress= ++k; //first k is incremented and then ress is assigned k
        System.out.println(ress);

        int y =7;
        int x = ++y * 8;
        System.out.println(x);

        char ch = 'A';
        System.out.println(++ch);
    }
}

