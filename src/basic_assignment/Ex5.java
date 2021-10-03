package basic_assignment;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int temp;
        int sum = 0;
        while (n>0){
            temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println(sum);
    }
}
