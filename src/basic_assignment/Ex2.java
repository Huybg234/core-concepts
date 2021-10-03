package basic_assignment;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.print("Các ước: ");
        for (int i=1; i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nSố lượng biến: "+count);
    }
}
