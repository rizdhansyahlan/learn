hma = []
hmax = []
hmr = []
hmrx = []
hmi = []
hmix = []
class memesan ():   

      def tkamar (self):
            print()
            print("•"*40)
            print("•","JENIS KAMAR".center(36),"•")
            print("•"*40)
            print(" 1. Standard Single Bed")
            print(" 2. Standard Twin Beds")
            print(" 3. Superior Queen Bed")
            print(" 4. Deluxe Room")
            print(('•'*40))
            print()

      def Info_Kamar(self):
            print("•"*80)
            print("INFO KAMAR HOTEL".center(80))
            print("•"*80)
            print(">>>>> Standard Single Bed <<<<<".center(80))
            print("Tipe Tempat Tidur : 1 Single Bed".center(80))
            print("Harga: Rp. 200.000 Per Malam".center(80))
            print("""Fasilitas Kamar :
Air Mineral, AC, Android TV, Kamar Mandi Pribadi, Perlengkapan Mandi, Hair Dryer""")
            print("•"*80)
            print(">>>>> Standard Twin Beds <<<<<".center(80))
            print("Tipe Tempat Tidur: 2 Ranjang Single Bed".center(80))
            print("Harga: Rp. 350.000".center(80))
            print("""Fasilitas Kamar : 
Air Mineral, AC, Android TV, Kamar Mandi Pribadi, Perlengkapan Mandi, Hair Dryer""")
            print("•"*80)
            print(">>>>> Superior Queen Bed <<<<<".center(80))
            print("Tipe Tempat Tidur: 1 Queen Bed".center(80))
            print("Harga: Rp. 500.000".center(80))
            print("""Fasilitas Kamar : 
Air Mineral, AC, Android TV, Kamar Mandi Pribadi, Perlengkapan Mandi, Hair Dryer, 
Bathtub""")
            print("•"*80)
            print(">>>>> Deluxe Room <<<<<".center(80))
            print("Luas Kamar: 60.0 m2".center(80))
            print("Tipe Tempat Tidur : 1 King Bed".center(80))
            print("Harga: Rp. 1.000.000".center(80))
            print("Ruang Bebas Asap Rokok".center(80))
            print("""Fasilitas Kamar : 
Air Mineral, AC, Ruang Tamu, Android TV, Kamar Mandi Pribadi, Perlengkapan Mandi, 
Hair Dryer, Bathtub, Akses Kolam Renang, Free Breakfast""")
            print("•"*80)
            print()

            print("*"*57)
            print("""Informasi dan Fasilitas Tambahan :
1. AC dan Housekeeping Harian
2. Internet - WiFi Gratis
3. Hiburan - Layanan TV Cable
4. Layanan Resepsionis 24jam
5. Area Merokok dan Area Bebas Rokok, kecuali Deluxe Room
6. Dilarang Membawa Hewan Peliharaan""")
            print("*"*57)
            print()

      def breakfast(self):
            print('•'*60)
            print("•", "KIREI HOTEL".center(56), "•")
            print('•'*60)
            print("MENU SARAPAN".center(60))
            print("Kami Menyediakan Makanan Berat, Makanan Ringan dan Minuman".center(60))
            print('='*60)
            lma = input("Apakah Anda Ingin Memesan Makanan Berat (Y/N) : ")
            if lma == "Y" or lma == "y":
                  print ("\nSilahkan Pilih Menu Makanan Berat Anda!")
                  print('‾'*60)
                  memesan.makanan_berat(self)
            elif lma == "N" or lma == "n":
                  hmax.append(int("0"))
                  lmr=input("Apakah Anda Ingin Memesan Makanan Ringan (Y/N) : ")
                  if lmr == "Y" or lmr == "y":
                        print ("\nSilahkan Pilih Menu Makanan Ringan Anda!")
                        print('‾'*60)
                        memesan.makanan_ringan(self)
                  elif lmr == "N" or lmr == "n":
                        hmrx.append(int('0'))
                        lmi=input("Apakah Anda Ingin Memesan Minuman (Y/N) : ")
                        if lmi == "Y" or lmi == "y":
                              print ("\nSilahkan Pilih Menu Minuman Anda!")
                              print('‾'*60)
                              memesan.minuman(self)
                        elif lmi == "N" or lmi == "n":
                              print('='*60)
                              hmix.append(int('0'))

      def makanan_berat(self):    
            print("Makanan Berat".center(65))
            print("""            1. Nasi Goreng                (Rp20.000)
            2. Nasi + Ayam Goreng         (Rp25.000)
            3. Nasi + Ayam Bakar          (Rp30.000)
            4. Nasi + Rendang             (Rp35.000)
            5. Spaghetti                  (Rp20.000)""")
            print()
            i = 0
            bj = int(input("Anda Ingin Memesan Berapa Jenis Makanan : "))
            while i < bj:
                  print("Makanan Berat Ke-",i + 1)
                  ma=int(input("Masukan Nomor Makanan Berat : "))
                  if ma == 1:
                        print("Makanan Berat yang Anda Pilih: Nasi Goreng")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hma.append(j*(20_000))
                  elif ma == 2:
                        print("Makanan Berat yang Anda Pilih: Nasi + Ayam Goreng")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hma.append(j*(25_000))
                  elif ma == 3:
                        print("Makanan Berat yang Anda Pilih: Nasi + Ayam Bakar")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hma.append(j*(30_000))
                  elif ma == 4:
                        print("Makanan Berat yang Anda Pilih: Nasi + Rendang")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hma.append(j*(35_000))
                  elif ma == 5:
                        print("Makanan Berat yang Anda Pilih: Spaghetti")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : ")) 
                        hma.append(j*(20_000))
                  else:
                        hmax.append((0))
                        memesan.makanan_ringan(self)
                  i = i + 1
                  print()  
            d = 0
            a = 0
            while a < bj:
                  d += hma[a]
                  a = a + 1
            hmax.append(d)
            lmr=input("Apakah Anda Ingin Memesan Makanan Ringan (Y/N) : ")
            if lmr == "Y" or lmr == "y":
                  print ("\nSilahkan Pilih Menu Makanan Ringan Anda!")
                  print('‾'*60)
                  memesan.makanan_ringan(self)
            elif lmr == "N" or lmr == "n":
                  hmrx.append(int('0'))
                  lmi=input("Apakah Anda Ingin Memesan Minuman (Y/N) : ")
                  if lmi == "Y" or lmi == "y":
                        print ("\nSilahkan Pilih Minuman Anda!")
                        print('‾'*60)
                        memesan.minuman(self)
                  elif lmi == "N" or lmi == "n":
                        print('='*60)
                        hmix.append(int('0'))
                
      def makanan_ringan(self):     
            print("Makanan Ringan".center(60))
            print("""            1. Makaroni Schotel     (Rp15.000)
            2. Sereal               (Rp10.000)
            3. Salad                (Rp15.000)
            4. Roti Bakar           (Rp10.000)
            5. Zuppa Soup           (Rp15.000)
            6. French Fries         (Rp10.000)""")
            print()
            i = 0
            bj = int(input("Anda Ingin Memesan Berapa Jenis Makanan Ringan : "))
            while i < bj:
                  print("Makanan Ringan Ke-",i + 1)
                  mr=int(input("Masukan Nomor Makanan Ringan : "))
                  if mr == 1:
                        print("Makanan Ringan yang Anda Pilih: Makaroni Schotel")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                    
                        hmr.append(j*(15_000))
                  elif mr == 2:
                        print("Makanan Ringan yang Anda Pilih: Sereal")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmr.append(j*(10_000))
                  elif mr == 3:
                        print("Makanan Ringan yang Anda Pilih: Salad")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmr.append(j*(15_000))
                  elif mr == 4:
                        print("Makanan Ringan yang Anda Pilih: Roti Bakar")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hmr.append(j*(10_000))
                  elif mr == 5:
                        print("Makanan Ringan yang Anda Pilih: Zuppa Soup")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmr.append(j*(15_000))
                  elif mr == 6:
                        print("Makanan Ringan yang Anda Pilih: French Fries")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmr.append(j*(10_000))
                  else:
                        hmrx.append((0))
                        memesan.minuman(self)                                
                  i = i + 1
                  print()
            d = 0
            a = 0
            while a < bj:
                  d += hmr[a]
                  a = a + 1
            hmrx.append(d)
            lmi=input("Apakah Anda Ingin Memesan Minuman (Y/N) : ")
            if lmi == "Y" or lmi == "y":
                  print ("\nSilahkan Pilih Menu Minuman Anda!")
                  print('‾'*60)
                  memesan.minuman(self)
            elif lmi == "N" or lmi == "n":
                  print('='*60)
                  hmix.append(int('0'))
            
      def minuman(self):
            print("Minuman".center(60))
            print("""            1. Air Mineral              (Rp5.000)
            2. Teh Manis Panas/Dingin   (Rp5.000)
            3. Lemon Tea               (Rp10.000)
            4. Coffee                  (Rp10.000)
            5. Milkshake               (Rp10.000)
            6. Aneka Jus               (Rp10.000)
                  Alpukat, Mangga, Jeruk, Jeruk Nipis,
                  Pepaya, Semangka, dan Mixed Juice
            7. Cokelat Panas/Dingin    (Rp10.000)""")
            print()
            i = 0
            bj = int(input("Anda Ingin Memesan Berapa Jenis Minuman : "))
            while i < bj:
                  print("Minuman Ke-",i + 1)
                  mi = int(input("Masukan Nomor Minuman : "))
                  if mi == 1:
                        print("Minuman yang Anda Pilih: Air Mineral")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                 
                        hmi.append(j*(5_000))
                  elif mi == 2:
                        print("Minuman yang Anda Pilih: Teh Manis Panas/Dingin")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                               
                        hmi.append(j*(5_000))
                  elif mi == 3:
                        print("Minuman yang Anda Pilih: Lemon Tea")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmi.append(j*(10_000))
                  elif mi == 4:
                        print("Minuman yang Anda Pilih: Coffee")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmi.append(j*(10_000))
                  elif mi == 5:
                        print("Minuman yang Anda Pilih: Milkshake")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmi.append(j*(10_000))
                  elif mi == 6:
                        print("Minuman yang Anda Pilih: Jus")                                 
                        input("Jus Yang Anda Pilih : ")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))
                        hmi.append(j*int(10_000))
                  elif mi == 7:
                        print("Minuman yang Anda Pilih: Cokelat Panas/Dingin")
                        j = int(input("Masukan Jumlah Yang Anda Pesan : "))                                
                        hmi.append(j*(10_000))
                  else:
                        hmix.append((0))
                        memesan()
                  i = i + 1
                  print()
            print('='*60)
            d = 0
            a = 0
            while a < bj:
                  d += hmi[a]
                  a = a + 1
            hmix.append(d)
            
