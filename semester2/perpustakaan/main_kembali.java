/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Package;

import java.util.Date;

/**
 *
 * @author Rizdhan Syahlan
 */
public class main_kembali {
    public String kmbl_nama, kmbl_nim, kmbl_ktgr, kmbl_jns, kmbl_jdl, kmbl_pnjm, kmbl_lm, kmbl_kmbl, denda, kondisi;
    Date kmbl_kmblkn;

    public Date getKmbl_kmblkn() {
        return kmbl_kmblkn;
    }

    public void setKmbl_kmblkn(Date kmbl_kmblkn) {
        this.kmbl_kmblkn = kmbl_kmblkn;
    }
    
    
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }
    public boolean valid;

    public String getKmbl_nama() {
        return kmbl_nama;
    }

    public void setKmbl_nama(String kmbl_nama) {
        this.kmbl_nama = kmbl_nama;
    }

    public String getKmbl_nim() {
        return kmbl_nim;
    }

    public void setKmbl_nim(String kmbl_nim) {
        this.kmbl_nim = kmbl_nim;
    }

    public String getKmbl_ktgr() {
        return kmbl_ktgr;
    }

    public void setKmbl_ktgr(String kmbl_ktgr) {
        this.kmbl_ktgr = kmbl_ktgr;
    }

    public String getKmbl_jns() {
        return kmbl_jns;
    }

    public void setKmbl_jns(String kmbl_jns) {
        this.kmbl_jns = kmbl_jns;
    }

    public String getKmbl_jdl() {
        return kmbl_jdl;
    }

    public void setKmbl_jdl(String kmbl_jdl) {
        this.kmbl_jdl = kmbl_jdl;
    }

    public String getKmbl_pnjm() {
        return kmbl_pnjm;
    }

    public void setKmbl_pnjm(String kmbl_pnjm) {
        this.kmbl_pnjm = kmbl_pnjm;
    }

    public String getKmbl_lm() {
        return kmbl_lm;
    }

    public void setKmbl_lm(String kmbl_lm) {
        this.kmbl_lm = kmbl_lm;
    }

    public String getKmbl_kmbl() {
        return kmbl_kmbl;
    }

    public void setKmbl_kmbl(String kmbl_kmbl) {
        this.kmbl_kmbl = kmbl_kmbl;
    }

   
    
    public void cekDataKmbl() {
        if(kmbl_nama == null || kmbl_nim == null || kmbl_ktgr == null 
           || kmbl_jns == null || kmbl_jdl == null ||
           kmbl_pnjm == null || kmbl_lm == null || kmbl_kmbl == null 
           || kmbl_kmblkn == null || denda == null || kondisi == ""){
            valid = true;
        }
        //untuk logika cek semua data di form Pengembalian apakah semua sudah terisi atau belum
    }
    
}
