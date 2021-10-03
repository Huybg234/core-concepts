package array_assignment;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Nhập số dòng: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số cột: ");
        int n = new Scanner(System.in).nextInt();
        int [][] arr = new int[a][n];
        int[] c = new int[a*n];
        inputArray(arr,a,n);
        outputArray(arr,a,n);
        changeArray(arr,a,n,c);
    }

    private static void changeArray(int[][] arr,int a, int n, int[] c) {
        int[] b = new int[a*n];
        int x = 0;
        for (int i=0; i<a; i++){
            for (int j=0; j<n; j++){
                b[x++] = arr[i][j];
            }
        }
        System.out.println("Mảng sau khi chuyển đổi: ");
        for(int m=0;m<x;m++)
        {
            System.out.print(b[m]+ " ");
            c[m] = 0;
        }
        System.out.println("\n");
        int count;
        for (int i = 0; i < a*n; i++) {
            count = 1;
            if (c[i]==0){
                c[i]=1;
                for (int j = i + 1; j < a*n; j++) {
                    if (b[j] == b[i]) {
                        count++;
                        c[j]=1;
                    }
                }
                System.out.println(b[i] + " " + count);
            }
        }
    }

    private static void inputArray(int[][] arr,int a, int n) {
        for (int i=0; i<a; i++){
            for (int j=0; j<n; j++){
                System.out.println("Nhập phần tử thú "+(i+1)+" : ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    private static void outputArray(int[][] arr, int a, int n) {
        System.out.println("Mảng được nhập: ");
        for (int i=0; i<a; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}
