package btc2;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so nguyen n:");
            n=sc.nextInt();
            if(n<=0) {
                System.out.println("Gia tri n khong hop le vui long nhap lai: ");
            }
        }while(n<0);
        long b=1;
        for(int i=1;i<=n;i++){
            b*=i;
        }
        System.out.println("Giai thua cua n la:"+b);
    }

}
