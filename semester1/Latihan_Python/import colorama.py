import colorama
from colorama import Fore, Back, Style
colorama.init(autoreset=True)
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
nama = (input("Masukkan Nama Pembeli :  " + Fore.GREEN))
km = (input(Fore.RESET + "Masukkan Kode Mainan : " +Fore.GREEN)) 
harga = int(input(Fore.RESET + "Masukkan Harga : "+Fore.GREEN))
jumlah = int(input(Fore.RESET + "Masukkan Jumlah Beli : "+Fore.GREEN))
print(Fore.RESET +"="*50)
#HASIL
print("Nama Pembeli = ",nama)
print("Kode Mainan  = ",km)
print("Harga        = ",harga)
print("Jumlah Beli  = ",jumlah)
total = harga * jumlah #PROSES PENGHITUNGAN
print("Total        = ",total)
