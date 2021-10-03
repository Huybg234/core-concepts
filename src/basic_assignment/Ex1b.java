package basic_assignment;

import java.util.Scanner;

public class Ex1b {
    public static void main(String[] args) {
        float n = new Scanner(System.in).nextInt();
        float sum = 0;
        for (int i=1; i<=n; i++){
            sum += (float)1/i;
        }
        System.out.println(sum);
    }
}
