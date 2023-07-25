/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3_SwitchCase;
import java.util.*;
/**
 *
 * @author Rizdhan Syahlan
 */
public class DinginDamaiAksi1 {
    public static void main(String[] args) {
        DinginDamai1 ubah = new DinginDamai1();
        
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DINGIN DAMAI");
        
        ubah.setInputData();
        ubah.SetInputGol();
        ubah.SetInputPend();
        ubah.SetInputJam();
        
        System.out.println("\nKaryawan Yang Bernama: " +ubah.nk);
        System.out.println("Honor Yang Diterima");
        System.out.println("Honor Tetap             Rp. " + ubah.ht);
        System.out.println("Tunjangan Jabatan       Rp. " + ubah.getKeteranganGol());
        System.out.println("Tunjangan Pendidikan    Rp. " + ubah.getKeteranganPd());
        System.out.println("Honor Lembur            Rp. " + ubah.getKeteranganJk());
        System.out.println("========================================");
        System.out.println("Honor Yang Diterima     Rp. " + ubah.jumlahhonor());
    }
}
