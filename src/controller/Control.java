/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOkaryawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import karyawan.Karyawan;
import model.Karyawaan;
import view.EditKaryawan;
import view.InputKaryawan;
import view.Menu;
import view.TampilKaryawan;

/**
 *
 * @author Eka Pryhananto
 */
public class Control {
    
//    Karyawaan modell = new Karyawaan();
//    TampilKaryawan tampilVieww = new TampilKaryawan();
  
      Karyawaan modell;
    TampilKaryawan tampilVieww;
    InputKaryawan inputt;
    EditKaryawan editt;
    
    public Control(TampilKaryawan tampilview, Karyawaan model, InputKaryawan input, EditKaryawan edit){
        this.modell = model;
        this.tampilVieww = tampilview;
        this.inputt = input;
        this.editt = edit;
        
        if(modell.getBanyakData() != 0){
            String dataKaryawan[][] = modell.readKaryawan();
            tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        inputt.bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = inputt.getNama();
                String usia = inputt.getUsia();
                String gaji =inputt.getGaji();
                modell.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = modell.readKaryawan();
                tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
            }
        });
         inputt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        inputt.bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.tNama.setText(null);
                inputt.tUsia.setText(null);  
                inputt.tGaji.setText(null);
            }
        });
        editt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editt.dispose();
                

            }
        });
        tampilVieww.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilVieww.dispose();

            }
        });
        editt.bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = editt.getNama();
                String cek = editt.getCek();
                String usia = editt.getUsia();
                String gaji =editt.getGaji();
                modell.update(nama, cek, usia, gaji);
                editt.dispose();
            }
        });
        editt.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = editt.getCek();
                modell.delete(cek);
                editt.dispose();
            }
        });
              tampilVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                EditKaryawan ek = new EditKaryawan();
                ek.tNama.setText(nama);
                ek.tCek.setText(id);
                ek.tUsia.setText(usia);
                ek.tGaji.setText(gaji);
                TampilKaryawan tk = new TampilKaryawan();
                tk.dispose();
                InputKaryawan ik = new InputKaryawan();
                ik.dispose();
                Karyawaan k = new Karyawaan();
                Control ct = new Control(tk, k, ik, ek);
                        
            }
        }
        );
    }
    
   
}
    

