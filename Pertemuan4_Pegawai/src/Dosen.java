/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Dosen extends Pegawai {
    // Atribut
    private String fakultas;

    // Konstruktor
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Getter dan Setter
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Dosen (BUP = 65 tahun)
    @Override
    public String getBUP() {
        LocalDate bup = getTanggalLahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return bup.format(formatter);
    }

}