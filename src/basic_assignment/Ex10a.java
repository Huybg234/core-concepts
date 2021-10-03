package basic_assignment;

import static java.lang.Math.sqrt;

public class Ex10a {
    public static void main(String[] args) {
        for (int i=1000000; i <=9999999; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        int delta = (int) sqrt(n);
        for (int i = 2; i <= delta; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
