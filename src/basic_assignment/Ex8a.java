package basic_assignment;

public class Ex8a {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (isReversible(i)) {
                System.out.println(i);
            }
        }
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
