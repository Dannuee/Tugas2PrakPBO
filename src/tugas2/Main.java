/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih,loop = 1, exit = 0;
        double panjang; double lebar; double tinggiB; double tinggiT; double jari;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=============");
            System.out.println(" Menu Utama");
            System.out.println("=============\n");
            System.out.println("1. Hitung Balok\n2. Hitung Tabung\n0. Exit\nPilihan : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("Input Panjang : ");
                panjang = input.nextDouble();
                System.out.println("Input Lebar   : ");
                lebar = input.nextDouble();
                System.out.println("Input Tinggi  : ");
                tinggiB = input.nextDouble();
                persegi persegi = new persegi(panjang,lebar);
                balok balok = new balok (panjang,lebar,tinggiB);
                persegi.luasPersegi();
                persegi.kelilingPersegi();
                balok.permukaanBalok();
                balok.volumeBalok();
            }
            else if (pilih == 2) {
                System.out.println("Input Tinggi    : ");
                tinggiT = input.nextDouble();
                System.out.println("Input Jari-Jari : ");
                jari = input.nextDouble();
                lingkaran lingkaran = new lingkaran(jari);
                tabung tabung = new tabung(tinggiT,jari);
                lingkaran.kelilingLingkaran();
                lingkaran.luasLingkaran();
                tabung.permukaanTabung();
                tabung.volumeTabung();
            }
            else if (pilih == 0) {
                exit = 1;
                loop = 0;
            }
            else {
                System.out.println("Input yang anda masukan salah!\n");
            }
            if (exit == 0){
                System.out.println("Ulangi? [Tidak = 0 / Iya = 1] : "); 
                loop = input.nextInt();
            }
        } while (loop == 1);
             System.out.println("=============");
             System.out.println("Terima kasih");
             System.out.println("=============");            
    }
    
}
