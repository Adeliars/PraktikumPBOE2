/* Nama File : Petani.java
 * Deskripsi : berisi atribut dan method dalam class Petani
 * Pembuat : Adelia Clearesta
 * Tanggal : 22 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0;

    // Konstruktor tanpa parameter
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan Setter
    public String getAsal_kota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    // Method abstrak 
    // Menghitung masa kerja petani
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 1;
    }
    
    // Menghitung pajak petani
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    // Menampilkan informasi petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + this.asal_kota);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}