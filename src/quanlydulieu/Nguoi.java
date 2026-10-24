
package quanlydulieu;

abstract class Nguoi implements IThucLinh {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maSoGiaoVien;
    protected String gioiTinh;
    public abstract double thucLinh();

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String queQuan, String maSoGiaoVien, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGiaoVien = maSoGiaoVien;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
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

    public String setGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return hoTen + "," + tuoi + "," + queQuan + "," + maSoGiaoVien + "," + gioiTinh + " " ;
    }
    
}