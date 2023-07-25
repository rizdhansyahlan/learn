#OPERATOR PENUGASAN
print("OPERATOR PENUGASAN")
a = int(input("Masukkan Nilai A : "))
    # =
a = 4
print("a = 4 : ",a)
    # +=
a += 6
print("a += 6 : ",a)
    # -=
a -= 4
print("a -= 4 : ",a)
    # *=
a *= 7
print("a *= 7 : ",a)
    # /=
a /= 6
print("a /= 6 : ",a)
    # **=
a **= 2
print("a **= 2 : ",a)
    # //=
a //= 4
print("a //= 4 : ",a)
    # %=
a %= 8
print("a %= 8 : ",a)
print()

#OPERATOR LOGIKA
print("OPERATOR LOGIKA")
x = True
y = False
print("x = ",x)
print("y = ",y)
print()
    #LOGIKA AND
z = x and y
print("True and False = ",z)
    #LOGIKA OR
z = x or y
print("True or False = ",z)
    #Logika Not
z = not x
print("not True = ",z)
print()

#OPERATOR BITWISE
print("OPERATOR BITWISE")

a = int(input("Masukkan Nilai a : "))
b = int(input("Masukkan Nilai b : "))
print('a = ',a, '=', format(a, '08b'))
print('b = ',b, '=', format(b, '08b'))
print()
    #AND
print('[and]')
print('a & b = ', a & b)
print(format(a, '08b'), '&', format(b, '08b'), '=', format(a & b, '08b'), '\n')
    #OR
print('[or]')
print('a | b = ', a | b)
print(format(a, '08b'), '&', format(b, '08b'), '=', format(a | b, '08b'), '\n')
    #XOR
print('[xor]')
print('a ^ b = ', a ^ b)
print(format(a, '08b'), '&', format(b, '08b'), '=', format(a ^ b, '08b'), '\n')
    #NOT
print('[not]')
print('~a  ~b = ', ~a , ~b)
print('~' + format(a, '08b'), '~' + format(b, '08b'), '=', format(a, '08b'), format(b, '08b'), '\n')
    #SHIFT LEFT
print('[shift left]')
print('b << a = ', b << a)
print(format(b, '08b'), '<<', format(a, '08b'), '=', format(b << a, '08b'), '\n')
    #SHIFT RIGHT
print('[shift right]')
print('a >> b ', a >> b)
print(format(a, '08b'), '>>', format(b, '08b'), '=', format(a >> b, '08b'), '\n')

#OPERATOR IDENTITAS
print("OPERATOR IDENTITAS")
c = int(input("Masukkan Nilai C = "))
d = c
print("Nilai C = ",c)
print("Nilai D = ",d)
    #IS
print("OPERATOR IS")
print(d is c)
    #IS NOT
print("OPERATOR IS NOT")
e = [1,5,9]
f = [1,5,9]
print("e = ",e)
print("f =",f)
print(f is not e)
print()

#OPERATOR KEANGGOTAAN
print("OPERATOR KEANGGOTAAN IN")
    #IN
g = [1,5,9]
h = 5
print(g)
print(h)
print(h in g)
    #NOT IN
print("OPERATOR KEANGGOTAAN NOT IN")
i = [1,5,9]
j = 5
print(i)
print(j)
print(j not in i)