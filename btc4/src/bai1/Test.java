package bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("nhap so nguyen a");
            int a=sc.nextInt();
            System.out.println("nhap so nguyen b");
            int b=sc.nextInt();
            double c=(double ) a/b;
            System.out.println("thuong cau a/b la "+c);
        }catch(Exception e) {
            System.out.println("nhap b khong hon lệ");
        }
        sc.close();
    }
}
