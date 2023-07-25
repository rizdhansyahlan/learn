#IDENTIFIKASI 
print("="*50)
print("Nama     : Muhammad Rizdhan Syahlan")
print("Kelas    : 17.1A.11")
print("Jurusan  : Tekologi Informasi")
print("="*50)
#PROGRAM TOKO MAINAN
print("TOKO MAINAN ANAK".center(50))
print("*************************".center(50))
#PROSES INPUT PEMESANAN
nama = (input("Masukkan Nama Pembeli :  "))
km = (input("Masukkan Kode Mainan : ")) 
harga = int(input("Masukkan Harga : "))
jumlah = int(input("Masukkan Jumlah Beli : "))
print("="*50)
#HASIL
print("Nama Pembeli = ",nama)
print("Kode Mainan  = ",km)
print("Harga        = ",harga)
print("Jumlah Beli  = ",jumlah)
total = harga * jumlah #PROSES PENGHITUNGAN
print("Total        = ",total)
