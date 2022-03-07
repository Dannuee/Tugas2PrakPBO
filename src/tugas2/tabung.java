/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class tabung implements menghitungRuang {
    double tinggi;
    double jari;

    public tabung(double tinggi, double jari) {
        this.tinggi = tinggi;
        this.jari = jari;
    }
    
    @Override
    public void volumeBalok() {
        
    }

    @Override
    public void permukaanBalok() {
        
    }

    @Override
    public void volumeTabung() {
        double volume;
        volume = 3.14*(jari*jari)*tinggi;
        System.out.println("Volume Tabung = " + volume);
    }

    @Override
    public void permukaanTabung() {
        double luas;
        luas = (2*3.14*jari)*(jari+tinggi);
        System.out.println("Luas Permukaan Tabung = " + luas);
    }
    
}
