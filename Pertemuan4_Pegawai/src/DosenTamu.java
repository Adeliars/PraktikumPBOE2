/* Nama File : DosenTamu.java
 * Deskripsi : berisi atribut dan method dalam class DosenTamu
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate; 
import java.time.Period;

public class DosenTamu extends Dosen {
    // Atribut
    private String NIDK;
    private LocalDate akhirKontrak;

    // Konstruktor
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    // Getter dan Setter
    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }
    
    // Tunjangan Dosen Tamu = 2.5% dari gaji pokok
    @Override
    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public String getBUP() {
        Period sisa = Period.between(LocalDate.now(), akhirKontrak);

        return sisa.getYears() + " tahun " +
               sisa.getMonths() + " bulan lagi";
    }

    @Override
    public void printInfo() {

        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + NIDK);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Kontrak Berakhir : " + formatTanggal(akhirKontrak));
        System.out.println("Sisa Kontrak : " + getBUP());
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}