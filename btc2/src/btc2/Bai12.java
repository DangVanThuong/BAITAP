package btc2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d;
        do {
            System.out.println("Nhap vao so diem cua sinh vien");
            d = sc.nextFloat();
        }
        while(d<0 || d>100);
        if(d>=90)
        {
            System.out.println("Sinh vien loai A");
        }
        else if(d>=80)
        {
            System.out.println("Sinh vien loai B");
        }
        else if(d>=70)
        {
            System.out.println("Sinh vien loai C");
        }
        else if(d>=50)
        {
            System.out.println("Sinh vien loai D");
        }
        else
        {
            System.out.println("Sinh vien loai F");
        }
    }
}
