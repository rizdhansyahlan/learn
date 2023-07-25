#input Awal Pembuka
def pertama():
    print('Selamat Datang di Statiun Kelompok 3'):
    print('Promo Special Kelas Bisnis dan VIP lebih hemat 20%\n'):
    print("Promo Beli 3 tiket Diskon 10%"):
    
    #input welcome
def selamat() :
        welcome=input('Apakah anda ingin melakukan pemesanan tiket kereta (y/n): ')
        if welcome== 'y':
            print('Selamat Datang di Menu Tiket Kereta')
        elif welcome== 'n':
            quit('Selamat Tinggal')
        else:
            print('Input Salah')
    selamat()

#input data
    nama    = input('Masukan Nama Anda : ')
    hp      =int(input('Masukan Nomor Telepon Anda :'))
    gmail   = input('Masukan Gmail Anda : \n')

#proses Jurusan
    jurusan =int(input('Jurusan [1 (Jakarta-Surabaya)/ 2 (Jakarta-Yogjakarta)/ 3 (Jakarta-Malang)] : '))
    if jurusan==1:
        namajurusan="Jakarta-Surabaya"
        harga=300000
    elif jurusan==2:
        namajurusan="Jakarata-Yogjakara"
        harga=225000
    elif jurusan==3:
        namajurusan="Jakarta-Malang"
    else :
        print('Input Salah')
    

#input Beli Jurusan Kelas
    kelas   =int(input('[1.VIP/2.Bisnis/3.Ekonomi] : '))
    if kelas== 1:
        kelaskereta ="VIP"
        hargakelas  =100000 * 0.2
    elif kelas== 2:
        kelaskereta ='Bisnis'
        hargakelas  =50000 * 0.2
    elif kelas== 3:
        kelaskereta ='Ekonomi'
        hargakelas  =25000
    else :
        print('Input Salah')

#input Jumlah Beli
    jumlah  =int(input('Masukkan Jumlah Beli : '))
#proses total seluruh
    if jumlah>=3 :
        potongan=(jumlah * harga + hargakelas)*0.1
    else:
        potongan=0

    total=(jumlah * harga + hargakelas)-potongan

#cetak hasil
    print('-------------------------------------------------------')
    print('                 Penjualan Tiket Kereta')
    print('                        Kelompok 3')
    print('-------------------------------------------------------')
    print('Nama Pembeli         : ', str (nama))
    print('No.Handphone         : ', str (hp))
    print('Alamat Gmail         : ', str (gmail))
    print('Nama Kota & Tujuan   : ', str (namajurusan))
    print('Harga                : ', +(harga))
    print('Jumlah Tiket di Beli : ', +(jumlah))
    print('-------------------------------------------------------')
    print('Potongan yang di dapat   : ', int (potongan))
    print('Total yang di Bayar      : ', int (total))
    print('*******************\n')

    ubay=int(input('Masukan Uang Bayar  : '))
    if ubay >= total :
        hasil= total - ubay
        print=('Uang Kembalian Anda : ', + (hasil))
    elif ubay < total:
        print('Uang Tidak Mencukupi')
    else :
        print('Terjadi Kesalahan')

#input keluar/kembali
    def last():
        lagi= (input('Apakah Anda Ingin Kembali ke Menu (y/n)'))
        if lagi== 'y':
            pertama()
        elif lagi== 'n':
            print('Terima Kasih')
            quit()
        last()
pertama()