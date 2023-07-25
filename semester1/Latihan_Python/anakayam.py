a=0
while a >=0:
    a = int(input("Masukkan Jumlah Anak Ayam [1 - 100] : "))
    if a<1 or a>100:
        print("Jumlah yang anda masukkan tidak sesuai ketentuan. Silahkan input ulang")
        continue
    else:
        print("Tek kotek kotek kotek, anak ayam turun berkotek")
        while a>1:
            print("anak ayam turunlah %d mati satu tinggallah %d"%(a,a-1))
            a-=1
        if a==1:
            print("anak ayam turunlah %d mati satu tinggallah induknya"%(a))
            break