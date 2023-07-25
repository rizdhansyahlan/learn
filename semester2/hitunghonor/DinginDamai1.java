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
public class DinginDamai1 {
    public String nk;
    public int gol, kp, jk, ht=300000;
    public double tp, tj, hl, jh;
    Scanner input = new Scanner(System.in);
      
    public void setInputData() {
        System.out.print("Nama Karyawan           : ");
        nk = input.nextLine();
    }
    
    
    public void SetInputGol() {
        System.out.print("Golongan [1/2/3]        : ");
        gol = input.nextInt();
        getKeteranganGol();
    }
    
    
    public double getKeteranganGol() {
        switch (gol) {
            case 1:
                tj = 0.05 * ht;
                break;
            case 2:
                tj = 0.1 * ht;
                break;
            case 3:
                tj = 0.15 * ht;
                break;
            default:
                System.out.println("Kode Salah, Masukan Ulang");
                SetInputGol();
        }
    return tj;
    }
    
    
    public void SetInputPend() {
        System.out.print("Pendidikan [SMU/D3/S1]  : ");
        kp = input.nextInt();
        getKeteranganPd();
    }
    
    
    public double getKeteranganPd() {
        switch (kp) {
            case 1:
                tp = 0.025 * 300000;
                break;
            case 2:
                tp = 0.5 * 300000;
                break;
            case 3:
                tp = 0.075 * 300000;
                break;
            default:
                System.out.println("Kode Salah, Harap Masukan Ulang");
                SetInputPend();
        }
    return tp;        
    }
    
    
    public void SetInputJam() {
        System.out.print("Jumlah Jam Kerja        : ");
        jk = input.nextInt();
        getKeteranganJk();
    }
    public double getKeteranganJk() {
            if(jk > 8) {
                hl = (jk - 8) * 2500;
            }
            else {
                hl = 0;
            }
    return hl;
    }
    
    
    public double jumlahhonor() {
    return jh = ht + tj + tp + hl;
}
}
