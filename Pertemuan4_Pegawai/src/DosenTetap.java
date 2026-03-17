/* Nama File : DosenTetap.java
 * Deskripsi : berisi atribut dan method dalam class DosenTetap
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    // Atribut
    private String NIDN;

    // Konstruktor
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDN) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    // Getter dan Setter
    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    // Tunjangan Dosen Tetap = 2% per tahun masa kerja
    @Override
    public double getTunjangan() {
        int masaKerja = getMasaKerja().getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public String getBUP() {
        LocalDate pensiun = tanggalLahir.plusYears(65)
                .withDayOfMonth(1)
                .plusMonths(1);

        return formatTanggal(pensiun);
    }

    
    @Override
        public void printInfo() {

        Period mk = getMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " +
                mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getBUP());
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}