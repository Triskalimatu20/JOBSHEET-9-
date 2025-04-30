/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author triska
 */
public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    Mahasiswa19(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
      
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
    

