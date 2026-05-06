/* Nama File : Anabul.java
 * Deskripsi : Kelas untuk merepresentasikan objek Anabul dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Anabul {
    private String nama;
    
    public Anabul() {
        this.nama = "";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void Gerak() {
        System.out.println("Anabul " + nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println("Anabul " + nama + " bersuara....");
    }
}