package btc2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen");
        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        int t=a+b;
        int h=Math.abs(a-b);
        int ti=a*b;
        float th=(float)a/b;
        System.out.println("Tong 2 so la: "+t);
        System.out.println("Hieu 2 so la:" +h);
        System.out.println("Tich 2 so la: " +ti);
        System.out.println("Thuong 2 so la" +th);
        sc.close();
    }
}
