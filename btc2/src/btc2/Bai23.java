package btc2;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a[],ma,mi;
        do {
            System.out.println("Nhap so hoc sinh");
            n=sc.nextInt();
            if(n<0) {
                System.out.println("Nhap so hoc sinh khong hop le ! yeu cau ");
            }
        }while(n<0);
        a=new int[n];
        for(int i=0;i<n;i++) {
            int b=i+1;
            do {
                System.out.println("Nhap diem cua hoc sinh "+b);
                a[i]=sc.nextInt();
                if(a[i]<0 || a[i]>100) {
                    System.out.println("Nhap so diem cua sinh vien khong hop le ,yeu cau ");
                }
            }while(a[i]<0 || a[i]>100);
        }
        ma=0;
        mi=100;
        for(int i=0;i<n;i++) {
            if(a[i]>ma) {
                ma=a[i];
            }
            if(a[i]<mi) {
                mi=a[i];
            }
        }
        for(int i=0;i<n;i++) {
            int b=i+1;
            if(a[i]==ma) {
                System.out.println("Sinh vien co diem cao nhat la sinh vien so "+b);
            }
            if(a[i]==mi) {
                System.out.println("Sinh vien co diem thap nhat la sinh vien so"+b);
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]>a[j]) {
                    int tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        System.out.println("Bang diem tang dan cua sinh vien la ");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}
