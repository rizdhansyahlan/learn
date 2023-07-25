print ("Nama : Muhammad Rizdhan Syahlan")
print ("NIM : 17220120")
print ("Kelas : 17.1A.11")
print (52*"-")
#Judul_Buku
buku = {
    1: "Malin Kundang",
    2: "Pulang",
    3: "Spiritted Away",
    4: "Naruto",
    5: "Doraemon"
}
isi_buku = {
    1:"Malin Kundang\n"
'Alkisah, di pesisir pantai daerah Sumatera Barat, hiduplah seorang ibu bersama anak kesayangannya yang bernama Malin.\n' 
"Sejak suaminya meninggal, Ibu Malin harus berjuang mati-matian untuk menghidupi Malin.\n" 
"Meskipun begitu, ia tetap merasa bahagia karena Malin merupakan anak yang penyayang.\n" 
"Dia juga sangat manja. Malin akan selalu menemani ibunya bekerja menjual ikan.\n"
"Semakin hari, Malin semakin beranjak dewasa. Ia merasa sudah saatnya untuk menggantikan ibunya bekerja.\n"
"Namun, Malin memiliki keinginan lain ketika melihat banyak teman sebayanya bisa kaya raya dalam waktu cepat setelah berjualan di kota.\n"
    ,
    2:"Pulang\n" 
"Semua berawal ketika Bujang si tokoh utama berada di sebuah hutan bersama para pemburu bernama Teuke Muda.\n"
"Suatu ketika Bujang dewasa tinggal bersama Teuke Muda untuk membiayai semua kebutuhan pendidikan si Bujang. Akhirnya Bujang menjadi seorang pekerja professional.\n"
"Seorang bodyguard bagi Teuke Muda. Hingga dewasa pun Bujang masih mendapatkan julukan Si Babi Hutan, karena hobinya berkelahi.\n"
"Bujang pergi ke Hongkong untuk menghadiri sebuah acara penting bersama keluarga Master Dragon.\n"
"Lalu Bujang yang dilibatkan dalam misi memberantas judi kasino, dan mengambil pemindai atau sandi penting dalam keluarga Master Dragon.\n"
"Lambat laun Bujang pindah ke Ibu Kota untuk menjalankan misi selanjutnya dari Teuke Muda.\n"
    ,
    3:"Spirited away\n"
    "Chihiro dan keduaorang tuanya pindah rumah ke sebuah kota.\n"
"Tetapi saat mencari alamat rumah baru mereka, mereka salah jalur sehingga memasuki terowongan.\n"
"dimana terowongan tersebut merupakan pintu masuk ke sebuah dunia roh yang penuh dengan makhluk-makhuk fantasi.\n"
"Di tempat itu mereka menemukan restoran yang penuh dengan makanan enak.\n"
"Orangtua Chihiro memakan makanan itu tanpa berpikir apa yang terjadi jika mereka memakannya walaupun Chihiro telah melarang.\n"
    "Setelah memakan makanan tersebut mereka berubah menjadi babi.\n"
    ,
    4:"Naruto\n"
"Anime ini menceritakan tentang seorang anak  bernama Uzumaki Naruto yang tinggal di sebuah Negara Api-Desa Konoha.\n"
"Naruto tumbuh dan dibesarkan oleh Sarutobi Hiruzen yang merupakan Hokage Ketiga.\n"
"Naruto kecil tumbuh tidak seperti kebanyakan anak lainnya, karena dia tumbuh tanpa kasih sayang orang tuanya.\n"
"Oleh sebab itu Naruto selalu membuat kenakalan dimana - mana seperti mencoret patung kepala Hokage(Sebutan untuk Kepala Desa.\n"
"Sejak kecil Naruto selalu dijauhi oleh masyarakat sekitar, karena didalam tubuh Naruto tersegel sebuah makhluk yang sangat menyeramkan yaitu Kyubi.\n"
"Orang - orang sekitar menyebut Kyubi itu dengan nama Rubah berekor sembilan.\n"
    ,
    5:"Doraemon\n"
    "Doraemon adalah Sebuah robot berbentuk kucing dari masa depan.\n"
"Doraemon dikirim kembali ke masa kehidupan Nobita oleh cicit Nobita, Sewashi.\n"
"Ia dikirim untuk memperbaiki kehidupan Nobita agar keturunannya merasakan kehidupan yang lebih baik.\n"
"Dalam kehidupan aslinya tanpa dibantu Doraemon, Nobita sering gagal dalam pelajaran sekolahnya, gagal dalam pekerjaan, dan mempunyai masalah keuangan.\n"
"Cerita berfokus tentang kehidupan sehari-hari Nobita yang merupakan tokoh utama dalam cerita ini.\n"
    }
#Fungsi_Utama
def Perpustakaan():
    menu = "y"
    while menu == "y" or menu == "Y":
        print("""
        ----------------------------------
           Perpustakaan Rizdhan Syahlan
        ----------------------------------
        Daftar Harga Peminjaman Buku
        No       Buku           Harga
        [1]    Malin kundang    1500
        [2]    Pulang           7500
        [3]    Spiritted Away   2000
        [4]    Naruto           5000
        [5]    Doraemon         5000
        """)
        print("""
        --------------------------------
                      MENU
        --------------------------------
        [1] Baca sinopsi buku
        [2] Pinjam Buku 
        [3] Kembalikan 
        """)
#Pemilihan_Menu
        menu1 = (input("Masukkan nomor menu yang ingin anda pilih : "))
		# Menu 1 Baca sinopsis buku
        if menu1 == "1":
            s_buku = (input("Masukkan nomor urut buku yang ingin anda baca: "))
            if s_buku == "1":
                print(isi_buku[1])
            elif s_buku == "2":
                print(isi_buku[2])
            elif s_buku == "3":
                print(isi_buku[3])
            elif s_buku == "4":
                print(isi_buku[4])
            elif s_buku == "5":
                print(isi_buku[5])
            else:
                print("Harap masukkan nomor urut buku yang benar...")
                print("Silahkan kembali ke menu awal...")
		# Menu 2 Peminjaman buku
        elif menu1 == "2":
            nama = (input("Masukkan Nama anda :"))
            k_anggota = (input("Masukkan nomor kartu Keangotan anda: "))
            pinjam_buku = input("Masukkan nomor urut buku yang ingin dipinjam : ")
            if pinjam_buku == 1 or pinjam_buku == "1":
                konfirmasi = int(input("Berapa lama anda ingin meminjam buku ini?[per minggu]: "))
                harga_P= 1500
                total = (harga_P * konfirmasi)
                print(52*"-")
                print("	KONFIRMASI PEMINJAMAN	")
                print(52*"-")
                print("Konfirmasi nama peminjam \t: ",nama)
                print("Konfirmasi Kartu keangotaan \t: ",k_anggota)
                print("Judul buku yang dipinjam \t: ",buku[1])
                print("Dengan Harga [/minggu] \t\t: Rp.",harga_P)
                print("Peminjaman Selama \t\t: ",konfirmasi,"Minggu")
                print("Maka total yang harus ada bayar : Rp.",total)
                print(52*"-")
                bayar = int(input("Masukkan Uang anda \t\t: RP. "))
                if bayar < total:
                    print("Mohon maaf Uang anda tidak mencukupi..")
                    print("Silahkan kembali ke menu awal...")
                else:
                    total_bayar = (bayar - total)
                    print("		\t\t---------------+ ")
                    print("Kembalian: Rp. 	", total_bayar)
                    print("Buku",buku[1], "berhasil dipinjam")
            elif pinjam_buku == 2 or pinjam_buku == "2":
                konfirmasi = int(input("Berapa lama anda ingin meminjam buku ini?[per minggu]: "))
                harga_P= 7500
                total = (harga_P * konfirmasi)
                print(52*"-")
                print("	KONFIRMASI PEMINJAMAN	")
                print(52*"-")
                print("Konfirmasi nama peminjam \t: ",nama)
                print("Konfirmasi Kartu keangotaan \t: ",k_anggota)
                print("Judul buku yang dipinjam \t: ",buku[2])
                print("Dengan Harga [/minggu] \t\t: Rp.",harga_P)
                print("Peminjaman Selama \t\t: ",konfirmasi,"Minggu")
                print("Maka total yang harus ada bayar : Rp.",total)
                print(52*"-")
                bayar = int(input("Masukkan Uang anda \t\t: RP. "))
                if bayar < total:
                    print("Mohon maaf Uang anda tidak mencukupi..")
                    print("Silahkan kembali ke menu awal...")
                else:
                    total_bayar = (bayar - total)
                    print("		\t\t---------------+ ")
                    print("Kembalian: Rp. 	", total_bayar)
                    print("Buku",buku[2], "berhasil dipinjam")
            elif pinjam_buku == 3 or pinjam_buku == "3":
                konfirmasi = int(input("Berapa lama anda ingin meminjam buku ini?[per minggu]: "))
                harga_P= 2000
                total = (harga_P * konfirmasi)
                print(52*"-")
                print("	KONFIRMASI PEMINJAMAN	")
                print(52*"-")
                print("Konfirmasi nama peminjam \t: ",nama)
                print("Konfirmasi Kartu keangotaan \t: ",k_anggota)
                print("Judul buku yang dipinjam \t: ",buku[3])
                print("Dengan Harga [/minggu] \t\t: Rp.",harga_P)
                print("Peminjaman Selama \t\t: ",konfirmasi,"Minggu")
                print("Maka total yang harus ada bayar : Rp.",total)
                print(52*"-")
                bayar = int(input("Masukkan Uang anda \t\t: RP. "))
                if bayar < total:
                    print("Mohon maaf Uang anda tidak mencukupi..")
                    print("Silahkan kembali ke menu awal...")
                else:
                    total_bayar = (bayar - total)
                    print("		\t\t---------------+ ")
                    print("Kembalian: Rp. 	", total_bayar)
                    print("Buku",buku[3], "berhasil dipinjam")
            elif pinjam_buku == 4 or pinjam_buku == "4":
                konfirmasi = int(input("Berapa lama anda ingin meminjam buku ini?[per minggu]: "))
                harga_P= 5000
                total = (harga_P * konfirmasi)
                print(52*"-")
                print("	KONFIRMASI PEMINJAMAN	")
                print(52*"-")
                print("Konfirmasi nama peminjam \t: ",nama)
                print("Konfirmasi Kartu keangotaan \t: ",k_anggota)
                print("Judul buku yang dipinjam \t: ",buku[4])
                print("Dengan Harga [/minggu] \t\t: Rp.",harga_P)
                print("Peminjaman Selama \t\t: ",konfirmasi,"Minggu")
                print("Maka total yang harus ada bayar : Rp.",total)
                print(52*"-")
                bayar = int(input("Masukkan Uang anda \t\t: RP. "))
                if bayar < total:
                    print("Mohon maaf Uang anda tidak mencukupi..")
                    print("Silahkan kembali ke menu awal...")
                else:
                    total_bayar = (bayar - total)
                    print("		\t\t---------------+ ")
                    print("Kembalian: Rp. 	", total_bayar)
                    print("Buku",buku[4], "berhasil dipinjam")
            elif pinjam_buku == 5 or pinjam_buku == "5":
                konfirmasi = int(input("Berapa lama anda ingin meminjam buku ini?[per minggu]: "))
                harga_P= 5000
                total = (harga_P * konfirmasi)
                print(52*"-")
                print("	KONFIRMASI PEMINJAMAN	")
                print(52*"-")
                print("Konfirmasi nama peminjam \t: ",nama)
                print("Konfirmasi Kartu keangotaan \t: ",k_anggota)
                print("Judul buku yang dipinjam \t: ",buku[5])
                print("Dengan Harga [/minggu] \t\t: Rp.",harga_P)
                print("Peminjaman Selama \t\t: ",konfirmasi,"Minggu")
                print("Maka total yang harus ada bayar : Rp.",total)
                print(52*"-")
                bayar = int(input("Masukkan Uang anda \t\t: RP. "))
                if bayar < total:
                    print("Mohon maaf Uang anda tidak mencukupi..")
                    print("Silahkan kembali ke menu awal...")
				else:
                    total_bayar = (bayar - total)
                    print("		\t\t---------------+ ")
                    print("Kembalian: Rp. 	", total_bayar)
                    print("Buku",buku[5], "berhasil dipinjam")
            else:
                print("Harap masukkan nomor urut buku yang benar...")
                print("Silahkan kembali ke menu awal...")
        elif menu1 == 3 or menu1 == "3":
            k_buku = input("Masukkan nomor urut buku yang ingin anda kembalikan: ")
            if k_buku == 1 or k_buku == "1":
                print("Buku",buku[1], "berhasil dikembalikan")
            elif k_buku == 2 or k_buku == "2":
                print("Buku",buku[2], "berhasil dikembalikan")
            elif k_buku == 3 or k_buku 	== "3":
                print("Buku",buku[3], "berhasil dikembalikan")
            elif k_buku == 4 or k_buku == "4":
                print("Buku",buku[4], "berhasil dikembalikan")
            elif k_buku == 5 or k_buku == "5":
                print("Buku",buku[5], "berhasil dikembalikan")
            else:
                print("Harap masukkan nomor urut buku yang benar..")
                print("Silahkan Kembali ke menu awal...")
        else:
            print("Harap masukkan nomor urut menu yang benar..")
            print("Silahkan kembali ke menu awal...")
		# Konfirmasi Menu awal
		menu = input("Ingin kembali ke menu awal?[y/n]: ")