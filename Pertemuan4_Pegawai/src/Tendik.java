/* Nama File : Tendik.java
 * Deskripsi : berisi atribut dan method dalam class Tendik
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;
    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Tunjangan Tendik = 1% per tahun masa kerja
    @Override
    public double getTunjangan() {
        int masaKerja = getMasaKerja().getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    // BUP Tendik = 55 tahun
   @Override
    public String getBUP() {

        LocalDate pensiun = tanggalLahir.plusYears(55)
                .withDayOfMonth(1)
                .plusMonths(1);

        return formatTanggal(pensiun);
    }

    @Override
    public void printInfo() {

        Period mk = getMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " +
                mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getBUP());
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}