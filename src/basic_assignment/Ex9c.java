package basic_assignment;

public class Ex9c {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (checkSum(i)%10==0) {
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
}
