/* Nama File : Burung.java
 * Deskripsi : Kelas untuk merepresentasikan objek Burung dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Burung extends Anabul {

    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Burung " + getNama() + " terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Burung " + getNama() + " berbunyi cuit");
    }

    @Override
    public String toString() {
        return "Burung: " + getNama();
    }
}