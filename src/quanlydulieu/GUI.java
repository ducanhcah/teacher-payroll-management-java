
package quanlydulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
    private String filePath;
    DefaultTableModel dtm;
    DSGV a;
  

   
    public GUI() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã GV", "Họ Tên", "Giới Tính", "Quê Quán", "Tuổi", "Lương Cứng", "Lương Thưởng", "Tiền Phạt","Lương"});
        jTable.setModel(dtm);
        a=new DSGV();
        
    }
public void loadData(ArrayList<CBGV> b) {
    while (dtm.getRowCount() > 0) {
        dtm.removeRow(0);
    }

    for (CBGV x : b) {
        
        dtm.addRow(new Object[]{
            x.getMaSoGiaoVien(),
            x.getHoTen(),
            x.getGioiTinh(),
            x.getQueQuan(),
            x.getTuoi(),
            x.getLuongCung(),
            x.getLuongThuong(),
            x.getTienPhat(),
            x.thucLinh(),
        });
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jlbMaGV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jbtXoa = new javax.swing.JButton();
        jbtDocFile = new javax.swing.JButton();
        jlbGhiFile = new javax.swing.JButton();
        jbtSach = new javax.swing.JButton();
        jbtSXT = new javax.swing.JButton();
        jbtSua = new javax.swing.JButton();
        jbtThem = new javax.swing.JButton();
        jbtSXG = new javax.swing.JButton();
        jbtExit = new javax.swing.JButton();
        jbtTong = new javax.swing.JButton();
        txtMaGV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtLuongCung = new javax.swing.JTextField();
        txtLuongTru = new javax.swing.JTextField();
        jlbTen = new javax.swing.JLabel();
        jlbQue = new javax.swing.JLabel();
        jlbTuoi = new javax.swing.JLabel();
        jlbLuongCung = new javax.swing.JLabel();
        jlbLuongTru = new javax.swing.JLabel();
        jbtNam = new javax.swing.JRadioButton();
        jbtNu = new javax.swing.JRadioButton();
        jlbGT = new javax.swing.JLabel();
        jlbLuongThuong = new javax.swing.JLabel();
        txtLuongThuong = new javax.swing.JTextField();
        txtTong = new javax.swing.JTextField();
        jbtTim = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan li luong");
        setResizable(false);

        jlbMaGV.setText("MaGV");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jbtXoa.setText("Xoá Dữ Liệu");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jbtDocFile.setText("Đọc File");
        jbtDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDocFileActionPerformed(evt);
            }
        });

        jlbGhiFile.setText("Lưu File");
        jlbGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbGhiFileActionPerformed(evt);
            }
        });

        jbtSach.setText("Làm sạch bảng");
        jbtSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSachActionPerformed(evt);
            }
        });

        jbtSXT.setText("Sắp xếp tăng theo lương");
        jbtSXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSXTActionPerformed(evt);
            }
        });

        jbtSua.setText("Sửa");
        jbtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaActionPerformed(evt);
            }
        });

        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtSXG.setText("Sắp xếp giảm theo lương");
        jbtSXG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSXGActionPerformed(evt);
            }
        });

        jbtExit.setText("Thoát");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        jbtTong.setText("Tổng Lương");
        jbtTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTongActionPerformed(evt);
            }
        });

        txtMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGVActionPerformed(evt);
            }
        });

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        txtTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuoiActionPerformed(evt);
            }
        });

        jlbTen.setText("Ho Ten");

        jlbQue.setText("Que Quan");

        jlbTuoi.setText("Tuoi");

        jlbLuongCung.setText("Luong Cung");

        jlbLuongTru.setText("LuongTru");

        buttonGroup1.add(jbtNam);
        jbtNam.setSelected(true);
        jbtNam.setText("Nam");
        jbtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbtNu);
        jbtNu.setText("Nu");

        jlbGT.setText("Gioi Tinh");

        jlbLuongThuong.setText("Luong Thuong");

        jbtTim.setText("Tìm");
        jbtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbGhiFile, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtDocFile, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtSach)
                        .addGap(18, 18, 18)
                        .addComponent(jbtSXT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtSXG, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtTong, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtTim, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtTim))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbGT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtNam)
                                .addGap(46, 46, 46)
                                .addComponent(jbtNu)
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbQue)
                                            .addComponent(jlbTuoi)
                                            .addComponent(jlbLuongTru)
                                            .addComponent(jlbTen)
                                            .addComponent(jlbMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbLuongCung, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuongCung, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jlbLuongThuong)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(txtLuongThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtDocFile)
                    .addComponent(jbtSach)
                    .addComponent(jbtSXT)
                    .addComponent(jbtTong)
                    .addComponent(jbtTim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbGhiFile)
                    .addComponent(jbtSXG)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jbtExit)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMaGV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbQue))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNam)
                    .addComponent(jbtNu)
                    .addComponent(jlbGT))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTuoi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLuongCung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbLuongTru)))
                    .addComponent(jlbLuongCung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuongThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLuongThuong))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXoa)
                    .addComponent(jbtSua)
                    .addComponent(jbtThem))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtNamActionPerformed

    private void txtMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGVActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuoiActionPerformed

    private void jbtDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDocFileActionPerformed
JFileChooser fc=new JFileChooser();
       fc.showOpenDialog(null);
       String tenfile= fc.getSelectedFile().getPath();
       a.docFile(tenfile);
       loadData(a.getA());
    }//GEN-LAST:event_jbtDocFileActionPerformed
private void docFile(String filePath) throws FileNotFoundException, IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        String line;
        while ((line = reader.readLine()) != null) {
            // Tách dòng dữ liệu thành các cột dựa trên dấu phẩy
            String[] rowData = line.split(",");
            model.addRow(rowData); // Thêm dòng dữ liệu vào JTable
        }
    }
}
    private void jlbGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbGhiFileActionPerformed
       JFileChooser fc= new JFileChooser();
       fc.showOpenDialog(null);
       String tenFile= fc.getSelectedFile().getPath();
       a.ghiFile(tenFile);
    }//GEN-LAST:event_jlbGhiFileActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
     jTable.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mousePressed(java.awt.event.MouseEvent evt) {
        int row = jTable.getSelectedRow();  
        if (row != -1) {
            
            String maSo = jTable.getValueAt(row, 0).toString();  
            String hoTen = jTable.getValueAt(row, 1).toString();  
            String gioiTinh = jTable.getValueAt(row, 2).toString(); 
            String queQuan = jTable.getValueAt(row, 3).toString();   
            String tuoi = jTable.getValueAt(row, 4).toString();     
            String luongCung = jTable.getValueAt(row, 5).toString(); 
            String luongThuong = jTable.getValueAt(row, 6).toString(); 
            String tienPhat = jTable.getValueAt(row, 7).toString(); 
            
           
            txtMaGV.setText(maSo);           
            txtHoTen.setText(hoTen);         
            txtQueQuan.setText(queQuan);    
            txtTuoi.setText(tuoi);          
            txtLuongCung.setText(luongCung); 
            txtLuongThuong.setText(luongThuong); 
            txtLuongTru.setText(tienPhat);   
            
            if (gioiTinh.equalsIgnoreCase(" nam")) {
                jbtNam.setSelected(true);  
            } else if (gioiTinh.equalsIgnoreCase(" nu")) {
                jbtNu.setSelected(true);   
            }
        }
    }
});
        
    }//GEN-LAST:event_jTableMouseClicked

    private void jbtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaActionPerformed
int selectedRow = jTable.getSelectedRow();
    if (selectedRow != -1) {
       
        jTable.setValueAt(txtMaGV.getText(), selectedRow, 0);
        jTable.setValueAt(txtHoTen.getText(), selectedRow, 1);
        jTable.setValueAt(jbtNam.isSelected() ? "nam" : "nu", selectedRow, 2);
        jTable.setValueAt(txtQueQuan.getText(), selectedRow, 3);
        jTable.setValueAt(txtTuoi.getText(), selectedRow, 4);
        jTable.setValueAt(txtLuongCung.getText(), selectedRow, 5);
        jTable.setValueAt(txtLuongThuong.getText(), selectedRow, 6);
        jTable.setValueAt(txtLuongTru.getText(), selectedRow, 7);
        
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được sửa!");
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!");
    }
    txtMaGV.setText("");
    txtHoTen.setText("");
    txtQueQuan.setText("");
    txtTuoi.setText("");
    txtLuongCung.setText("");
    txtLuongThuong.setText("");
    txtLuongTru.setText("");
    }//GEN-LAST:event_jbtSuaActionPerformed
private void ghiFile(String filePath) {
     if (filePath == null || filePath.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Không có file nào được chọn để ghi!");
        return;
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        for (int i = 0; i < jTable.getRowCount(); i++) {
            for (int j = 0; j < jTable.getColumnCount(); j++) {
                writer.write(jTable.getValueAt(i, j).toString());
                if (j < jTable.getColumnCount() - 1) {
                    writer.write(","); 
                }
            }
            writer.newLine(); 
        }
        JOptionPane.showMessageDialog(null, "Ghi file thành công!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Lỗi ghi file: " + e.getMessage());
    }
}
    private void jbtSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSachActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
       model.setRowCount(0);
       txtMaGV.setText("");
        txtHoTen.setText("");
        txtQueQuan.setText("");
        txtTuoi.setText("");
        txtLuongCung.setText("");
        txtLuongThuong.setText("");
        txtLuongTru.setText("");
    }//GEN-LAST:event_jbtSachActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed

        
         String ma = JOptionPane.showInputDialog(null,"Nhap ma GD can xoa: ");
            if(a.xoaTheoMa(ma)==true){
                loadData(a.getA()); 
            }else
                 JOptionPane.showMessageDialog(null," ko ton tai "+ ma+ " nay ");
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
 
    String maGV = txtMaGV.getText().trim();
    String hoTen = txtHoTen.getText().trim();
    String gioiTinh = jbtNam.isSelected() ? "Nam" : "Nữ";
    String queQuan = txtQueQuan.getText().trim();
    int tuoi = Integer.parseInt(txtTuoi.getText().trim());
    double luongCung = Double.parseDouble(txtLuongCung.getText().trim());
    double luongThuong = Double.parseDouble(txtLuongThuong.getText().trim());
    double tienPhat = Double.parseDouble(txtLuongTru.getText().trim());

  
    CBGV y = new CBGV( luongCung, luongThuong, tienPhat, hoTen, tuoi, queQuan, maGV, gioiTinh);

   
    if (a.themMoi(y)) {
       
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        double luong = luongCung + luongThuong - tienPhat;
        String[] rowData = {maGV, hoTen, gioiTinh, queQuan, String.valueOf(tuoi), String.valueOf(luongCung), String.valueOf(luongThuong), String.valueOf(tienPhat), String.valueOf(luong)};
        model.addRow(rowData);

       
        JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công!");

        
        txtMaGV.setText("");
        txtHoTen.setText("");
        txtQueQuan.setText("");
        txtTuoi.setText("");
        txtLuongCung.setText("");
        txtLuongThuong.setText("");
        txtLuongTru.setText("");
        jbtNam.setSelected(true); 
    } else {
        
        JOptionPane.showMessageDialog(null, "Đã có mã " + maGV + " trong danh sách. Không thể thêm mới!");
    }
    }//GEN-LAST:event_jbtThemActionPerformed


    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtExitActionPerformed

    private void jbtSXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSXTActionPerformed
    a.sapXepTheoThucLinh();
    loadData(a.getA());
    }//GEN-LAST:event_jbtSXTActionPerformed

    private void jbtTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTongActionPerformed
       double sumPhuCap = a.tongthuclinh();
        txtTong.setText(String.valueOf(sumPhuCap));
    }//GEN-LAST:event_jbtTongActionPerformed

    private void jbtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimActionPerformed
String maTim = txtTim.getText().toUpperCase().trim();
        if(maTim.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ban chua nhap ma tim");
        }else{
            ArrayList<Nguoi> alTim = new ArrayList<Nguoi>();
            Nguoi n = a.tim(maTim);
            alTim.add(n);
            napVaoDa(alTim);
        }
    }//GEN-LAST:event_jbtTimActionPerformed

    private void jbtSXGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSXGActionPerformed
    a.sapXepGiamTheoThucLinh();
    loadData(a.getA());
    }//GEN-LAST:event_jbtSXGActionPerformed
public void napVaoDa(ArrayList<Nguoi> danhSachNguoi) {

    while (jTable.getRowCount() > 0) {
        dtm.removeRow(0);
    }

   
    for (Nguoi n : danhSachNguoi) {
        if (n instanceof CBGV) {
            CBGV giaoVien = (CBGV) n; 
            dtm.addRow(new Object[]{
                giaoVien.getMaSoGiaoVien(),     
                giaoVien.getHoTen(),   
                giaoVien.getTuoi(),       
                giaoVien.getQueQuan(),   
                giaoVien.getLuongCung(), 
                giaoVien.getLuongThuong(),
                giaoVien.getTienPhat(),  
                
            });
        } else {
            
            dtm.addRow(new Object[]{
                n.getMaSoGiaoVien(),  
                n.getHoTen(), 
                n.getTuoi(),  
                n.getQueQuan(), 
                "-", "-", "-", "-" 
            });
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtDocFile;
    private javax.swing.JButton jbtExit;
    private javax.swing.JRadioButton jbtNam;
    private javax.swing.JRadioButton jbtNu;
    private javax.swing.JButton jbtSXG;
    private javax.swing.JButton jbtSXT;
    private javax.swing.JButton jbtSach;
    private javax.swing.JButton jbtSua;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTim;
    private javax.swing.JButton jbtTong;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JLabel jlbGT;
    private javax.swing.JButton jlbGhiFile;
    private javax.swing.JLabel jlbLuongCung;
    private javax.swing.JLabel jlbLuongThuong;
    private javax.swing.JLabel jlbLuongTru;
    private javax.swing.JLabel jlbMaGV;
    private javax.swing.JLabel jlbQue;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JLabel jlbTuoi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuongCung;
    private javax.swing.JTextField txtLuongThuong;
    private javax.swing.JTextField txtLuongTru;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtTong;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
