/* Nama File : Burung.java
 * Deskripsi : Kelas turunan dari Anabul (Burung)
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Burung extends Anabul {

    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // Override Method
    @Override
    public void gerak() {
        System.out.println("Burung " + getNama() + " bergerak terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung " + getNama() + " bersuara cuit");
    }
}