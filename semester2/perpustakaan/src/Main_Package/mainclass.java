/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Package;

/**
 *
 * @author Rizdhan Syahlan
 */
public class mainclass {
    public int pinjam, lama, kembali, denda, knds;
    public String user, l_user;
    public String pass, l_pass;
    public String rgs_nama, rgs_nim, rgs_jurusan, rgs_kampus, rgs_email, jurusan;
    public String pnjm_nama, pnjm_nim, pnjm_ktgr, pnjm_jns, pnjm_jdl, pnjm_pnjm, pnjm_lm, pnjm_kmbl;
    public String tgl_kmblkn, tgl_otmts, kondisi;
    public boolean valid, valid1;

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    

    public int getKnds() {
        return knds;
    }

    public void setKnds(int knds) {
        this.knds = knds;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    

    public String getTgl_otmts() {
        return tgl_otmts;
    }

    public void setTgl_otmts(String tgl_otmts) {
        this.tgl_otmts = tgl_otmts;
    }

    public String getTgl_kmblkn() {
        return tgl_kmblkn;
    }

    public void setTgl_kmblkn(String tgl_kmblkn) {
        this.tgl_kmblkn = tgl_kmblkn;
    }
    
    public String getPnjm_nama() {
        return pnjm_nama;
    }

    public void setPnjm_nama(String pnjm_nama) {
        this.pnjm_nama = pnjm_nama;
    }

    public String getPnjm_nim() {
        return pnjm_nim;
    }

    public void setPnjm_nim(String pnjm_nim) {
        this.pnjm_nim = pnjm_nim;
    }

    public String getPnjm_ktgr() {
        return pnjm_ktgr;
    }

    public void setPnjm_ktgr(String pnjm_ktgr) {
        this.pnjm_ktgr = pnjm_ktgr;
    }

    public String getPnjm_jns() {
        return pnjm_jns;
    }

    public void setPnjm_jns(String pnjm_jns) {
        this.pnjm_jns = pnjm_jns;
    }

    public String getPnjm_jdl() {
        return pnjm_jdl;
    }

    public void setPnjm_jdl(String pnjm_jdl) {
        this.pnjm_jdl = pnjm_jdl;
    }

    public String getPnjm_pnjm() {
        return pnjm_pnjm;
    }

    public void setPnjm_pnjm(String pnjm_pnjm) {
        this.pnjm_pnjm = pnjm_pnjm;
    }

    public String getPnjm_lm() {
        return pnjm_lm;
    }

    public void setPnjm_lm(String pnjm_lm) {
        this.pnjm_lm = pnjm_lm;
    }

    public String getPnjm_kmbl() {
        return pnjm_kmbl;
    }

    public void setPnjm_kmbl(String pnjm_kmbl) {
        this.pnjm_kmbl = pnjm_kmbl;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
   
    public String getL_user() {
        return l_user;
    }

    public void setL_user(String l_user) {
        this.l_user = l_user;
    }

    public String getL_pass() {
        return l_pass;
    }

    public void setL_pass(String l_pass) {
        this.l_pass = l_pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    public int getPinjam() {
        return pinjam;
    }

    public void setPinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getKembali() {
        return kembali;
    }

    public void setKembali(int kembali) {
        this.kembali = kembali;
    }

    public String getRgs_nama() {
        return rgs_nama;
    }

    public void setRgs_nama(String rgs_nama) {
        this.rgs_nama = rgs_nama;
    }

    public String getRgs_nim() {
        return rgs_nim;
    }

    public void setRgs_nim(String rgs_nim) {
        this.rgs_nim = rgs_nim;
    }

    public String getRgs_jurusan() {
        return rgs_jurusan;
    }

    public void setRgs_jurusan(String rgs_jurusan) {
        this.rgs_jurusan = rgs_jurusan;
    }

    public String getRgs_kampus() {
        return rgs_kampus;
    }

    public void setRgs_kampus(String rgs_kampus) {
        this.rgs_kampus = rgs_kampus;
    }

    public String getRgs_email() {
        return rgs_email;
    }

    public void setRgs_email(String rgs_email) {
        this.rgs_email = rgs_email;
    }
        
    public void loginUser() {
       if(l_user.equals("Rizdhan") && (l_pass.equals("17220120"))) {
           user = "Rizdhan";
           pass = "17220120";
       }
       else if(l_user.equals("Erlangga") && (l_pass.equals("17220734"))) {
           user = "Erlangga";
           pass = "17220734";
       }
       else if(l_user.equals("Maulana") && (l_pass.equals("17220087"))) {
           user = "Maulana";
           pass = "17220087";
       }
       else if(l_user.equals("Fahri") && (l_pass.equals("17220820"))) {
           user = "Fahri";
           pass = "17220820";
       }
    }
    
    public void cekDataRgs() {
        if(rgs_nama == null || rgs_nim == null || jurusan == null || rgs_kampus == null 
           || rgs_email == null || jurusan == "Pilih Jurusan") {
            valid = true;
        }
        //untuk logika cek semua data di form registrasi apakah semua sudah terisi atau belum
    }
    
    public void cekDataPnjm() {
        if(pnjm_nama == null || pnjm_nim == null || pnjm_ktgr == "Pilih Kategori" 
           || pnjm_jns == "Pilih Jenis" || pnjm_jdl == "Pilih Judul" 
           || pnjm_pnjm == null || pnjm_lm == null || pnjm_kmbl == null) {
            valid1 = true;
        }
        //untuk logika cek semua data di form Peminjaman apakah semua sudah terisi atau belum
    }
    
    public void kondisiBook(){
        if(kondisi.equals("Baik") || kondisi.equals(0)){
            knds = 0;
        }
        else if(kondisi.equals("Menengah") || kondisi.equals(1)){
            knds = 50000;
        }
        else if(kondisi.equals("Rusak / Hilang") || kondisi.equals(2)){
            knds = 100000;
        }
        //memberi nilai denda kondisi buku
    }
}