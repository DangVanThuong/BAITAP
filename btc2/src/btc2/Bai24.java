package btc2;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a[];
        do {
            System.out.println("Nhap so sinh vien trong lop:");
            n=sc.nextInt();
            if(n<0) {
                System.out.println("So sinh vien khong hop le: ");
            }
        }while(n<0);
        a= new int[n];
        System.out.println("Nhap diem cua sinh vien");
        for(int i=0;i<n;i++) {
            do {
                int b=i+1;
                System.out.println("Nhap diem sinh vien "+b);
                a[i]=sc.nextInt();
                if(a[i]<0 || a[i]>100) {
                    System.out.println("Nhap diem sinh vien khong hop le");
                }
            }while (a[i]<0 || a[i]>100);
        }
        System.out.println("Nhap diem sinh vien can tim");
        int c=sc.nextInt();
        for(int i=0;i<n;i++) {
            if(a[i]==c) {
                int b=i+1;
                System.out.println("Sinh vien co diem tieng anh = "+c+" la sinh vien ");
                System.out.println(b);
            }
        }
    }
}
