package bai2;

import bai1.ThoiGian;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Nhap ngay");
            int ngay=sc.nextInt();
            System.out.println("Nhap thang");
            int thang=sc.nextInt();
            System.out.println("Nhap nam");
            int nam=sc.nextInt();
            ThoiGian t=new ThoiGian(ngay, thang, nam);
            System.out.println(t.toString());
        }catch (InvalidDateException e) {
            System.out.println("Loi "+e.getMessage());
        }
        sc.close();

    }
}
