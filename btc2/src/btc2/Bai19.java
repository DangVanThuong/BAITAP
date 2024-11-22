package btc2;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        do {
            System.out.println("Nhap so gio: ");
            a = sc.nextInt();
            System.out.println("Nhap so phut: ");
            b = sc.nextInt();
            System.out.println("Nhap so giay: ");
            c = sc.nextInt();
        }while(a<0 || b<0|| c<0);
        long d=60*60*a+60*b+c;
        System.out.println("Thoi gian tinh bang giay la: "+ d);
    }

}
