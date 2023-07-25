/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P6_Array;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Rizdhan Syahlan
 */
public class Permata {
    public static void main(String[]args)throws IOException {
    
        Scanner input = new Scanner (System.in);
        int i, j;
        String np, tgl;        
        double total = 0;
        String [] kb = new String [10];
        String [] nb = new String [10];
        int [] jumbel = new int [10];
        double [] hrg = new double [10];
        double [] thrg = new double [10];
        
            System.out.println("               PT. PERMATA \"PRATAMA\"                 ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Masukan Nama Petugas  : ");   
            np = input.nextLine();
            System.out.print("Tanggal               : "); 
            tgl = input.nextLine();
            System.out.print("Jumlah Data yang akan dimasukkan : "); 
            j = input.nextInt();
            System.out.println("--------------------------------------------------------------");

                for(i=1;i<=j;i++) {
                    System.out.println("\t\tData Ke- " + i);
                    System.out.print("\t\tKode Barang [P001 | V001 | M001]  : "); 
                    kb[i]=input.next();
                    System.out.print("\t\tJumlah Barang                     : "); 
                    jumbel[i]=input.nextInt();

                    if(kb[i].equalsIgnoreCase("P001"))
                    {
                        kb[i] = "P001";
                        nb[i] = "Printer";
                        hrg[i] = 700000;
                    }
                    else if(kb[i].equalsIgnoreCase("V001"))
                    {
                        kb[i] = "V001";
                        nb[i] = "VGA Card";
                        hrg[i] = 75000;
                    }
                    else if(kb[i].equalsIgnoreCase("M001"))
                    {
                        kb[i] = "M001";
                        nb[i] = "Mother Board";
                        hrg[i] = 950000;
                    }
                    else
                    {
                    nb[i] = " Kode Tidak Terdaftar";
                    hrg[i] = 0;
                    }
                    thrg[i] = hrg[i] * jumbel[i];
                    total = total + thrg[i];
                    }
                System.out.println("--------------------------------------------------------------");
                System.out.println("                               PT. PERMATA PRATAMA                                   ");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Nama Petugas                : " + np + "\t\t\t\t\tTanggal : " + tgl);
                System.out.println("Jumlah Data Yang Dimasukkan : " + j);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("No \tKode Barang \tNama Barang \tHarga Barang \t   Jumlah Barang \tTotal Harga");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for(i=1; i<=j; i++) {
                System.out.println(i + "\t" + kb[i] + "\t\t " +nb[i]+ " \tRp. " + (int) hrg[i] + "\t\t" + jumbel[i] +"\t\t"+(int)thrg[i]);                
            }
System.out.println("Total Pendapatan pada tanggal " + tgl + " adalah sebesar Rp." + (int) total );
} 
}
