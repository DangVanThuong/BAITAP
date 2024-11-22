package btc2;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        float b,c;
        do {
            System.out.println("nhap so ngay luu chu");
            a=sc.nextInt();
            if(a<0) {
                System.out.println("nhap so ngay  khong hop le");
            }
            System.out.println("nhap don gia ");
            b=sc.nextFloat();
            if(b<0) {
                System.out.println("nhap don gia khong hop le ");
            }
        }while(a<0 || b<0);
        if(a==1) {
            c=b;
        }else if(a<4) {
            c=(float)(a*b*80/100);
        }else if(a<10) {
            c=(float) (a*b*60/100);
        }else {
            c=(float)(a*b*40/100);
        }
        System.out.println("gia tien phong la "+c);
    }
}
