/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.DAOkaryawan;
import controller.Control;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.Koneksi;
import model.Karyawaan;
import view.TampilKaryawan;


/**
 *
 * @author Eka Pryhananto
 */
public class Menu extends JFrame implements ActionListener{

     JLabel lJudul = new JLabel("Main Menu");

   public JButton bTambah = new JButton("Tambah Karyawan");
   public JButton bLihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
        setSize(250,150);
        setLayout(null);
        add(lJudul);
        add(bLihat);
        add(bTambah);

        lJudul.setBounds(90,20,200,20);
        bTambah.setBounds(45,40,150,20);
        bLihat.setBounds(45,70,150,20);
        
        bTambah.addActionListener(this);
        bLihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == bTambah){
           TampilKaryawan lk = new TampilKaryawan();
           lk.dispose();
           dispose();
           InputKaryawan ik = new InputKaryawan();
           EditKaryawan ek = new EditKaryawan();
           ek.dispose();
           Karyawaan k = new Karyawaan();
           Control ct = new Control(lk, k,ik,ek);
          
        }
        if(e.getSource() == bLihat){
            TampilKaryawan lk = new TampilKaryawan();
           InputKaryawan ik = new InputKaryawan();
           ik.dispose();
           EditKaryawan ek = new EditKaryawan();
           ek.dispose();
           Karyawaan k = new Karyawaan();
           Control ct = new Control(lk, k,ik,ek);
        }

    }

}

