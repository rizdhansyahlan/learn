a = int(input("Masukkan Bilangan : "))
s = a - 1 # for spaces
for i in range(0, a):
    for j in range(0, s):
        print(' ', end='')
    s -= 1
    for j in range(0, i + 1):
        print('* ', end='')
 
    print('')