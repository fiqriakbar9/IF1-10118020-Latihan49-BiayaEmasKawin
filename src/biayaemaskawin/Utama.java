/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung biaya
 * emas kawin jika harga emas per gramnya adalah di bulan yang sudah di tentukan
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        emas emas = new emas();
        
        emas.setEmas(15.7);
        emas.setHarga(570000);
        
              
    DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols RP = new DecimalFormatSymbols();
    RP.setCurrencySymbol("Rp. ");
    RP.setMonetaryDecimalSeparator(',');
    RP.setGroupingSeparator('.');
    Idr.setDecimalFormatSymbols(RP);
        
        System.out.println("Mahar emas kawin sebesar "+emas.getEmas()+" gram");
        System.out.println("Harga emas 1 gram per bulan Oktober adalah "+Idr.format(emas.getHarga()).replaceAll(",00", ""));
        System.out.println("\nMaka total yang harus dibayar adalah "+Idr.format(emas.hitungEmas(emas.getEmas())).replaceAll(",00", ""));
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
