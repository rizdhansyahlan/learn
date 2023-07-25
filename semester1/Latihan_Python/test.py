#Perkenalan
print("="*50)
print("Nama     : Muhammad Rizdhan Syahlan")
print("Kelas    : 17.1A.11")
print("Jurusan  : Tekologi Informasi")
print("="*50)

#Operasi Penjumlahan Sederhana
bil1 = 45
bil2 = 55
jumlah = bil1 + bil2

print(jumlah)
print()

#Operasi If Else Sederhana
nilai = int(input("Masukkan Nilai Anda : "))
print()
if nilai <= 5 :
    print("Nilai Jelek")
    print("Tidak lulus")
else:
    print("Nilai Bagus")
    print("Lulus")
print()

#Tanda Kutip Pada Python
kata = 'Kuliah'
kalimat = "BSI Aja!"
paragraf = """Kuliah...?
BSI Aja!!"""

print(kata)
print(kalimat)
print(paragraf)
print()

#Contoh Input Sederhana
print("-+-+-+-+-+-+-+-+-+-+-+-+ Data Diri Mahasiswa +-+-+-+-+-+-+-+-+-+-+-+-")
nama = input("Nama : ")
nim = input("NIM : ")
jurusan = input("Jurusan : ")
alamat = input("Alamat : ")
print("-"*50)
print("Hasil cetak data diatas adalah")
print("Nama : " +str(nama))
print("NIM : " +str(nim))
print("Jurusan : " +str(jurusan))
print("Alamat : " +str(alamat))

#Akses Nilai String
var1 = 'Hello Python'
var2 = "I Love Python"
print("var1[0]", var1[0])
print("var2[2:5]", var2[2:6])
#Mengupdate String
var3 = var1[:6]
print(var1)
#Menggabungkan String
var1 = 'Hello Python'
var2 = "I Love Python"
print("Var1 + Var2", var1 + var2)