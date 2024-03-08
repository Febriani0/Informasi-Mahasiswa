/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author asus
 */
public class Mahasiswa {
    // Atribut
    private String nama;
    private int umur;
    
    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // Method untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }
    
    // Method untuk mendapatkan umur mahasiswa
    public int getUmur() {
        return umur;
    }
    
    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
