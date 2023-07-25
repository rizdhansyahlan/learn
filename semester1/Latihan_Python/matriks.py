print("Nama Kelompok :")
print("Muhammad Rizdhan Syahlan  : 17220120")
print("Sayid Hafiizh Nur Fauzi   : 17220678")
print("Fiandanu Zidan            : 17220380")
print("Ana Roina Rohimah Sulafah : 17220641\n")
print("Kelas                     : 17.1A.11\n")
print("-"*40)
print("Program Penjumlahan Matriks Ordo 3x3")
print("-"*40)
print()
def cetak_matriks(matriks):
    for row in matriks:
        print(row)
def jumlahkan_matriks(mat_a, mat_b):
    temp_row = []
    temp_mat = []
    for i in range (0, len(mat_a)):
        for j in range (0, len(mat_a[0])):
            temp_row.append(mat_a[i][j] + mat_b[i][j])
        temp_mat.append(temp_row)
        temp_row = []
    return temp_mat
matriks_a = [
    [1,2,3],
    [4,5,6],
    [7,6,5]
]
matriks_b = [
    [2,3,4],
    [3,1,1],
    [1,2,1]
]    
print("Matriks A : ")
cetak_matriks(matriks_a)
print("Matriks B : ")
cetak_matriks(matriks_b)
print("Jumlah Matriks : ")
hasil = jumlahkan_matriks(matriks_a, matriks_b)
cetak_matriks(hasil)