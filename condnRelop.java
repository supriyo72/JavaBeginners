public class condnRelop {
    public static void main(String[] args) {
        // y=true,n=false
        //AND-->  Y&&Y = y, Y&&N = n, N&&Y = n, N&&N = n
        //OR-->  Y&&Y = y, Y&&N = y, N&&Y = y, N&&N = n
        // NOT--> !Y=N, !N=Y
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        // if (a&&b) if(a&&c) if(c&&d) if(b&&c)
        if(a||c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
