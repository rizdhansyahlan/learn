#input bilangan
bilangan = int(input("Masukkan Bilangan : "))
#bilangan prima harus lebih besar dari 1
if bilangan > 1:
    for i in range(2,bilangan):
        if (bilangan % i) == 0:
            print(bilangan, "bukan bilangan prima")
            print(i, "kali", bilangan//i, "=", bilangan)
            break
    else:
        print(bilangan,"adalah bilangan prima")
#bila bilangan kurang atau sama dengan satu
else:
    print(bilangan, "bukan bilangan prima")