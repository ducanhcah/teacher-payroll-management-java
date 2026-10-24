
package quanlydulieu;

import java.util.ArrayList;

public class CBGV extends Nguoi {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
   private ArrayList<Nguoi> a= new ArrayList<>();

    public CBGV() {
    }

    public CBGV(double luongCung, double luongThuong, double tienPhat, String hoTen, int tuoi, String queQuan, String maSoGiaoVien, String gioiTinh) {
        super(hoTen, tuoi, queQuan, maSoGiaoVien, gioiTinh);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }



    @Override
    public String toString() {
        return "Can bo giao vien " +super.toString()+ "Luong Cung =" + luongCung + ", Luong Thuong =" + luongThuong + ", Tien Phat=" + tienPhat +thucLinh();
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public ArrayList<Nguoi> getA() {
        return a;
    }

    public void setA(ArrayList<Nguoi> a) {
        this.a = a;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaSoGiaoVien() {
        return maSoGiaoVien;
    }

    public void setMaSoGiaoVien(String maSoGiaoVien) {
        this.maSoGiaoVien = maSoGiaoVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public double thucLinh() {
         return luongCung + luongThuong - tienPhat;
    }
  
}
