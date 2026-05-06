/* Nama File : Anggora.java
 * Deskripsi : Kelas untuk merepresentasikan objek Anggora dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Anggora extends Kucing {

    public Anggora() {
        super();
    }

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println("Anggora " + getNama() + " loncat-loncat");
    }

    @Override
    public void Bersuara() {
        System.out.println("Anggora " + getNama() + " mengeong dengan lembut");
    }

    @Override
    public String toString() {
        return "Anggora: " + getNama() + " (" + bobot + " kg)";
    }
}