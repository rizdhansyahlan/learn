#IDENTITAS PROGRAM & PEMBUAT
print ("Program Menentukan Bilangan Terbesar")
print ("Nama  : Muhammad Rizdhan Syahlan")
print ("NIM   : 17220120")
print ("Kelas : 17.1A.11")
print ()
#NILAI BILANGAN
bil1 = 60
bil2 = 20
bil3 = 100
bil4 = 40
#MEMBERITAHUKAN NILAI BILANGAN
print("Bilangan 1 = "+str (bil1))
print("Bilangan 2 = "+str (bil2))
print("Bilangan 3 = "+str (bil3))
print("Bilangan 4 = "+str (bil4))
#PROSES MENENTUKAN BILANGAN TERBESAR
if (bil1 > bil2) and (bil1 > bil3) and (bil1 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 1 = " +str(bil1))
    
elif (bil2 > bil1) and (bil2 > bil3) and (bil2 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 2 = " +str(bil2))
    
elif (bil3 > bil1) and (bil3 > bil2) and (bil3 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 3 = " +str(bil3))
    
else:
    print("Bilangan Terbesar Adalah Bilangan 4 = " +str(bil4))