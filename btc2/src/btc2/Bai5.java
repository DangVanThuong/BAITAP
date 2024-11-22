package btc2;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap 1 so nguyen");
        int ng=sc.nextInt();
        System.out.println("nhap so thuc");
        float th=sc.nextFloat();
        System.out.println("nhap 1 ky tu");
        char kt=sc.next().charAt(0);
        sc.nextLine();
        System.out.println("nhap mot chuoi ky tu");
        String ckt=sc.nextLine();
        System.out.println("so nguyen la "+ng+" so thuc la "+th+" ky tu duoc nhap la "+kt+" chuoi ky tu la "+ckt);
        sc.close();
    }

}