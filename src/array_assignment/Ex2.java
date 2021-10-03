package array_assignment;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int [n];
        inputArray(a,n);
        sortArrayA(a,n);
    }

    private static void inputArray(int[] a, int n) {
        for (int i=0; i<n; i++){
            System.out.println("Nhập số thứ "+i+" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    private static void sortArrayA(int[] a, int n) {
        int temp=0;
        for (int i=0; i<n; i++){
            for (int j= i+1; j<n; j++){
                if (a[i]>a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
