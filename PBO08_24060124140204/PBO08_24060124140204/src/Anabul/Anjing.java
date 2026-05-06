/* Nama File : Anjing.java
 * Deskripsi : Kelas untuk merepresentasikan objek Anjing dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Anjing extends Anabul {

    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Anjing " + getNama() + " berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println("Anjing " + getNama() + " berbunyi guk guk");
    }

    @Override
    public String toString() {
        return "Anjing: " + getNama();
    }
}