package bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Dictionary dc=new Dictionary();
        int n;
        do {
            System.out.println("nhâp 1 . nếu muốn tra từ\n"+"nhập 2 nếu muốn thoát");
            System.out.println("nhập yêu cầu:");
            n=sc.nextInt();
            sc.nextLine();
            if(n==1) {
                System.out.println("nhập từ cần tìm");
                String tu =sc.nextLine();
                System.out.println("nghĩa  từ cần tìm :"+dc.lookup(tu));

            }
        }while(n==1);
        sc.close();
    }
}
