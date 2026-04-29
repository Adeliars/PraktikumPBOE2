/* Nama File : CivitasAkademika.java
 * Deskripsi : Kelas induk untuk civitas akademika
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // 4a. Method polymorphism (yang akan dioverride)
    public String getNomor() {
        return "";
    }
}