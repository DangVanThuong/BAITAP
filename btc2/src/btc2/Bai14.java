package btc2;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        double b=0;
        do{
            System.out.println("Nhap so dien: ");
            a = sc.nextFloat();
        }
        while(a<0);
        if(a<=50)
        {
        b=a*1484;
        }
        else if(a<=100){
            b=50*1484+(a-50)*1533;
        }
        else if(a<=200){
            b=50*1484+50*1533+(a-100)*1786;
        }
        else{
            b=50*1484+50*1533+100*1786+(a-200)*2242;
        }
        System.out.println("So tien can phai thanh toan la: "+b);
    }
}
