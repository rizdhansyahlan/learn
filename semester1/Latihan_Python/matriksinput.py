def cetakmatriks(matriks):
    for row in matriks:
        print(row)
def pjgmatriks(matriks):
    return len(matriks[0])
def lbrmatriks(matriks):
    return len(matriks[0])
def jumlahmatriks(matA,matB):
    temp_row=[]
    temp_mat=[]
    for i in range(0,len(matA)):
        for j in range(0,len(matA[0])):
            temp_row.append(matA[i][j]+matB[i][j])
        temp_mat.append(temp_row)
        temp_row=[]
    return temp_mat

matA=[]
matB=[]
temp_row=[]
n=int(input('Masukkan Jumlah Ordo : '))
print('\nMatriks A')
for i in range(n):
    for j in range(n):
        print('Masukkan elemen [',(i+j),',',(j+i),']',)
        a=input(': ')
        temp_row.append(a)
    matA.append(temp_row)
    temp_row=[]
print('\nMatriks B')
for i in range(n):
    for j in range(n):
        print('Masukkan elemen [',(i+j),',',(j+i),']',)
        a=input(': ')
        temp_row.append(a)
    matB.append(temp_row)
    temp_row=[]
   
print('\nMatriksA :')
cetakmatriks(matA)
print('\nmatriksB:')
cetakmatriks(matB)
print('\nhasil punjumlahan :')
hasil=jumlahmatriks(matA,matA)
cetakmatriks(hasil)