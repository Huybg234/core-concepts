package array_assignment;

import java.util.Scanner;

import static java.lang.Math.*;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();
        int []a = new int[n];
        System.out.println("Nhập x: ");
        int x = new Scanner(System.in).nextInt();
        inputArray(a,n);
        specifyArray(a,n,x);
    }

    private static void inputArray(int[] a, int n) {
        for (int i=0; i<n; i++){
            System.out.println("Nhập số thứ "+i+" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n<2){
            return false;
        }
        int delta = (int) sqrt(n);
        for (int i = 2; i <= delta; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void specifyArray(int[] a, int n, int x) {
        int primeNumber = 0;
        int distance = Integer.MAX_VALUE;
        for (int i =0; i< n; i++){
            if (isPrimeNumber(a[i]) && abs(a[i]-x)<distance){
                distance = abs(a[i]-x);
                primeNumber = a[i];
            }
        }
        for (int i=0; i<n;i++){
            if (primeNumber == a[i]){
                System.out.println(i);
            }
        }
    }
}
