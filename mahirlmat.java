import java.util.Scanner;

public class mahirlmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = num=num+1;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = num=num+1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int result = arr[row - 1][col - 1];
        System.out.println(result);
    }
}
