package btc2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        do {
            System.out.println("Nhap vao 2 canh cua hcn:");
            System.out.println("Chieu dai: ");
            a = sc.nextFloat();
            System.out.println("Chieu rong: ");
            b = sc.nextFloat();
        }
        while(a<=0 || b<=0);
            float cv=(a+b)*2;
            float dt =a*b;
            System.out.println("Chu vi hcn la:"+ cv);
            System.out.println("Dien tich hcn la:" +dt);

    }
}
