package basic_assignment;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i=2;
        while(n>1){
            if(n%i==0){
                n /= i;
                System.out.print(i+" ");
            }else {
                i++;
            }
        }
    }
}
