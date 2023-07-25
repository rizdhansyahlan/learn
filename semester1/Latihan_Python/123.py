gp = 5000000
jual = int(input("Jumlah Barang Yang Dijual : "))
hsp = int(input("Harga Satuan Produk : "))
omset = hsp * jual
print("Omset Anda Adalah : ",omset)
if jual > 100:
    bonus = omset * 0.2
    total = gp + bonus
    print("Bonus Anda Sebesar : ",bonus)
    print("Anda Mendapatkan Gaji Sebesar : ",total)
else:
    bonus = omset * 0.1
    total = gp + bonus
    print("Bonus Anda Sebesar : ",bonus)
    print("Anda Mendapatkan Gaji Sebesar : ",total)