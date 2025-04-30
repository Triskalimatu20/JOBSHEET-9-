/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author triska
 */
public class MMahasiswa19 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    MMahasiswa19(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; // Default nilai tugas
    }
      
    void tugasDinilai(int nilai) {
        this.nilai = nilai; // Menilai tugas
    }
}
