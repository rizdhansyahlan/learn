print("TUGAS KELOMPOK PERTEMUAN KEDUA")
print("-"*50)

#Jumlah Uang Ibu
uang = int(input("Masukkan Uang Ibu : Rp. "))
print ("Jumlah Uang Ibu : Rp. ",uang)
print("-"*50)

#Jumlah Berat Telur
brt = int(input("Masukkan Berat Telur Yang Ingin Anda Beli (Kg) : "))
hrg = 26000
total = (hrg * brt)
print("Harga Telur Per Kg : Rp26.000")
print("Ibu Membeli Telur Sebanyak" ,brt, "Kg")
print ("Jumlah Harga Telur Yang DIbeli Ibu: ",total)
print("-"*50)

#Total Perjalanan
prjlnn = int(input("Berapa Kali Ibu Melakukan Perjalanan : "))
ongkos = 3500
trnsprt = (prjlnn * ongkos*2)
print("Jumlah Ongkos Yang Dikeluarkan Ibu Adalah: ",trnsprt)
print("-"*50)

#Operasi Penjumlahan Total Uang Ibu Yang Habis
habis = (total + trnsprt)

#Operasi Total Sisa Uang Ibu
sisa = (uang - habis)
print("Sisa Uang Ibu Adalah = " ,sisa)
print("-"*50)