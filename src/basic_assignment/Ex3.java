package basic_assignment;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Nhập số thứ nhất: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = new Scanner(System.in).nextInt();
        int x = a*b;
        if(a>0 && b>0){
            while (a!=b){
                if(a>b){
                    a=a-b;
                }
                else{
                    b=b-a;
                }
            }
        }
        System.out.println("Ước chung lớn nhất: "+a);
        System.out.println("Bội chung nhỏ nhất: "+ x/a);
    }
}
