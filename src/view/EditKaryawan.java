/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Eka Pryhananto
 */
public class EditKaryawan extends JFrame{
    JLabel lJudul = new JLabel("Update Karyawan");
    
    JLabel lNama = new JLabel("Nama");
    public final JTextField tNama = new JTextField(10);
    
    public final JTextField tCek = new JTextField(10);
    
    JLabel lUsia = new JLabel("Usia");
    public final JTextField tUsia= new JTextField(10);
    
    JLabel lGaji = new JLabel("Gaji");
    public final JTextField tGaji = new JTextField(10);
    
    public JButton bUpdate = new JButton("Update");
    public JButton bHapus = new JButton("Hapus");
    
    public JButton bKembali = new JButton("Kembali");
    
     public EditKaryawan(){
        setTitle("Update Karyawan");
        setSize(300,230);
        setLayout(null);
        add(lJudul);
        add(lNama);
        add(tNama);
        add(lUsia);
        add(tUsia);
        add(lGaji);
        add(tGaji);  
        add(bUpdate);
        add(bHapus); 
        add(bKembali);
        
        lJudul.setBounds(15,5,200,20);
        lNama.setBounds(15,30,120,20);
        tNama.setBounds(55,30,200,20);
        
        lUsia.setBounds(15,60,120,20);
        tUsia.setBounds(55,60,200,20);
        
        lGaji.setBounds(15,90,120,20);
        tGaji.setBounds(55,90,200,20);
        
        bUpdate.setBounds(95,130,80,20);
        bHapus.setBounds(175,130,80,20);
        bKembali.setBounds(20,130,80,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return tNama.getText();
    }
    public String getCek(){
        return tCek.getText();
    }
    
    public String getUsia(){
        return tUsia.getText();
    }
    
    public String getGaji(){
        return tGaji.getText();
    }
}
