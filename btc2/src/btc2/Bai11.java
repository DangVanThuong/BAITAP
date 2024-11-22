package btc2;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        do{
            System.out.println("Nhap vao ban kinh hinh tron");
            r = sc.nextFloat();
        }
        while (r<=0);
        float cv =(float)(2*3.14*r);
        float dt =(float)(3.14*r*r);
        System.out.println("Chu vi hinh tron: " +cv);
        System.out.println("Dien tich hinh tron :" +dt);
    }
}
