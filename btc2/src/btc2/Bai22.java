package btc2;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        double a[],t=0;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n=sc.nextInt();
            if(n<0) {
                System.out.println("Nhap lai so phan tu cua mang: ");
            }
        }while(n<0);
        a=new double[n];
        System.out.println("nhap phan tu cua mang ");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextDouble();
            t=t+a[i];
        }
        System.out.println("Tong phan tu cua mang la  "+t);
    }
}
