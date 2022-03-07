/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class balok implements menghitungRuang {
    double panjang, tinggi, lebar;

    public balok(double panjang, double tinggi, double lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    
    
    
    @Override
    public void volumeBalok() {
        double hasil;
        hasil = panjang*lebar*tinggi;
        System.out.println("Volume Balok = " + hasil);
    }

    @Override
    public void permukaanBalok() {
        double hasil;
        hasil = 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
        System.out.println("Luas Permukaan Balok = " + hasil);
    }

    @Override
    public void volumeTabung() {
        
    }

    @Override
    public void permukaanTabung() {
        
    }
    
}
