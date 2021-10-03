package array_assignment;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] a = new int [n];
        int check = 1;
        for (int i = 0; i<n; i++){
            System.out.println("Nhập số thứ "+i+" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                check = 0;
                break;
            }
        }
        if (check == 1){
            System.out.println("Mảng a là mảng đối xứng");
        }
        else System.out.println("Mảng a không phải mảng đối xứng");
    }
}
