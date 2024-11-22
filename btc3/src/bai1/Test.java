package bai1;

public class Test {
    public static void main(String[] args) {
        Person pr=new Person();
        pr.setName("Thuong");
        pr.setDob("01/4/2005");
        pr.setPob("Nam Dinh");
        pr.setGender('M');
        pr.setEmail("dangthuong1425@gmail.com");
        pr.setPhone("0123456789");
        System.out.println(pr.toString());
    }

}
