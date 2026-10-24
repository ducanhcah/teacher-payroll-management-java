package quanlydulieu;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSGV {
    
    private ArrayList<CBGV> a= new ArrayList<>();


    public ArrayList<CBGV> getA() {
        return a;
    }

    public void setA(ArrayList<CBGV> a) {
        this.a = a;
    }

    public void docFile (String tenFile ){
        try {
             File f = new File(tenFile);
           if(f.exists()){
               System.out.println("OK");
           Scanner read= new Scanner(f);
           while(read.hasNext()){
               String line = read.nextLine();
               String s[] = line.split(", ");
               String ten = s[1].trim();
               String que = s[3].trim();
               int tuoi = Integer.parseInt(s[4].trim());
               String ma = s[0].trim();              
               String gt = s[2].trim();
               double cung = Double.parseDouble(s[5].trim());
               double thuong = Double.parseDouble(s[6].trim());
               double phat = Double.parseDouble(s[7].trim());
               //a.add(new CBGV(ten,que,tuoi,cung,thuong,phat));
               //double luongCung, double luongThuong, double tienPhat, String hoTen, int tuoi, String queQuan, String maSoGiaoVien, boolean gioiTinh
               a.add(new CBGV(cung,thuong,phat,ten,tuoi,que,ma,gt));
               
           }
           }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(ArrayList<CBGV>b, String noiDung){
        System.out.println(noiDung);
        for(CBGV x:b)
        System.out.println(x);            
    }
     public void sapXepTheoTuoi() {
        Collections.sort(a, new Comparator<CBGV>() {
            @Override
            public int compare(CBGV gv1, CBGV gv2) {         
                return Integer.compare(gv1.getTuoi(), gv2.getTuoi());
            }
        });
    }
  
    public void sapxep() {
        Collections.sort(a, new Comparator<CBGV>() {
            @Override
            public int compare(CBGV o1, CBGV o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }
    public ArrayList<CBGV> tachLop(String tenLop){
        ArrayList<CBGV> b= new ArrayList<>();
        for(CBGV x : a)
            if(x.getClass().getSimpleName().equalsIgnoreCase(tenLop))
                b.add(x);  
        return b;
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for ( IThucLinh x: a)
            System.out.println(x);
    }
    
     public boolean themMoi(CBGV y){
        for(CBGV x: a)
            if(x.getMaSoGiaoVien().trim().equalsIgnoreCase(y.getMaSoGiaoVien().trim()))
                return false;
        a.add(y);
        return true;
    }
     
         public boolean xoaTheoMa(String maGiaoDich) {
        for (CBGV x : a) 
            if (x.getMaSoGiaoVien().trim().endsWith(maGiaoDich)){
                a.remove(x);
                return true;
}
        return false;
         }
  
             public CBGV timTheoMa(String maGiaoDich){
        for(CBGV x: a)
            if(x.getMaSoGiaoVien().trim().equalsIgnoreCase(maGiaoDich))
                return x;
                return null;
            }
public double tongthuclinh(){
        double tongPC = 0;
        for (Nguoi n : a){
            if ( n instanceof CBGV){
                tongPC = tongPC + ((CBGV)n).thucLinh();
            }
        }
        return tongPC;
    }
    public void sapXepTheoThucLinh() {
    Collections.sort(a, new Comparator<CBGV>() {
        @Override
        public int compare(CBGV gv1, CBGV gv2) {
            return Double.compare(gv1.thucLinh(), gv2.thucLinh());
        }
    });
}    
    public void sapXepGiamTheoThucLinh() {
    Collections.sort(a, new Comparator<CBGV>() {
        @Override
        public int compare(CBGV gv1, CBGV gv2) {
            
            return Double.compare(gv2.thucLinh(), gv1.thucLinh());
        }
    });
}
     public void ghiFile(String tenFile){
            try {
                File f =new File(tenFile);
                if(f.exists()){
                    PrintStream ghi = new PrintStream(f);
                    for(CBGV x:a){
                        ghi.println(x.getMaSoGiaoVien()+", "+x.getHoTen()+", "+x.getGioiTinh()+", "+x.getQueQuan()+", "+x.getTuoi()+", "+x.getLuongCung()+", "+x.getLuongThuong()+", "+x.getTienPhat());             
                   }
                    ghi.close();
                    System.out.println("File da co khong ghi");
                }
            } catch (Exception e) {
            }
    }
     public Nguoi tim (String maTim){
        for (Nguoi n : a){
            if(n.getMaSoGiaoVien().equalsIgnoreCase(maTim)){
            System.out.println("Co ma can tim\n"
                    + ""
                    +"Thong tin nhan vien can tim");
            return n;
            }
        }
        System.out.println("Khong tim thay");
        
        return null;
    }
     
      public void output(){
        xuat("DS ");
        xuat(a," Mang sau khi them");
        xuat(tachLop(" GiaoDichDat"), "Danh Sach Giao Dich Dat");
        xuat(tachLop(" GiaoDichNha"), "Danh Sach Giao Dich Nha");
    }
      
    public static void main(String[] args) {
        DSGV a = new DSGV();
        a.docFile("C:\\Users\\DELL G3\\Documents\\DSDA.txt");   
        a.sapXepTheoTuoi();
        a.sapxep();
        a.output();
        
    }
    
}
