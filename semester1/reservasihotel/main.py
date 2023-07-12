import getpass
import pandas as pd
from pemesanan import memesan
from pemesanan import hmax, hmrx, hmix

#Untuk Menyimpan Data
hrg = []
a = []
n = []
nama = []
mmkanan = []
minuman = []
cidate = []
codate = []
cinew = []
conew = []
jk = []
jks = []
nk = []
nh = []
spasi1 = []
i = 0

#Untuk Pemesanan Kamar
def input_data():
    print(('='*40))
    print("Menu Pemesanan Kamar")
    nama.append(input("Nama                   : "))
    nhx = (input("Nomor Handphone        : +62 "))
    nh.append("+62 " + nhx)
    #Input Check In Beserta Logika 31 Hari
    x=0
    while x<1:
        cidate = (int(input("Tanggal Check-In       : ")))
        if cidate > 31 :
            print("Tanggal Tidak Boleh Lebih dari 31, Silahkan Masukan Ulang")
            continue
        else :
            cinew.append(cidate)
            #Perhitungan Otomatis Check Out
            nx = (int(input("Anda Akan Tinggal Selama (Hari) -->  ")))
            n.append(nx)
            codate = cidate + nx
            if codate > 31 :
                conw = (0 + codate - 31)
                conew.append(conw)
                print("Tanggal Check-Out      :", conw)
            else :
                conw = codate
                conew.append(codate)
                print("Tanggal Check-Out      :", conw)
        x = x + 1

    #Pemesanan Nomor Kamar
    x = 0
    while x < 1 :
        nmr_kmr = int(input("Masukan Nomor Kamar    : "))
        if nmr_kmr in nk :
            print()
            print("Nomor Sudah Dipesan, Silahkan Masukan Ulang!!")
            continue
        else :
            nk.append(nmr_kmr)
            print("Pemesanan Nomor Kamar Berhasil")
        x = x + 1
        print(('='*40))
    spasi1.append("|")
    kamar()
    
def kamar():   
    memesan().tkamar()
    x = int(input("Pilih Jenis Kamar --> "))
    if x==1:
        print("Kamar Yang Anda Pilih Adalah ")
        print("Standard Single Bed")
        jk.append("Standard Single Bed")
        jks.append("SSB")
        print()
        hrg.append(n[i]*(200_000))
        memesan().breakfast()
    elif x==2:
        print("Kamar yang Anda Pilih adalah ")
        print("Standard Twin Beds")
        jk.append("Standard Twin Beds")
        jks.append("STB")
        print()
        hrg.append(n[i]*(350_000))  
        memesan().breakfast()
    elif x==3:
        print("Kamar yang Anda Pilih adalah ")
        print("Superior Queen Bed")
        jk.append ("Superior Queen Bed")
        jks.append("SQB")
        print()
        hrg.append (n[i]*(500_000))  
        memesan().breakfast()
    elif x==4:
        print("Kamar yang Anda Pilih adalah ")
        print("Deluxe Room")
        jk.append ("Deluxe Room")
        jks.append("DR")
        print()
        hrg.append (n[i]*(1_000_000))
        print ("\nSilahkan Pilih Menu Makanan Berat Anda!")
        print('‾'*60)
        memesan().makanan_berat()                  
    else:
        print("Silahkan Pilih Salah Satu Kamar")
        print()
        kamar()

def login_admin():
    username = "admin"
    password = "admin"
    
    i = 3
    while i >= 1:
        username_1 = input("Masukkan Username : ")
        password_1 = getpass.getpass("Masukkan Password : ")
        if username_1==username and password_1==password:
            data_cust()
            break
        else:
            i -= 1
            print("Username atau kata sandi salah, harap ulang kembali",i) 
           
def data_cust():
    data = {
        "":spasi1,
        "Nama":nama,
        " ":spasi1,
        "No. Hp":nh,
        "  ":spasi1,
        "Check In":cinew,
        "   ":spasi1,
        "Check Out":conew,
        "    ":spasi1,
        "Jenis Kamar":jk,
        "     ":spasi1,
        "Nomor Kamar":nk,
        "      ":spasi1,
        }
    df = pd.DataFrame(data)
    print(df)

    
def cetak_tagihan( ):
    print()
    print ("Nama Pelanggan     : ",nama)
    data = int(input("Anda Ingin Mencetak Data Ke- "))
    d = data - 1
    print('•'*50)
    print("•", "KIREI HOTEL".center(46), "•")
    print('•'*50)
    print("DETAIL PELANGGAN".center(48))
    print("Nama Pelanggan     :", nama[d])
    print("No. Hp Pelanggan   :", nh[d])
    print("Tanggal Check-In   :", cinew[d])
    print("Tanggal Check-Out  :", conew[d])
    print("Nomor Kamar        :", nk[d])
    print("Jenis Kamar        :", jk[d])
    print("Lama Menginap      :", n[d])
    print("__________________________________________________")
    print("Tagihan Anda         1. Kamar          : ", (f'{hrg[d]:,}'))
    print("                     2. Makanan Berat  : ", (f'{hmax[d]:,}'))
    print("                     3. Makanan Ringan : ", (f'{hmrx[d]:,}'))
    print("                     4. Minuman        : ", (f'{hmix[d]:,}'))
    print("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾")
    total = hrg[d] + hmax[d] + hmrx[d] + hmix[d]
    print("Total Tagihan Anda                     : ", (f'{total:,}'))
    print('•'*50)
    bayar = input("Apakah Anda Ingin Membayar (Y/N) :  ")
    if bayar == "y":
        byr_main()
    else:
        main()

def byr_main():
    print()
    print("="*50)
    print("MENU PEMBAYARAN".center(50))
    print("="*50)
    print("Pilih Metode Pembayaran")
    print("1. Transfer Bank")
    print("2. Transfer Virtual Account")
    print("3. E-Wallet")
    print("4. Cash")
    print("0. Kembali")
    print("="*50)
    print("_"*50)
    print("Note :")
    print("Gunakan Virtual Account atau E-Wallet dan dapatkan") 
    print("DISKON 5% !!!")
    print("‾"*50)
    print()

    x = 0
    while x<1 :
        byr = int(input("Masukan Nomor Metode Pembayaran: "))
        if byr == 1:
            print("Transfer Bank")
            tf_bnk()
            main()
        elif byr == 2:
            print("Pilih Virtual Account")
            print("1. BCA Mobile")
            print("2. BRImo")
            print("3. BNI Mobile Banking")
            print("4. Livin by Mandiri")
            print("0. Kembali")
            vir_acc()
            main()
        elif byr == 3:
            print("Pilih E-Wallet")
            print("1. Dana")
            print("2. Gopay")
            print("0. Kembali")
            e_wllt()
        elif byr == 4:
            print("Cash")
            cash()
        else :
            main()
        x+=1
        main()
        

def diskon():
    print()
    print ("Nama Pelanggan     : ",nama)
    data = int(input("Anda Ingin Membayar Data Ke- "))
    d = data - 1
    print()
    tga = hrg[d] + hmax[d] + hmrx[d] + hmix[d]
    print("Tagihan Anda :",(f'{tga:,}'))
    print("Karena anda menggunakan telah Virtual Account atau E-Wallet")
    print("Anda mendapatkan Diskon 5%!!!")
    total = int(tga - (tga * 0.05))
    print("Total Tagihan Anda :",(f'{total:,}'))
    print()

def thanks():
    print("Silahkan Verifikasi ke Resepsionis ketika Check In ")
    print("Terima Kasih !!!")
    print()
    main()

def tf_bnk():
    pilih = str(input("Apakah anda ingin membayar menggunakan Transfer Bank (Y/N) : "))
    if pilih == "y" or pilih == "Y":
        print("Transfer ke - 17220062")
        thanks()
    else :
        byr_main()

def vir_acc():
    print()
    pilih = int(input("Masukan Nomor Metode Pembayaran : "))
    if pilih == 1:
        diskon()
        print("Nomor Virtual Account : 17220081")
        thanks()
    elif pilih == 2:
        diskon()
        print("Nomor Virtual Account : 17220087")
        thanks()
    elif pilih == 3:
        diskon()
        print("Nomor Virtual Account : 17220110")
        thanks()
    elif pilih == 4:
        diskon()
        print("Nomor Virtual Account : 17220120")
        thanks()
    else :
        byr_main()

def e_wllt():
    print()
    pilih = int(input("Masukan Nomor Metode Pembayaran : "))
    if pilih == 1:
        diskon()
        print("Nomor Dana  : 17220130")
        thanks()
    elif pilih == 2:
        diskon()
        print("Nomor Gopay : 17220215")
        thanks()
    else :
        byr_main()

def cash():
    pilih = str(input("Apakah anda ingin membayar Cash (Y/N) : "))
    if pilih == "y" or pilih == "Y":
        print ("Nama Pelanggan     : ",nama)
        data = int(input("Anda Ingin Membayar Data Ke- "))
        d = data - 1
        tga = hrg[d] + hmax[d] + hmrx[d] + hmix[d]
        print("Total Tagihan Anda :", (f'{tga:,}'))
        x = 0
        while x<1:
            ua = int(input("Masukan Jumlah uang anda : "))
            if ua < tga:
                print("Maaf Uang Anda Kurang, Silahkan Masukan Ulang!!!")
                continue
            else:
                uk = int(ua - tga)
                print("Uang Kembalian Anda : ", (f'{uk:,}'))
            x = x + 1
            thanks()
    else :
        byr_main()    
    main()

#Untuk Mendefinisikan Menu Utama
def main():
    while 1:
        print("\nSELAMAT DATANG DI KIREI HOTEL".center(75))
        print("\nMenu Utama")
        print("1. Pemesanan Kamar")
        print("2. Info Kamar")
        print("3. Tampilkan Total Tagihan")
        print("4. Data Pelanggan")
        print("5. Keluar")

        b = int(input("\nMasukkan Nomor : "))
        if(b==1):
            input_data()

        elif(b==2):
            memesan().Info_Kamar()

        elif(b==3):
            cetak_tagihan()

        elif(b==4):
            login_admin()

        elif(b==5):
            print("Terima Kasih Sudah Berkunjung Di Hotel Kami")
            exit()
        else:
            print("Nomor Yang Anda Masukkan Salah, Harap Masukkan Kembali")

            main()
main()
