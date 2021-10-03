package basic_assignment;

public class Ex9b {
    public static void main(String[] args) {
        for (int i=1000000; i<=999999999; i++){
            if (checkNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkNumber(int n) {
        int temp;
        while (n>0){
            temp = n%10;
            if (temp !=0 && temp!=6 && temp!=8){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
