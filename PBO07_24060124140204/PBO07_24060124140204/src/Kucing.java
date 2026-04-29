/* Nama File : Kucing.java
 * Deskripsi : Kelas turunan dari Anabul (Kucing)
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Kucing extends Anabul {

    // Konstruktor
    public Kucing(String nama) {
        super(nama);
    }

    // Override Method
    @Override
    public void gerak() {
        System.out.println("Kucing " + getNama() + " bergerak melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + getNama() + " bersuara meong");
    }
}