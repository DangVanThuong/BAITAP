package bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Exchange a1=new Exchange();
        String[] MonArr= {
                "USD;VND;17000",
                "EUR;USD;1.2",
                "USD;IDN;15789",
                "USD;EUR;0.83",
                "CAD;IDN;16869"
        };
        // nhap thong tin tu Monarr vao mảng
        for (String string : MonArr) {
            String[] code=string.split(";");
            String code1=code[0];
            String code2=code[1];
            double rate=Double.parseDouble(code[2]);
            Rate r=new Rate(code1,code2, rate);
            a1.addrate(r);
        }
        Scanner sc=new Scanner(System.in);
        // đổi tiền
        String code1,code2;
        double amount;
        do {
            System.out.println("nhập mã tiền tệ thứ nhất");
            code1=sc.nextLine();
            System.out.println("nhập mã tiền tệ thứ hai");
            code2=sc.nextLine();
            System.out.println("nhập mã số tiền cần đổi");
            amount=sc.nextDouble();
            if(a1.convert(code1, code2, amount)!=0) {
                System.out.println("Lượng tiền sau khi đổi "+a1.convert(code1, code2, amount));
            }else {
                System.out.println("mã tiền khong chính xác");
            }}while(a1.convert(code1, code2, amount)==0);



    }
}
