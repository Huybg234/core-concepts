package basic_assignment;

public class Ex8b {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (isReversible(i) && checkSum(i)%10==0) {
                System.out.println(i);
            }
        }
    }

    private static int checkSum(int n) {
        int temp;
        int sum =0;
        while (n>0){
            temp = n%10;
            sum += temp;
            n /= 10;
        }
        return sum;
    }

    private static boolean isReversible(int n) {
        int revert = 0;
        int m = n;
        while(m >0){
            revert = revert * 10 + m % 10;
            m /= 10;
        }
        return revert == n;
    }
}
