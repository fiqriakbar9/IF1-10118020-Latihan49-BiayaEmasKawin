/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayaemaskawin;

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
public class emas {
    private double emas;
    private int harga;

    public double getEmas() {
        return emas;
    }

    public void setEmas(double emas) {
        this.emas = emas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double hitungEmas (double emas){
        return emas*harga;
    }
}
