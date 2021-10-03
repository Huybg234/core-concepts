package basic_assignment;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        for (int i=a; i<=b/2; i++){
            for (int j=a+1; j<=b;j++){
                if(ucln(i,j)==1){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    private static int ucln(int a, int b) {
        while (a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
}
