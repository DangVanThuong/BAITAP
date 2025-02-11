package bai1;
import bai2.InvalidDateException;
public class ThoiGian {
    protected int ngay;
    protected int thang;
    protected int nam;

    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if(ngay<=0 || ngay>30) {
            throw new InvalidDateException(" ngay nhap sai yeu cau "+ ngay);
        }
        if(thang<=0 || thang >12) {
            throw new InvalidDateException(" Thang nhap sai yeu cau "+thang);
        }
        if(nam<0 ) {
            throw new InvalidDateException(" Nam nhap khong hop le "+nam);
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    @Override
    public String toString() {
        return "Thoigian :"+ngay+"/"+thang+"/"+nam;
    }
}
