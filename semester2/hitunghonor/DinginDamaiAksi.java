/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_SwitchCase;

/**
 *
 * @author Rizdhan Syahlan
 */
public class DinginDamaiAksi {
    public static void main(String[] args) {
        DinginDamai ubah = new DinginDamai();
        
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DINGIN DAMAI");
        
        ubah.InputNama();
        ubah.Pilih_Golongan();
        ubah.Pilih_Pendidikan();
        ubah.JamKerja();
        ubah.Proses_JamKerja();
        ubah.Jumlahhonor();

        
        System.out.println("\nKaryawan Yang Bernama: " +ubah.getNama());
        System.out.println("Honor Yang Diterima");
        System.out.println("Honor Tetap             Rp. " + ubah.getHonor());
        System.out.println("Tunjangan Jabatan       Rp. " + ubah.getGolongan());
        System.out.println("Tunjangan Pendidikan    Rp. " + ubah.getPendidikan());
        System.out.println("Honor Lembur            Rp. " + ubah.getJamkerja());
        System.out.println("========================================");
        System.out.println("Honor Yang Diterima     Rp. " + ubah.getJumlahHonor());
    }
}
