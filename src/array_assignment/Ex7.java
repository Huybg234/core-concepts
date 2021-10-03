package array_assignment;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        System.out.println("Nhập số thực x: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhập mảng a: ");
        inputArray(a,n);
        sortArrayA(a,n);
        a=insert(a,n,x);
        outArray(a,n);
    }

    private static void outArray(int[] a, int n) {
        for (int i=0; i<n+1; i++){
            System.out.print(a[i]+" ");
        }
    }

    private static int[] insert(int[] a, int n, int x) {
        int index = n-1;
        int [] b = new int [n + 1];
        boolean check = false;
        for (int i = n; i>=0; i--){
            if (index > -1 && a[index] >x ){
                b[i] = a[index--];
            }else {
                if (!check){
                    b[i] = x;
                    check = true;
                }else {
                    b[i] = a[index--];
                }
            }
        }
        return b;
    }

    private static void sortArrayA(int[] a, int n) {
        int temp;
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    private static void inputArray(int[] a, int n) {
        for (int i=0; i< n; i++){
            System.out.println("Phần tử thứ "+i+" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
}
