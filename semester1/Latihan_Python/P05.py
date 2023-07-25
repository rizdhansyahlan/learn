#
n = int(input("Masukkan Angka : "))
for i in range(0, n):
    for x in range(0, i + 1):
        print('*',end='')
    print('')