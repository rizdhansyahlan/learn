/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_Package;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author surya
 */
public class main extends javax.swing.JFrame {
    mainclass mc = new mainclass(); //untuk mendeklarasikan mainclass.java 
    main_kembali mk = new main_kembali(); //untuk mendeklarasikan main_kembali.java 
    /**
     * Creates new form main
     */
    
    Color paneDefault;
    Color paneClosed;
    int x, y;
    public boolean valid = false;
    //Variable pembantu
    
    public main() {
        initComponents();
        perpus.requestFocusInWindow(); //untuk request fokus
        
        taDesign(); //untuk memanggil method table anggota
        tpDesign(); //untuk memanggil method table pinjam
        
        tanggal(); //untuk memanggil method tanggal
        
        kategori.setSelectedItem("Pilih Kategori");
        jenis.setSelectedItem("Pilih Jenis");
        judul.setSelectedItem("Pilih Judul");
        r_jurusan.setSelectedItem("");
        lm_pnjm.setSelectedItem("");
        kondisi.setSelectedItem("");
        tgl_kmbl.setText("");
        //untuk memberikan nilai dimasing-masing textfield
        
        paneDefault = new Color (0, 23, 45);
        paneClosed = new Color (245, 91, 49);
        
    }
    
    Calendar c1 = Calendar.getInstance(); //Variable pendukung
    void tanggal() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
        tgl_pnjm.setText(sdf.format(c1.getTime()));
        tgl_kembalikan.setDate(c1.getTime());
        //untuk setting tanggal
    }
    
    
    void taDesign(){
        table_anggota.getColumnModel().getColumn(2).setMinWidth(0);
        table_anggota.getColumnModel().getColumn(2).setMaxWidth(0);
        table_anggota.getColumnModel().getColumn(3).setMinWidth(0);
        table_anggota.getColumnModel().getColumn(3).setMaxWidth(0);
        table_anggota.getColumnModel().getColumn(4).setMinWidth(0);
        table_anggota.getColumnModel().getColumn(4).setMaxWidth(0);
        //sebuah metode untuk menyembunyikan column pada table anggota
    }
    void tpDesign(){
        table_pinjam.getColumnModel().getColumn(2).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(2).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(3).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(3).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(4).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(4).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(5).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(5).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(6).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(6).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(7).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(7).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(8).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(8).setMaxWidth(0);
        table_pinjam.getColumnModel().getColumn(11).setMinWidth(0);
        table_pinjam.getColumnModel().getColumn(11).setMaxWidth(0);
        //sebuah metode untuk menyembunyikan column pada table pinjam
    }
    
    
    void BersihRgs() {
        r_nama.setText("");
        r_nim.setText("");
        r_kampus.setText("");
        r_email.setText("");
        r_jurusan.setSelectedItem("");
        //untuk mengosongkan textfield dan combo box
        
        mc.setRgs_nama(null);
        mc.setRgs_nim(null);
        mc.setJurusan(null);
        mc.setRgs_kampus(null);
        mc.setRgs_email(null);   
        //untuk mengatur variable di mainclass supaya null
    }
    
    void BersihPnjm() {
        nm_pnjm.setText("");
        nim_pnjm.setText("");
        kategori.setSelectedItem("Pilih Kategori");
        jenis.setSelectedItem("Pilih Jenis");
        judul.setSelectedItem("Pilih Judul");
        tanggal(); //untuk memanggil method tanggal
        lm_pnjm.setSelectedIndex(-1);
        tgl_kmbl.setText("");
        //untuk mengosongkan textfield dan combo box
        
        mc.setPnjm_nama(null);
        mc.setPnjm_nim(null);
        mc.setPnjm_ktgr(null);
        mc.setPnjm_jns(null);
        mc.setPnjm_jdl(null);
        mc.setPnjm_lm(null);
        mc.setPnjm_pnjm(null);
        mc.setPnjm_kmbl(null);
        //untuk mengatur variable di mainclass supaya null
    }
    
    void BersihPngmbln(){
        nm_kmbl.setText("");
        nim_kmbl.setText("");
        kategori_kmbl.setText("");
        jenis_kmbl.setText("");
        judul_kmbl.setText("");
        tgl_pnjm1.setText("");
        lm_pnjm1.setText("");
        tgl_kmbl1.setText("");
        tgl_kembalikan.setDate(c1.getTime());
        denda.setText("");
        kondisi.setSelectedItem("");
        //untuk mengosongkan textfield, combo box, serta mengatur jDateChooser
        
        mk.setKmbl_nama(null);
        mk.setKmbl_nim(null);
        mk.setKmbl_ktgr(null);
        mk.setKmbl_jns(null);
        mk.setKmbl_jdl(null);
        mk.setKmbl_pnjm(null);
        mk.setKmbl_lm(null);
        mk.setKmbl_kmbl(null);
        mk.setKmbl_kmblkn(null);
        mk.setDenda(null);
        mk.setKondisi(null);
        //untuk mengatur variable di main_kembali supaya null
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_Utama = new javax.swing.JPanel();
        p_Peminjaman = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cari_anggota = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_anggota = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        save_pnjm = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        lm_pnjm = new javax.swing.JComboBox<>();
        judul = new javax.swing.JComboBox<>();
        kategori = new javax.swing.JComboBox<>();
        jenis = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nm_pnjm = new javax.swing.JTextField();
        nim_pnjm = new javax.swing.JTextField();
        tgl_pnjm = new javax.swing.JTextField();
        tgl_kmbl = new javax.swing.JTextField();
        p_Pengembalian = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cari_peminjam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pinjam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        total_dnd = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nm_kmbl = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nim_kmbl = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        kategori_kmbl = new javax.swing.JTextField();
        jenis_kmbl = new javax.swing.JTextField();
        judul_kmbl = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tgl_pnjm1 = new javax.swing.JTextField();
        lm_pnjm1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tgl_kmbl1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        denda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fnsh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        kondisi = new javax.swing.JComboBox<>();
        tgl_kembalikan = new com.toedter.calendar.JDateChooser();
        p_Atas = new javax.swing.JPanel();
        paneClose = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        p_Registrasi = new javax.swing.JPanel();
        paneRgs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        r_nama = new javax.swing.JTextField();
        r_nim = new javax.swing.JTextField();
        r_kampus = new javax.swing.JTextField();
        r_email = new javax.swing.JTextField();
        simpan_btn = new javax.swing.JButton();
        bersih_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        r_jurusan = new javax.swing.JComboBox<>();
        p_Perpustakaan = new javax.swing.JPanel();
        p_Perpustakaan_2 = new javax.swing.JPanel();
        perpus = new javax.swing.JLabel();
        l_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p_Utama.setBackground(new java.awt.Color(2, 56, 110));
        p_Utama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 23, 45), 3));

        p_Peminjaman.setBackground(new java.awt.Color(0, 73, 141));

        jPanel2.setBackground(new java.awt.Color(0, 80, 160));

        cari_anggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cari_anggotaKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("DATA ANGGOTA");

        jLabel29.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cari Anggota");

        table_anggota.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        table_anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NIM", "JURUSAN", "KAMPUS", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_anggota.setShowHorizontalLines(true);
        table_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_anggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_anggota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(cari_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 80, 160));

        jButton1.setBackground(new java.awt.Color(0, 23, 45));
        jButton1.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        save_pnjm.setBackground(new java.awt.Color(0, 23, 45));
        save_pnjm.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        save_pnjm.setForeground(new java.awt.Color(255, 255, 255));
        save_pnjm.setText("Save");
        save_pnjm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_pnjmActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("LAMA PINJAM");

        lm_pnjm.setEditable(true);
        lm_pnjm.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        lm_pnjm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        lm_pnjm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lm_pnjmActionPerformed(evt);
            }
        });

        judul.setEditable(true);
        judul.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        kategori.setEditable(true);
        kategori.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mata Kuliah", "Pengetahuan Umum", "Komik" }));
        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });

        jenis.setEditable(true);
        jenis.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PEMINJAMAN");

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NAMA");

        jLabel10.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NIM");

        jLabel11.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BUKU");

        jLabel12.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TANGGAL PINJAM");

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TANGGAL KEMBALI");

        nm_pnjm.setEditable(false);
        nm_pnjm.setBackground(new java.awt.Color(255, 255, 255));
        nm_pnjm.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        nim_pnjm.setEditable(false);
        nim_pnjm.setBackground(new java.awt.Color(255, 255, 255));
        nim_pnjm.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        tgl_pnjm.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        tgl_kmbl.setEditable(false);
        tgl_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nim_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nm_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(tgl_pnjm)
                                        .addGap(78, 78, 78))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(lm_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(tgl_kmbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addGap(27, 27, 27)))
                                .addComponent(save_pnjm)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(212, 212, 212))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nim_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kategori)
                    .addComponent(jenis)
                    .addComponent(judul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tgl_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lm_pnjm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tgl_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_pnjm)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_PeminjamanLayout = new javax.swing.GroupLayout(p_Peminjaman);
        p_Peminjaman.setLayout(p_PeminjamanLayout);
        p_PeminjamanLayout.setHorizontalGroup(
            p_PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_PeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_PeminjamanLayout.setVerticalGroup(
            p_PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_PeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_Pengembalian.setBackground(new java.awt.Color(0, 73, 141));

        jPanel8.setBackground(new java.awt.Color(0, 80, 160));

        jLabel30.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("DATA PEMINJAMAN BUKU");

        jLabel31.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Cari Peminjam");

        cari_peminjam.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        cari_peminjam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cari_peminjamKeyReleased(evt);
            }
        });

        table_pinjam.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        table_pinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NIM", "KATEGORI", "JENIS", "JUDUL", "TGL PINJAM", "LAMA", "KEMBALI", "DIKEMBALIKAN", "DENDA", "STATUS", "KONDISI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pinjam.setGridColor(new java.awt.Color(153, 153, 153));
        table_pinjam.setShowGrid(true);
        table_pinjam.setShowVerticalLines(false);
        table_pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_pinjam);
        table_pinjam.getAccessibleContext().setAccessibleName("");
        table_pinjam.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL DENDA");

        total_dnd.setEditable(false);
        total_dnd.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_dnd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addComponent(cari_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_dnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(117, 117, 117))
        );

        jPanel9.setBackground(new java.awt.Color(0, 80, 160));

        jLabel18.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PENGEMBALIAN");

        jLabel19.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("NAMA");

        nm_kmbl.setEditable(false);
        nm_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("NIM");

        nim_kmbl.setEditable(false);
        nim_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("BUKU");

        kategori_kmbl.setEditable(false);
        kategori_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jenis_kmbl.setEditable(false);
        jenis_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        judul_kmbl.setEditable(false);
        judul_kmbl.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TANGGAL PINJAM");

        tgl_pnjm1.setEditable(false);
        tgl_pnjm1.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        lm_pnjm1.setEditable(false);
        lm_pnjm1.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LAMA PINJAM");

        jLabel23.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TANGGAL KEMBALI");

        tgl_kmbl1.setEditable(false);
        tgl_kmbl1.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DENDA");

        jLabel27.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("TANGGAL DIKEMBALIKAN");

        denda.setEditable(false);
        denda.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Nyala", 2, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kategori");

        jLabel16.setFont(new java.awt.Font("Nyala", 2, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Jenis");

        jLabel17.setFont(new java.awt.Font("Nyala", 2, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Judul");

        fnsh.setBackground(new java.awt.Color(0, 23, 45));
        fnsh.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        fnsh.setForeground(new java.awt.Color(255, 255, 255));
        fnsh.setText("Finish");
        fnsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnshActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 23, 45));
        jButton2.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 23, 45));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Count");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("KONDISI BUKU");

        kondisi.setEditable(true);
        kondisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baik", "Menengah", "Rusak / Hilang" }));
        kondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kondisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(kategori_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jenis_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(judul_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nim_kmbl)
                                    .addComponent(nm_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tgl_pnjm1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(lm_pnjm1)
                                    .addComponent(tgl_kmbl1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(104, 104, 104)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(65, 65, 65)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kondisi, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                            .addComponent(denda, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(tgl_kembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fnsh)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(nm_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nim_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel21)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kategori_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenis_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judul_kmbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tgl_pnjm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lm_pnjm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tgl_kembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tgl_kmbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnsh)
                                    .addComponent(jButton2)))))))
        );

        javax.swing.GroupLayout p_PengembalianLayout = new javax.swing.GroupLayout(p_Pengembalian);
        p_Pengembalian.setLayout(p_PengembalianLayout);
        p_PengembalianLayout.setHorizontalGroup(
            p_PengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_PengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_PengembalianLayout.setVerticalGroup(
            p_PengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_PengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_PengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_PengembalianLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        p_Atas.setBackground(new java.awt.Color(0, 23, 45));
        p_Atas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p_AtasMouseDragged(evt);
            }
        });
        p_Atas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_AtasMousePressed(evt);
            }
        });

        paneClose.setBackground(new java.awt.Color(0, 23, 45));
        paneClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paneCloseMouseExited(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close_icon.png"))); // NOI18N

        javax.swing.GroupLayout paneCloseLayout = new javax.swing.GroupLayout(paneClose);
        paneClose.setLayout(paneCloseLayout);
        paneCloseLayout.setHorizontalGroup(
            paneCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCloseLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneCloseLayout.setVerticalGroup(
            paneCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24)
        );

        jLabel32.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Aplikasi Perpustakaan");

        javax.swing.GroupLayout p_AtasLayout = new javax.swing.GroupLayout(p_Atas);
        p_Atas.setLayout(p_AtasLayout);
        p_AtasLayout.setHorizontalGroup(
            p_AtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_AtasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_AtasLayout.setVerticalGroup(
            p_AtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_AtasLayout.createSequentialGroup()
                .addComponent(paneClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p_Registrasi.setBackground(new java.awt.Color(0, 73, 141));

        paneRgs.setBackground(new java.awt.Color(0, 80, 160));

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIM");

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JURUSAN");

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KAMPUS");

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMAIL");

        r_nama.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        r_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                r_namaKeyReleased(evt);
            }
        });

        r_nim.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        r_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                r_nimKeyReleased(evt);
            }
        });

        r_kampus.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        r_kampus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                r_kampusKeyReleased(evt);
            }
        });

        r_email.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        r_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                r_emailKeyReleased(evt);
            }
        });

        simpan_btn.setBackground(new java.awt.Color(0, 23, 45));
        simpan_btn.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        simpan_btn.setForeground(new java.awt.Color(255, 255, 255));
        simpan_btn.setText("Save");
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });

        bersih_btn.setBackground(new java.awt.Color(0, 23, 45));
        bersih_btn.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        bersih_btn.setForeground(new java.awt.Color(255, 255, 255));
        bersih_btn.setText("Clear");
        bersih_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersih_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRASI MAHASISWA");
        jLabel7.setToolTipText("");

        r_jurusan.setEditable(true);
        r_jurusan.setFont(new java.awt.Font("Futura Bk BT", 0, 12)); // NOI18N
        r_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknologi Informasi", "Sistem Informasi", "Manajemen", "Akuntansi" }));
        r_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_jurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneRgsLayout = new javax.swing.GroupLayout(paneRgs);
        paneRgs.setLayout(paneRgsLayout);
        paneRgsLayout.setHorizontalGroup(
            paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRgsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneRgsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneRgsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneRgsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneRgsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r_kampus, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneRgsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneRgsLayout.createSequentialGroup()
                                .addComponent(bersih_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(r_email, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(paneRgsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        paneRgsLayout.setVerticalGroup(
            paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRgsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(r_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(r_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_kampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneRgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bersih_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout p_RegistrasiLayout = new javax.swing.GroupLayout(p_Registrasi);
        p_Registrasi.setLayout(p_RegistrasiLayout);
        p_RegistrasiLayout.setHorizontalGroup(
            p_RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_RegistrasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneRgs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_RegistrasiLayout.setVerticalGroup(
            p_RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_RegistrasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneRgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_Perpustakaan.setBackground(new java.awt.Color(0, 73, 141));

        p_Perpustakaan_2.setBackground(new java.awt.Color(0, 80, 160));

        perpus.setFont(new java.awt.Font("Futura Bk BT", 1, 18)); // NOI18N
        perpus.setForeground(new java.awt.Color(255, 255, 255));
        perpus.setText("PERPUSTAKAAN");

        l_label.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        l_label.setForeground(new java.awt.Color(255, 255, 255));
        l_label.setText("Selamat Datang ------");

        javax.swing.GroupLayout p_Perpustakaan_2Layout = new javax.swing.GroupLayout(p_Perpustakaan_2);
        p_Perpustakaan_2.setLayout(p_Perpustakaan_2Layout);
        p_Perpustakaan_2Layout.setHorizontalGroup(
            p_Perpustakaan_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_Perpustakaan_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_Perpustakaan_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perpus)
                    .addComponent(l_label, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_Perpustakaan_2Layout.setVerticalGroup(
            p_Perpustakaan_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_Perpustakaan_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perpus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_PerpustakaanLayout = new javax.swing.GroupLayout(p_Perpustakaan);
        p_Perpustakaan.setLayout(p_PerpustakaanLayout);
        p_PerpustakaanLayout.setHorizontalGroup(
            p_PerpustakaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_PerpustakaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_Perpustakaan_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_PerpustakaanLayout.setVerticalGroup(
            p_PerpustakaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_PerpustakaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_Perpustakaan_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_UtamaLayout = new javax.swing.GroupLayout(p_Utama);
        p_Utama.setLayout(p_UtamaLayout);
        p_UtamaLayout.setHorizontalGroup(
            p_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_UtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_Registrasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_Perpustakaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_Pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_Peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(p_Atas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_UtamaLayout.setVerticalGroup(
            p_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_UtamaLayout.createSequentialGroup()
                .addComponent(p_Atas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_UtamaLayout.createSequentialGroup()
                        .addComponent(p_Peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_Pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(p_UtamaLayout.createSequentialGroup()
                        .addComponent(p_Perpustakaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        try {
            if(kategori.getSelectedItem().equals("Mata Kuliah")) {
                jenis.removeAllItems();
                jenis.addItem("Teknologi Informasi");
                jenis.addItem("Sistem Informasi");
                jenis.addItem("Manajemen");
                jenis.addItem("Akuntansi");
                jenis.setSelectedItem("Pilih Jenis");
                judul.removeAllItems();
                judul.setSelectedItem("Pilih Judul");
            }
            else if(kategori.getSelectedItem().equals("Pengetahuan Umum")) {
                jenis.removeAllItems();
                jenis.addItem("Alam");
                jenis.addItem("Sosial");
                jenis.addItem("Ekonomi");
                jenis.setSelectedItem("Pilih Jenis");
                judul.removeAllItems();
                judul.setSelectedItem("Pilih Judul");
            }
            else if(kategori.getSelectedItem().equals("Komik")) {
                jenis.removeAllItems();
                jenis.addItem("Action");
                jenis.addItem("Mystery");
                jenis.addItem("Sports");
                jenis.setSelectedItem("Pilih Jenis");
                judul.removeAllItems();
                judul.setSelectedItem("Pilih Judul");
            }  
        }
        catch(Exception e) {          
        } //untuk percabangan kategori buku
    }//GEN-LAST:event_kategoriActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        try {
            if(jenis.getSelectedItem().equals("Teknologi Informasi")) {
                judul.removeAllItems();
                judul.addItem("Pemrograman Berbasis Objek");
                judul.addItem("Arsitektur Komputer");
                judul.addItem("Struktur Data");
                judul.addItem("Logika Algortima");
                judul.setSelectedItem("Pilih Judul");      
            }
            else if(jenis.getSelectedItem().equals("Sistem Informasi")) {
                judul.removeAllItems();
                judul.addItem("Aplikasi Basis Data");
                judul.addItem("Web Programming");
                judul.addItem("Struktur Data");
                judul.addItem("Dasar Pemrograman");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Manajemen")) {
                judul.removeAllItems();
                judul.addItem("Perpajakan");
                judul.addItem("Pengantar Ekonomi Makro");
                judul.addItem("Pengantar Ekonomi Mikro");
                judul.addItem("Akuntansi Dasar");
                judul.setSelectedItem("Pilih Judul"); 
            }  
            else if(jenis.getSelectedItem().equals("Akuntansi")) {
                judul.removeAllItems();
                judul.addItem("Akuntansi Dasar");
                judul.addItem("Pengantar Ekonomi Mikro");
                judul.addItem("Pengantar Ekonomi Makro");
                judul.addItem("Akuntansi Keuangan Menengah");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Alam")) {
                judul.removeAllItems();
                judul.addItem("Bumi dan Tata Surya");
                judul.addItem("RPAL");
                judul.addItem("Geografi");
                judul.addItem("Anatomi Manusia");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Sosial")) {
                judul.removeAllItems();
                judul.addItem("Sejarah Manusia");
                judul.addItem("Politik Negara");
                judul.addItem("Sejerah Kemerdekaan RI");
                judul.addItem("Norma dan UUD 1945");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Ekonomi")) {
                judul.removeAllItems();
                judul.addItem("Strategi Pemasaran Pintar");
                judul.addItem("Sukses Bisnis");
                judul.addItem("Peluang Digital Market");
                judul.addItem("Bisnis Properti");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Action")) {
                judul.removeAllItems();
                judul.addItem("Naruto");
                judul.addItem("One Piece");
                judul.addItem("Bleach");
                judul.addItem("Dragon Ball");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Mystery")) {
                judul.removeAllItems();
                judul.addItem("Detectif Conan");
                judul.addItem("Hyouka");
                judul.addItem("Spy x Family");
                judul.addItem("Death Note");
                judul.setSelectedItem("Pilih Judul"); 
            }
            else if(jenis.getSelectedItem().equals("Sports")) {
                judul.removeAllItems();
                judul.addItem("Captain Tsubatsa");
                judul.addItem("Inazuma Eleven");
                judul.addItem("Haikyuu");
                judul.addItem("Eyeshield 21");
                judul.setSelectedItem("Pilih Judul"); 
            }
        }
        catch(Exception e) {          
        }//untuk percabangan jenis buku
    }//GEN-LAST:event_jenisActionPerformed
    
    
    Calendar c2 = Calendar.getInstance(); //variable tambahan
    Calendar cx = Calendar.getInstance(); //variable pembantu
    
    
    private void lm_pnjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lm_pnjmActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
        
        boolean valid = false;
        if(tgl_kmbl.getText().isEmpty()) {
            valid = true;
        }
            if(valid == true) {
               c2.add(Calendar.DATE,lm_pnjm.getSelectedIndex() + 1);
               tgl_kmbl.setText(sdf.format(c2.getTime()));
            }
            else {
                c2.setTime(cx.getTime());
                c2.add(Calendar.DATE,lm_pnjm.getSelectedIndex() + 1);
                tgl_kmbl.setText(sdf.format(c2.getTime()));
            }
            //sebuah method untuk menghitung lama peminjaman buku
            //dengan cara menambahkan waktu tanggal pinjam dan pilihan dari Combo box
            //kemudian hasilnya akan ditampilkan di textfield tanggal kembali
    }//GEN-LAST:event_lm_pnjmActionPerformed

    private void r_namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r_namaKeyReleased
        mc.setRgs_nama(r_nama.getText());
    }//GEN-LAST:event_r_namaKeyReleased

    public void inputdatatotable(){
            DefaultTableModel dataModel = (DefaultTableModel) table_anggota.getModel();
            List list = new ArrayList<>();
            table_anggota.setAutoCreateColumnsFromModel(true);
            
            list.add(mc.getRgs_nama());
            list.add(mc.getRgs_nim());
            list.add(mc.getJurusan());  
            list.add(mc.getRgs_kampus());
            list.add(mc.getRgs_email());
            dataModel.addRow(list.toArray());
    } //untuk memasukan data ke dalam table anggota yang berupa list
    
    public void inputpnjmtotable(){
            DefaultTableModel dataModel = (DefaultTableModel) table_pinjam.getModel();
            List list = new ArrayList<>();
            table_pinjam.setAutoCreateColumnsFromModel(true);
        
            list.add(mc.getPnjm_nama());
            list.add(mc.getPnjm_nim());
            list.add(mc.getPnjm_ktgr());  
            list.add(mc.getPnjm_jns());
            list.add(mc.getPnjm_jdl());
            list.add(mc.getPnjm_pnjm());
            list.add(mc.getPnjm_lm());
            list.add(mc.getPnjm_kmbl());
            list.add("");
            list.add("");
            list.add("Belum Kembali");
            list.add("");
            dataModel.addRow(list.toArray());
    }  //untuk memasukan data ke dalam table pinjam yang berupa list
    
    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
        mc.cekDataRgs(); //memanggil method dari mainclass.java
        if(mc.valid == true) { 
            String pesan = "Data Tidak Lengkap\nHarap Masukan Ulang";
            JOptionPane.showMessageDialog(null,pesan);
            mc.valid = false;
        }
        else {
            valid = false;
            int numrow = table_anggota.getRowCount();
            if(numrow == 0) {
                inputdatatotable();
            }
            else if(numrow != 0) { 
                for (int i = 0; i < numrow; i++) {
                    int val = Integer.parseInt(table_anggota.getValueAt(i, 1).toString()); 
                    //untuk mendapatkan value nim dari table
                    if(val == Integer.parseInt(r_nim.getText())) { 
                    //untuk membandingkan value nim dari table dengan input dari form registrasi
                        valid = true;
                    }
                }
                        if(valid == true) {
                            String pesan = "Data Sama\nHarap Masukan Ulang";
                            JOptionPane.showMessageDialog(null,pesan);
                        }
                        else {
                        inputdatatotable();
                        valid = false;
                        }
                }
                BersihRgs(); //memanggil method untuk membersihkan form
        }
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void r_nimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r_nimKeyReleased
        mc.setRgs_nim(r_nim.getText());
    }//GEN-LAST:event_r_nimKeyReleased

    private void r_kampusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r_kampusKeyReleased
        mc.setRgs_kampus(r_kampus.getText());
    }//GEN-LAST:event_r_kampusKeyReleased

    private void r_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r_emailKeyReleased
        mc.setRgs_email(r_email.getText());
    }//GEN-LAST:event_r_emailKeyReleased

    void isidatapinjaman(){
        DefaultTableModel model = (DefaultTableModel) table_anggota.getModel();
        int i = table_anggota.getSelectedRow();
        
        String nama = table_anggota.getValueAt(i,0).toString();
        String nim = table_anggota.getValueAt(i,1).toString();
               
        nm_pnjm.setText(nama);
        nim_pnjm.setText(nim);
    }
    void isidetailanggota(){
        detail_anggota da = new detail_anggota();
        DefaultTableModel model = (DefaultTableModel) table_anggota.getModel();
        int i = table_anggota.getSelectedRow();
          
        String nama = table_anggota.getValueAt(i,0).toString();
        String nim = table_anggota.getValueAt(i,1).toString();
        String jurusan = table_anggota.getValueAt(i,2).toString();
        String kampus = table_anggota.getValueAt(i,3).toString();
        String email = table_anggota.getValueAt(i,4).toString();
        
        da.setVisible(true);
        da.pack();
        da.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        da.nama1.setText(nama);
        da.nim1.setText(nim);
        da.jurusan1.setText(jurusan);
        da.kampus1.setText(kampus);
        da.email1.setText(email);
    }
    
    private void table_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_anggotaMouseClicked
        isidatapinjaman();
        isidetailanggota();
        //pemanggilan method
    }//GEN-LAST:event_table_anggotaMouseClicked

    private void cari_anggotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_anggotaKeyReleased
        DefaultTableModel model = (DefaultTableModel) table_anggota.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model);
        table_anggota.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(cari_anggota.getText()));
        //untuk mencari data dari table anggota
    }//GEN-LAST:event_cari_anggotaKeyReleased

    private void bersih_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersih_btnActionPerformed
        BersihRgs(); //memanggil method untuk membersihkan
    }//GEN-LAST:event_bersih_btnActionPerformed

    private void r_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_jurusanActionPerformed
        //untuk mendapatkan nilai dari combo boc dan mengatur jurusan yang ada di mainclass 
        if(r_jurusan.getSelectedItem().equals("Teknologi Informasi")) {
                mc.setJurusan((String) r_jurusan.getSelectedItem());
            }
            else if(r_jurusan.getSelectedItem().equals("Sistem Informasi")) {
                mc.setJurusan((String) r_jurusan.getSelectedItem());
            }
            else if(r_jurusan.getSelectedItem().equals("Manajemen")) {
                mc.setJurusan((String) r_jurusan.getSelectedItem());
            }
            else if(r_jurusan.getSelectedItem().equals("Akuntansi")) {
                mc.setJurusan((String) r_jurusan.getSelectedItem());
            }
    }//GEN-LAST:event_r_jurusanActionPerformed

    /////////////////////////////////////
    
    private void save_pnjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_pnjmActionPerformed
        mc.setPnjm_nama(nm_pnjm.getText());
        mc.setPnjm_nim(nim_pnjm.getText());
        mc.setPnjm_ktgr((String)kategori.getSelectedItem());
        mc.setPnjm_jns((String)jenis.getSelectedItem());
        mc.setPnjm_jdl((String)judul.getSelectedItem());
        mc.setPnjm_pnjm(tgl_pnjm.getText());
        mc.setPnjm_lm((String)lm_pnjm.getSelectedItem());
        mc.setPnjm_kmbl(tgl_kmbl.getText());
        //untuk memasukan data ke mainclass.java
        mc.cekDataPnjm(); //memanggil method dari mainclass.java
        if(mc.valid1 == true) {
            String pesan = "Data Tidak Lengkap\nHarap Masukan Ulang";
            JOptionPane.showMessageDialog(null,pesan);
            mc.valid1 = false;
        }
        else {
            inputpnjmtotable();
        
            nm_pnjm.setText("");
            nim_pnjm.setText("");
            kategori.setSelectedItem("Pilih Kategori");
            jenis.setSelectedItem("Pilih Jenis");
            judul.setSelectedItem("Pilih Judul");
            tgl_pnjm.setText("");
            lm_pnjm.setSelectedItem("");
            tgl_kmbl.setText("");
            //mereset kembali input yang ada di textfield
            SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
            tgl_pnjm.setText(sdf.format(c1.getTime()));
            //mengatur kembali tanggal pinjam
        }
        
    }//GEN-LAST:event_save_pnjmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BersihPnjm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cari_peminjamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_peminjamKeyReleased
        DefaultTableModel model = (DefaultTableModel) table_pinjam.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model);
        table_pinjam.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(cari_peminjam.getText()));
        //untuk mencari data dari table anggota
    }//GEN-LAST:event_cari_peminjamKeyReleased

    void isidatapengembalian(){
        DefaultTableModel model = (DefaultTableModel) table_pinjam.getModel();
        int i = table_pinjam.getSelectedRow();
        
        String nama = table_pinjam.getValueAt(i,0).toString();
        String nim = table_pinjam.getValueAt(i,1).toString();
        String kategorix = table_pinjam.getValueAt(i,2).toString();
        String jenisx = table_pinjam.getValueAt(i,3).toString();
        String judulx = table_pinjam.getValueAt(i,4).toString();
        String tgl_pnjmx = table_pinjam.getValueAt(i,5).toString();
        String lm_pnjmx = table_pinjam.getValueAt(i,6).toString();
        String tgl_kmblx = table_pinjam.getValueAt(i,7).toString();
        //untuk mendapatkan value dari table_pinjam
        
        nm_kmbl.setText(nama);
        nim_kmbl.setText(nim);
        kategori_kmbl.setText(kategorix);
        jenis_kmbl.setText(jenisx);
        judul_kmbl.setText(judulx);
        tgl_pnjm1.setText(tgl_pnjmx);
        lm_pnjm1.setText(lm_pnjmx);
        tgl_kmbl1.setText(tgl_kmblx);
        denda.setText("");
        //mengatur textfield dari data yang sebelumnya didapatkan
    }
    
    void isidetailpinjam(){
        detail_pinjam dp = new detail_pinjam();
        DefaultTableModel model = (DefaultTableModel) table_pinjam.getModel();
        int i = table_pinjam.getSelectedRow();
          
        String nama = table_pinjam.getValueAt(i,0).toString();
        String nim = table_pinjam.getValueAt(i,1).toString();
        String kategorix = table_pinjam.getValueAt(i,2).toString();
        String jenisx = table_pinjam.getValueAt(i,3).toString();
        String judulx = table_pinjam.getValueAt(i,4).toString();
        String tgl_pnjmx = table_pinjam.getValueAt(i,5).toString();
        String lm_pnjmx = table_pinjam.getValueAt(i,6).toString();
        String tgl_kmblx = table_pinjam.getValueAt(i,7).toString();
        String tgl_dkmblknx = table_pinjam.getValueAt(i, 8).toString();
        String dendax = table_pinjam.getValueAt(i, 9).toString();
        String statusx = table_pinjam.getValueAt(i, 10).toString();
        String kondisix = table_pinjam.getValueAt(i, 11).toString();
        //untuk mendapatkan value dari table_pinjam
        dp.setVisible(true);
        dp.pack();
        dp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dp.nama1.setText(nama);
        dp.nim1.setText(nim);
        dp.kategori1.setText(kategorix);
        dp.jenis1.setText(jenisx);
        dp.judul1.setText(judulx);
        dp.tgl_pnjm1.setText(tgl_pnjmx);
        dp.lm_pnjm1.setText(lm_pnjmx);
        dp.tgl_kmbl1.setText(tgl_kmblx);
        dp.status.setText(statusx);
        dp.tgl_dkmblkn.setText(tgl_dkmblknx);
        dp.dnd.setText(dendax);
        dp.kondisi.setText(kondisix);
        //mengatur textfield dari data yang sebelumnya didapatkan
    }
    private void table_pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pinjamMouseClicked
        isidetailpinjam();
        isidatapengembalian();        
    }//GEN-LAST:event_table_pinjamMouseClicked

    private void fnshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnshActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
        mk.setKmbl_nama(nm_kmbl.getText());
        mk.setKmbl_nim(nim_kmbl.getText());
        mk.setKmbl_ktgr(kategori_kmbl.getText());
        mk.setKmbl_jns(jenis_kmbl.getText());
        mk.setKmbl_jdl(judul_kmbl.getText());
        mk.setKmbl_pnjm(tgl_pnjm1.getText());
        mk.setKmbl_lm(lm_pnjm1.getText());
        mk.setKmbl_kmbl(tgl_kmbl1.getText());
        mk.setKmbl_kmblkn(tgl_kembalikan.getDate());
        mk.setKondisi((String)kondisi.getSelectedItem());
        mk.setDenda(denda.getText());
        //memasukan data ke main_kembali.java
        mk.cekDataKmbl(); //pengecekan data
        if(mk.valid == true) {
            String pesan = "Data Tidak Lengkap\nHarap Masukan Ulang";
            JOptionPane.showMessageDialog(null,pesan);
            mk.valid = false;}
        else {
        DefaultTableModel model = (DefaultTableModel) table_pinjam.getModel();
        String statuskmbl = "Kembali";
        model.setValueAt(statuskmbl, table_pinjam.getSelectedRow(), 10);
        model.setValueAt(mc.getDenda(), table_pinjam.getSelectedRow(), 9);
        String date = sdf.format(tgl_kembalikan.getDate());
        model.setValueAt(date, table_pinjam.getSelectedRow(),8);
        model.setValueAt((String)mc.getKondisi(), table_pinjam.getSelectedRow(), 11);
        int numrow = table_pinjam.getRowCount();
        int tot = 0;
        for (int i = 0; i < numrow; i++) {
            double val = Integer.parseInt(table_pinjam.getValueAt(i, 9).toString());
            tot += val ;}
        total_dnd.setText("Rp. " + Integer.toString(tot));
        //mengatur value dalam table dan menghitung jumlah total denda
        BersihPngmbln();}
    }//GEN-LAST:event_fnshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BersihPngmbln();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void paneCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneCloseMouseClicked
        int x;
        x = JOptionPane.showConfirmDialog(null,"Yakin mau Keluar ?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION);
        if (x==JOptionPane.YES_OPTION){
            dispose();
        }else{
            return;
        }
        //membuat message untuk menutup program
    }//GEN-LAST:event_paneCloseMouseClicked

    private void paneCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneCloseMouseEntered
        paneClose.setBackground(paneClosed);
    }//GEN-LAST:event_paneCloseMouseEntered

    private void paneCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneCloseMouseExited
        paneClose.setBackground(paneDefault);
    }//GEN-LAST:event_paneCloseMouseExited

    private void p_AtasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_AtasMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x , yy-y);
    }//GEN-LAST:event_p_AtasMouseDragged

    private void p_AtasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_AtasMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_AtasMousePressed
   
    
    Calendar c3 = Calendar.getInstance();
    Calendar cp = Calendar.getInstance();
    Calendar ck = Calendar.getInstance();
    //variable pendukung
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(nm_kmbl.getText().isEmpty() || kondisi.getSelectedItem() == ""){
            String pesan = "Data Tidak Lengkap\nHarap Masukan Ulang";
            JOptionPane.showMessageDialog(null,pesan);
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
            c3.setTime(tgl_kembalikan.getDate());
            int yearKmblkn = c3.get(Calendar.YEAR);
            int monthKmblkn = c3.get(Calendar.MONTH);
            int dayKmblkn = c3.get(Calendar.DAY_OF_MONTH);
            int kmblknHari = dayKmblkn;
            int kmblknBulan = monthKmblkn;
            int kmblknTahun = yearKmblkn;
            c3.set(kmblknTahun,  kmblknBulan,  kmblknHari);
            try {
                Date dateKmbl = sdf.parse(tgl_kmbl1.getText());
                ck.setTime(dateKmbl);
                int yearKmbl = ck.get(Calendar.YEAR);
                int monthKmbl = ck.get(Calendar.MONTH);
                int dayKmbl = ck.get(Calendar.DAY_OF_MONTH);
                int kmblHari = dayKmbl;
                int kmblBulan = monthKmbl;
                int kmblTahun = yearKmbl;
                ck.set(kmblTahun,  kmblBulan,  kmblHari);
                if (c3.getTime().getTime() <= ck.getTime().getTime()){//gak denda
                    denda.setText("0");
                    mc.kondisiBook();
                    mc.setKondisi((String) kondisi.getSelectedItem());
                    denda.setText(Integer.toString(mc.getKnds()));
                    mc.setDenda(mc.getKnds());
                }else{
                    System.out.println("Denda");
                    c2.setTime(dateKmbl);
                    long dndx = ((c3.getTime().getTime() - c2.getTime().getTime()) / (24 * 3600 * 1000));
                    mc.kondisiBook();
                    mc.setKondisi((String) kondisi.getSelectedItem());
                    int dnd = ((int) dndx * 2000) + mc.getKnds();
                    denda.setText(Integer.toString(dnd));
                    mc.setDenda(dnd);
                }
            } catch (ParseException e) {
                e.printStackTrace();}
        }
        //mendapatkan tanggal dikembalikan 
        //lalu akan dibandingkan apakah melebihi tanggal kembali seharusnya atau tidak
        //selanjutnya akan dikenakan denda apabaila melebihi yang dihitung /hari 
        //dan ditambah dengan denda kondisi buku
    }//GEN-LAST:event_jButton3ActionPerformed

    private void kondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kondisiActionPerformed
            if(kondisi.getSelectedItem().equals("Baik")) {
                mc.setKondisi((String) kondisi.getSelectedItem());
            }
            else if(kondisi.getSelectedItem().equals("Menengah")) {
                mc.setKondisi((String) kondisi.getSelectedItem());
            }
            else if(kondisi.getSelectedItem().equals("Rusak / Hilang")) {
                mc.setKondisi((String) kondisi.getSelectedItem());
            }
            //percabangan kondisi yang selanjutnya akan diproses di mainclass.java
    }//GEN-LAST:event_kondisiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersih_btn;
    private javax.swing.JTextField cari_anggota;
    private javax.swing.JTextField cari_peminjam;
    public javax.swing.JTextField denda;
    private javax.swing.JButton fnsh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jenis;
    public javax.swing.JTextField jenis_kmbl;
    private javax.swing.JComboBox<String> judul;
    public javax.swing.JTextField judul_kmbl;
    private javax.swing.JComboBox<String> kategori;
    public javax.swing.JTextField kategori_kmbl;
    private javax.swing.JComboBox<String> kondisi;
    public javax.swing.JLabel l_label;
    private javax.swing.JComboBox<String> lm_pnjm;
    public javax.swing.JTextField lm_pnjm1;
    public javax.swing.JTextField nim_kmbl;
    private javax.swing.JTextField nim_pnjm;
    public javax.swing.JTextField nm_kmbl;
    private javax.swing.JTextField nm_pnjm;
    private javax.swing.JPanel p_Atas;
    private javax.swing.JPanel p_Peminjaman;
    private javax.swing.JPanel p_Pengembalian;
    private javax.swing.JPanel p_Perpustakaan;
    private javax.swing.JPanel p_Perpustakaan_2;
    private javax.swing.JPanel p_Registrasi;
    private javax.swing.JPanel p_Utama;
    private javax.swing.JPanel paneClose;
    private javax.swing.JPanel paneRgs;
    private javax.swing.JLabel perpus;
    private javax.swing.JTextField r_email;
    private javax.swing.JComboBox<String> r_jurusan;
    private javax.swing.JTextField r_kampus;
    private javax.swing.JTextField r_nama;
    private javax.swing.JTextField r_nim;
    private javax.swing.JButton save_pnjm;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTable table_anggota;
    public javax.swing.JTable table_pinjam;
    private com.toedter.calendar.JDateChooser tgl_kembalikan;
    private javax.swing.JTextField tgl_kmbl;
    public javax.swing.JTextField tgl_kmbl1;
    private javax.swing.JTextField tgl_pnjm;
    public javax.swing.JTextField tgl_pnjm1;
    private javax.swing.JTextField total_dnd;
    // End of variables declaration//GEN-END:variables
}
