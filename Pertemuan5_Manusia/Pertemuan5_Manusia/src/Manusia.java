/* Nama File : Manusia.java
 * Deskripsi : berisi atribut dan method dalam class Manusia
 * Pembuat : Adelia Clearesta
 * Tanggal : 22 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    // Atribut
    String nama;
    LocalDate tgl_mulai_kerja;
    String alamat;
    double pendapatan;
    static int counterMns = 0;
    
    // Konstruktor 
    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.of(0,0,0);
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }
    
    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Pendapatan: " + this.pendapatan);
    }

    // Method abstrak
    // Untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}