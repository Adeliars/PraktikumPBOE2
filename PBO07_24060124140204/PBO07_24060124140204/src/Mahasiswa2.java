/* Nama File : Mahasiswa2.java
 * Deskripsi : Kelas turunan CivitasAkademika (Mahasiswa)
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa2(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    // 4i. setWali
    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    // 4j. tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Dosen Wali : " + (dosenWali != null ? dosenWali.getNama() : "-"));
        System.out.println();
    }
}