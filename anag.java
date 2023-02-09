import java.util.Arrays;
import java.util.Scanner;

public class anag {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char [] c= a.toCharArray();
        char [] d= b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        String A= new String(c);
        String B= new String(d);
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt(i)){
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}