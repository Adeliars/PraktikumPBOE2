/* Nama File : Kembangtelon.java
 * Deskripsi : Kelas untuk merepresentasikan objek Kembangtelon dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Kembangtelon extends Kucing {

    public Kembangtelon() {
        super();
    }

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println("Kembangtelon " + getNama() + " berjalan pelan");
    }

    @Override
    public void Bersuara() {
        System.out.println("Kembangtelon " + getNama() + " berbunyi meong");
    }

    @Override
    public String toString() {
        return "Kembangtelon: " + getNama() + " (" + bobot + " kg)";
    }
}