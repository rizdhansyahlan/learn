#IDENTITAS PROGRAM & PEMBUAT
print ("Program Menentukan Jumlah Kelereng")
print ("Nama  : Muhammad Rizdhan Syahlan")
print ("NIM   : 17220120")
print ("Kelas : 17.1A.11")
print ()
#INPUT JUMLAH KELERENG ALDI
KelerengAldi = int(input("Masukkan Kelereng Aldi = "))
print()
#PROSES PENGHITUNGAN JUMLAH KELERENG BUDI, ANTO DAN AGUNG
KelerengBudi = KelerengAldi - 15
KelerengAnto = 2 * (KelerengAldi + KelerengBudi)
KelerengAgung = (KelerengAldi + KelerengBudi + KelerengAnto) - 5
#Jumlah Masing-Masing Kelereng
print("Jumlah Kelereng Aldi = ",KelerengAldi)
print("Jumlah Kelereng Budi = ",KelerengBudi)
print("Jumlah Kelereng Anto = ",KelerengAnto)
print("Jumlah Kelereng Agung = ",KelerengAgung)
#Jumlah Kelereng Budi, Anto dan Agung
jumlah = (KelerengBudi + KelerengAnto + KelerengAgung)
print("Jumlah Kelereng Budi, Anto dan Agung = ",jumlah)