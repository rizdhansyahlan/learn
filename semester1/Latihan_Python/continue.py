#penggunaan continue pada while
bil = 0
pilihan = 'y'
while (pilihan == 'y'):
    bil = int(input("Masukkan bilangan dibawah 50: "))
    if (bil > 50):
        print("Bilangan melebihi angka 50, Silahkan diulangi.")
        continue
    print("Pangkat dua dari bilangan ini adalah: ",bil*bil)
    pilihan = input("Apakah Anda ingin mengulang kembali (y/n)? ")