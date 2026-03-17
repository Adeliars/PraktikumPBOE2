/* Nama File : Pegawai.java
 * Deskripsi : berisi atribut dan method dalam class Pegawai
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {   // harus abstract
    // Atribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt; 
    protected double gajiPokok;

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public abstract void printInfo();
    public abstract String getBUP();
    public abstract double getTunjangan();

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menghitung masa kerja
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // Method untuk format tanggal
    public String formatTanggal(LocalDate tgl) {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        return tgl.format(formatter);
    }
}