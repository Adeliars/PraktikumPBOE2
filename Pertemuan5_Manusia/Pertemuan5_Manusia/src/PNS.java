/* Nama File : PNS.java
 * Deskripsi : berisi atribut dan method dalam class PNS
 * Pembuat : Adelia Clearesta
 * Tanggal : 22 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    // Atribut
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor tanpa parameter
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // Method abstrak dari class Manusia

    // Menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 3;
    }

    // Menghitung pajak PNS
    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.10;
    }

    // Menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + this.nip);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}