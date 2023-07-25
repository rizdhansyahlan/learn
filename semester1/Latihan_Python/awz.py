bil1 = 60
bil2 = 20
bil3 = 100
bil4 = 40
if (bil1 > bil2) and (bil1 > bil3) and (bil1 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 1 = " + str(bil1))
    
elif (bil2 > bil1) and (bil2 > bil3) and (bil2 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 2 = " + str(bil2))
    
elif (bil3 > bil1) and (bil3 > bil2) and (bil3 > bil4):
    print("Bilangan Terbesar Adalah Bilangan 3 = " + str(bil3))
    
else:
    print("Bilangan Terbesar Adalah Bilangan 4 = " + str(bil4))