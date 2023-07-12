from clearConsole import clearConsole

stack = []

# PUSH
def addStack(stack, value):
        if(value != ""):
            stack.append(value)
            print("Element ", value, " Telah ditambahkan")
        else:
            print('Element yang anda inputkan salah!')

# POP
def RemoveStack(stack):
        index = int(len(stack) - 1)
        print(
            f"Menghapus Element teratas pada stack [index : {index}, Element : {stack[index]}]")
        stack.pop(index)

# EMPTY
def EmptyStack(stack):
    if(len(stack) != 0):
        print("Stack telah di kosongkan...")
        return stack.clear()
    

# TOP
def atasStack(stack):
    top = (len(stack) - 1 )
    if top < 0:
        print("Tidak Ada Element")
    else:
        print(
            f"Top Pada Stack adalah [index : {top}, Element : {stack[top]}]")

# Lihat Isi
def showData(stack):
    clearConsole()
    if(len(stack) != 0):
        print("Mencetak stack")

        print("Element\t", end="|")
        for data in stack:
            print(data, end='|')
        print('')

        print("Index\t", end="|")
        for index, data in enumerate(stack):
            print(index, end='|')
        print('')

        print ("Jumlah Element / NOEL : ", (len(stack)))

    else:
        print("Stack kosong")
        print("Tidak dapat menampilkan stack\n")

# MENU Program Stack

def menu():
    clearConsole()
    print("=========================")
    print("| Stack Creation Menu |")
    print("=========================")
    print("1. PUSH")
    print("2. TOP")
    print("3. POP")
    print("4. EMPTY")
    print("5. SHOW")
    print("6. EXIT")
    print("=========================")



def main():
    konfirmasi = True
    while konfirmasi == True:
        menu()
        pilih_menu = int(input("Pilih Menu : "))

        if (pilih_menu == 1):
            loop = 'y'
            while loop == 'y':
                showData(stack)
                value = input("Masukkan Element : ")
                addStack(stack, value)
                loop = input('Input Lagi [y/n] ? ')
        elif (pilih_menu == 2):
            showData(stack)
            atasStack(stack)
        elif (pilih_menu == 3):
            showData(stack)
            RemoveStack(stack)
        elif (pilih_menu == 4):
            showData(stack)
            EmptyStack(stack)
        elif (pilih_menu == 5):
            showData(stack)
        elif (pilih_menu == 6):
            print('Terima kasih telah menggunakan Stack Creation Menu!')
            break
        else:
            print("Kode menu yang anda masukkan salah, coba lagi...")

        input('Tekan ENTER untuk lanjut...')

main()
