package array_assignment;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        inputArray(a, n);
        longestWay(a, n);
    }

    private static void longestWay(int[] a, int n) {
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    b[i]++;
                }
                if (a[j] > a[j + 1]) {
                    break;
                }
            }
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("Đường chạy dài nhất có độ dài: "+max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                System.out.println("Tại vị trí "+i);
            }
        }
    }

    private static void inputArray(int[] a, int n) {
        System.out.println("Nhập mảng ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i + " :");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
}
