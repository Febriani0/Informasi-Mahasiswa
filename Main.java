/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("John", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("Jane", 21);
        
        // Menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.displayInfo();
        
        System.out.println("\nInformasi Mahasiswa 2:");
    }
}
