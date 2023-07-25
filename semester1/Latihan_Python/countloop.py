from itertools import count


jumlah = int(input("Masukkan Jumlah : "))
count = 0
while (count < jumlah):
    print("The count is : ",count)
    count = count + 1
print('Good Bye!')

angka = int(input("Masukkan Angka : "))
count = 0
while (count < angka):
    print(count, "kurang dari", angka)
    count = count + 1
else:
    print(count, "tidak kurang dari",angka)