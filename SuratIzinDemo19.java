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

public class SuratIzinDemo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat19 stack = new StackSurat19(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt(); input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = input.nextInt(); input.nextLine();
                    stack.push(new Surat19(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampil();
                    }
                    break;
                case 3:
                    Surat19 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampil();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}


