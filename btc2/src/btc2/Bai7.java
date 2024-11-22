package btc2;

 import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so thuc.");
        System.out.println("a=");
        float a = sc.nextFloat();
        System.out.println("b=");
        float b = sc.nextFloat();
        System.out.println("Nhap vao 1 ky tu:");
        char k = sc.next().charAt(0);
        if (k=='A')
        {
            float t = a+b;
            System.out.println("Tong 2 so vua nhap la: " +t);
        }
        else if (k=='S')
        {
            float h = Math.abs(a-b);
            System.out.println("Hieu 2 so la: " +h);
        }
        else if (k=='M')
        {
            float ti = a*b;
            System.out.println("Tich 2 so la: " +ti);
        }
        else if (k=='D')
        {
            if(b==0)
                System.out.println("Loi khong hop le");
            else {
                float th = (float)(a/b);
                System.out.println("Thuong 2 so la: " + th);
            }
        }
        sc.close();

    }
}
