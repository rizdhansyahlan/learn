gp = int(input("Masukkan Gaji Pokok Anda : "))
jk = int(input("Masukkan Total Jam Kerja : "))
tjg = 0.2 * gp
print("Tunjangan Anda Sebesar : ",tjg)
if jk > 200:
    lm = (jk - 200) * 20000
    print("Total Gaji Lembur Anda : ",lm)
    gaji = (gp + tjg + lm)
    pajak = gaji * 0.1
    print("Gaji Anda Sebesar : ",gaji)
    print("Pajak Anda Sebesar : ",pajak)
    total = gaji - pajak
    print("Total Gaji Anda Adalah : ",total)
else:
    gaji = (gp + tjg)
    pajak = gaji * 0.1
    print("Gaji Anda Sebesar : ",gaji)
    print("Pajak Anda Sebesar : ",pajak)
    total = gaji - pajak
    print("Total Gaji Anda Adalah : ",total)