/* Nama File : Kucing.java
 * Deskripsi : Kelas untuk merepresentasikan objek Kucing dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public void printBobot() {
        System.out.println("Bobotnya adalah " + getBobot() + " kg");
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing " + getNama() + " melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }

    @Override
    public String toString() {
        return "Kucing: " + getNama() + " (" + bobot + " kg)";
    }
}
