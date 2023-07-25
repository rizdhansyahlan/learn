#Menu Awal
print("\n\tGEROBAK FRIED CHICKEN".center(50))
print('-'*40)
print("Kode     Jenis Potong     Harga".center(40))
print('-'*40)
print('D          Dada           2500'.center(40))
print('P          Paha           2000'.center(40))
print('S          Sayap          1500'.center(40))
print('-'*40)

banyak_jenis = int(input("Banyak Jenis : "))

#Var Data
jp = []
kp = []
bp = []
hrg = []
jmlh = []

i = 0
while i < banyak_jenis:
    print("Jenis Ke - ", i+1)
    kp.append(input("Kode Potong [D/P/S] : "))
    bp.append(int(input("Banyak Potong : ")))
    if kp[i] == "D" or kp[i] == "d":
        jp.append("Dada")
        hrg.append("2500")
        jmlh.append(bp[i] * int("2500"))
    elif kp[i] == "P" or kp[i] == "p":
        jp.append("Paha")
        hrg.append("2000")
        jmlh.append(bp[i] * int("2000"))
    elif kp[i] == "S" or kp[i] == "s":
        jp.append("Sayap")
        hrg.append("1500")
        jmlh.append(bp[i] * int("1500"))
    else:
        jp.append('Kode Salah')
        hrg.append('0')
        jmlh.append(bp[i] * int('0'))
    i = i + 1
        
print("GEROBAK FRIED CHICKEN".center(50))
print('-'*60)
print('No         Jenis          Harga          Banyak     Jumlah')
print('           Potong         Satuan         Potong     Harga')
print('-'*60)

jumlah_bayar = 0
a = 0
while a < banyak_jenis:
    jumlah_bayar += jmlh[a]
    print('%i      %s      %s        %i        %i'%(a+1, jp[a], hrg[a], bp[a], jmlh[a]))
    a = a + 1
        
print('-'*60)
pajak = jumlah_bayar * 0.1
total_bayar = jumlah_bayar + pajak
print('\t\t\tJumlah Bayar     Rp.',jumlah_bayar)
print('\t\t\tPajak 10%        Rp.',pajak)
print('__+'.rjust(52))
print('\t\t\tTotal Bayar      Rp.', total_bayar)       