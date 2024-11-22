package btc2;

import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
            if(n<=0)
                System.out.println("So phan tu khong hop le. Vui long nhap lai: ");
        }
        while(n<=0);
        int [] a= new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("a["+i+"]=");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            int b=i+1;
            System.out.println("Phan tu thu " +b+ "cua mang la: "+a[i]);
        }
    }
}
