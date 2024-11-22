package btc2;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float c;
        System.out.println("Nhap vao nhiet do C la: ");
        c=sc.nextFloat();
        float f=(float)(c*1.8+32);
        System.out.println("Nhiet do F la "+f );
    }
}
