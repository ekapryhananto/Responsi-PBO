/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.DAOkaryawan;
import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import karyawan.Karyawan;
import model.Karyawaan;

/**
 *
 * @author Eka Pryhananto
 */
public class InputKaryawan extends JFrame {
    JLabel lJudul = new JLabel("Input Karyawan");
    
    JLabel lNama = new JLabel("Nama");
   public JTextField tNama = new JTextField(50);
    
    JLabel lUsia = new JLabel("Usia");
   public JTextField tUsia = new JTextField(50);
    
    JLabel lGaji = new JLabel("Gaji");
   public JTextField tGaji = new JTextField(50);
    
    public JButton bSubmit = new JButton("Submit");
    public JButton bReset = new JButton("Reset");
    public JButton bKembali = new JButton("Kembali");
    
    public InputKaryawan(){
        setTitle("Input Karyawan");
        setSize(310, 300);
        setLayout(null);
        
        add(lJudul);
        add(lNama);
        add(tNama);
        add(lUsia);
        add(tUsia);
        add(lGaji);
        add(tGaji);
        add(bSubmit);
        add(bReset);
        add(bKembali);
        
        lJudul.setBounds(20, 35, 100, 20);
        lNama.setBounds(20, 55, 100, 20);
        tNama.setBounds(120, 55, 150, 20);
        lUsia.setBounds(20, 75, 100, 20);
        tUsia.setBounds(120, 75, 150, 20);
        lGaji.setBounds(20, 95, 100, 20);
        tGaji.setBounds(120, 95, 150, 20);
        bSubmit.setBounds(90, 120, 90, 20);
        bReset.setBounds(180, 120, 90, 20);
        bKembali.setBounds(20, 150, 250, 20);
        
        
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public String getNama(){
        return tNama.getText();
    }
    
    public String getUsia(){
        return tUsia.getText();
    }
    
    public String getGaji(){
        return tGaji.getText();
    }
    

}
