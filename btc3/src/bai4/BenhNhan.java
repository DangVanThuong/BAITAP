package bai4;

public class BenhNhan {
    private String tieuSu;
    private String  chuanDoan;
    private BenhVien benhVien=new BenhVien();
    public BenhNhan(String tieuSu, String chuanDoan, BenhVien benhVien, String ten,int tuoi,char gioiTinh) {
        super();
        this.tieuSu = tieuSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }
    public BenhNhan(String ten,int tuoi,char gioiTinh) {
        super();
    }
    public String getTieuSu() {
        return tieuSu;
    }
    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }
    public String getChuanDoan() {
        return chuanDoan;
    }
    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }
    public BenhVien getBenhVien() {
        return benhVien;
    }
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    @Override
    public String toString() {
        return "Benhnhan [tieusu=" + tieuSu + ", chuandoan=" + chuanDoan + benhVien.toString()  +super.toString();
    }
}
