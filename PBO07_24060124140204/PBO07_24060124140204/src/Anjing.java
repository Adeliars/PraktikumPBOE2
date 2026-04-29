/* Nama File : Anjing.java
 * Deskripsi : Kelas turunan dari Anabul (Anjing)
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Anjing extends Anabul {

    // Konstruktor
    public Anjing(String nama) {
        super(nama);
    }

    // Override Method
    @Override
    public void gerak() {
        System.out.println("Anjing " + getNama() + " bergerak melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + getNama() + " bersuara guk-guk");
    }
}