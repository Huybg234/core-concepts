package array_assignment;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử: ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = new int[n][n];
        System.out.println("Nhập mảng: ");
        inputArray(a,n);
        turnArray(a,n);
    }

    private static void turnArray(int[][] a, int n) {
        for (int i=n-1;i>=0;i--)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("\n");
        }
    }

    private static void inputArray(int[][] a, int n) {
        for (int i = 0; i<n;i++){
            for (int j=0;j<n; j++){
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }
}
