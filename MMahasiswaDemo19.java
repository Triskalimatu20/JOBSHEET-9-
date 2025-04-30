/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author triska
 */
import java.util.Scanner;

public class MMahasiswaDemo19 {
    public static void main(String []args) {
        MStackTugasMahasiswa19 stack = new MStackTugasMahasiswa19(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas"); 
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama Dikumpulkan");
            System.out.println("6. Melihat Jumlah Tugas yang Dikirim");
            System.out.print("Pilih: " );
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    MMahasiswa19 mhs = new MMahasiswa19(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    MMahasiswa19 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    MMahasiswa19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 5:
                    MMahasiswa19 pertama = stack.peekBottom();
                    if (pertama != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + pertama.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.countTugas());
                    break;
                case 7:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6); // Ubah batas while untuk menyesuaikan menu baru
    }
}


