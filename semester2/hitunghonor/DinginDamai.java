/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_SwitchCase;
import java.util.Scanner;
/**
 *
 * @author Rizdhan Syahlan
 */
public class DinginDamai {
    // Deklarasi Variabel
    public String nama_karyawan, kode_pendidikan, golongan;
    public int jam_kerja, honor_tetap = 300000, jumlah_honor;
    public double total_hpendidikan, total_hjabatan, honor_lembur;
    
    //Pembuatan Objek Scan
    Scanner input = new Scanner(System.in);
    
    public int getHonor() {
        return honor_tetap;
    }
    
    public void InputNama() {
        System.out.print("Nama Karyawan           : ");
        nama_karyawan = input.nextLine();
    }
    
    public String getNama() {
        return nama_karyawan;
    }
    
    public void Pilih_Golongan() {
        System.out.print("Golongan [1/2/3]        : ");
        golongan = input.nextLine();
        Proses_Golongan();
    }
    
    public void Proses_Golongan() {
            if(golongan.equals("1")) {
                total_hjabatan = 0.05 * honor_tetap;
            }
            else if(golongan.equals("2")) {
                total_hjabatan = 0.1 * honor_tetap;   
            }
            else if(golongan.equals("3")) {
                total_hjabatan = 0.15 * honor_tetap;
            }
            else {
                System.out.println("Kode Yang Anda Masukan Salah, Silahkan Coba Lagi...");
                Pilih_Golongan();
            }
    }
    
    public double getGolongan() {
        return total_hjabatan;
    }
    
    public void Pilih_Pendidikan() {
        System.out.print("Pendidikan [SMU/D3/S1]  : ");
        kode_pendidikan = input.nextLine();
        Proses_Pendidikan();
    }
    
    public void Proses_Pendidikan() {
            if(kode_pendidikan.equals("SMU") || kode_pendidikan.equals("smu")) {
                total_hpendidikan = 0.025 * honor_tetap;
            }       
            else if(kode_pendidikan.equals("D3") || kode_pendidikan.equals("d3")) {
                total_hpendidikan = 0.05 * honor_tetap;   
            }
            else if(kode_pendidikan.equals("S1") || kode_pendidikan.equals("s1")) {
                total_hpendidikan = 0.075 * honor_tetap;
            } 
            else {
                System.out.println("Kode Yang Anda Masukan Salah, Silahkan Coba Lagi...");
                Pilih_Pendidikan();
            }
    }
    
    public double getPendidikan() {
        return total_hpendidikan;
    }
    
    public void JamKerja() {
        System.out.print("Jumlah Jam Kerja        : ");
        jam_kerja = input.nextInt();
    }

    public void Proses_JamKerja() {
            if(jam_kerja > 8) {
                honor_lembur = (jam_kerja - 8) * 2500;
            }
    }
   
    public double getJamkerja() {
        return honor_lembur;
    }
    
    public void Jumlahhonor() {
    jumlah_honor = (int) (honor_tetap + total_hjabatan + total_hpendidikan + honor_lembur);
    }
    
    public int getJumlahHonor() {
        return jumlah_honor;
    }
}
