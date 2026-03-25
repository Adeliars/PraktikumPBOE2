/* Nama File : Pengusaha.java
 * Deskripsi : berisi atribut dan method dalam class Pengusaha
 * Pembuat : Adelia Clearesta
 * Tanggal : 22 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    // Atribut
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstruktor tanpa parameter
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Method abstrak 
    // Menghitung masa kerja pengusaha
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 0;
    }

    // Menghitung pajak pengusaha
    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.15;
    }

    // Menampilkan informasi pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + this.npwp);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}