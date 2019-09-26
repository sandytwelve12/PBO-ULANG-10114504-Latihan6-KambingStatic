/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program Kambing Statik
 */
public class PBOULANG10114504Latihan6KambingStatic {

    
    public class Mamalia {
            // Variabel jumlahKambing dideklarasikan sebagai statik

            public static int jumlahKambing;
        }
    public class KambingStatic {
        // NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "MIDUN";
                
        public static void main(String[] args) {
           Mamalia.jumlahKambing = 485000;
           System.out.printl(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
