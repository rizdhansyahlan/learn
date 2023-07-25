def SelectionSort(val):
    for i in range(len(val)-1,0,-1):
        Max=0
        for l in range(1,i+1):
            if val[l]>val[Max]:
                Max = l
        temp = val[i]
        val[i] = val[Max]
        val[Max] = temp
Angka = [22,10,15,3,8,2]
SelectionSort(Angka)
print(Angka)
