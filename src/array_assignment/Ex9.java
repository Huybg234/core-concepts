package array_assignment;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int m = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        int k = new Scanner(System.in).nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][k];
        int[][] C = new int[m*n][n*k];
        System.out.println("Nhập mảng A ");
        inputArray(A,m,n);
        System.out.println("Nhập mảng B ");
        inputArray(B,n,k);
        System.out.println("Mảng A");
        outputArray(A,m,n);
        System.out.println("Mảng B");
        outputArray(B,n,k);
        multiplication(A,B,m,n,k,C);
        System.out.println("Mảng sau khi nhân");
        outputArray(C,m,k);
    }

    private static void multiplication(int[][] a, int[][] b, int m, int n, int k, int[][] c) {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < k; j++)
            {
                c[i][j] = 0;
                for(int x = 0; x < n; x++)
                {
                    c[i][j] = a[i][x] * b[x][j];
                }
            }
        }
    }

    private static void inputArray(int[][] c, int d, int e) {
        for (int i = 0; i<d;i++){
            for (int j=0;j<e; j++){
                c[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    private static void outputArray(int[][] c, int d, int e) {
        for (int i=0; i<d; i++){
            for (int j=0; j<e; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}
