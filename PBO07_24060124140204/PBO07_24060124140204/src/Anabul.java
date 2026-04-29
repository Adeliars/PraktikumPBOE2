/* Nama File : Anabul.java
 * Deskripsi : Kelas induk untuk merepresentasikan data anabul
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Anabul {
    // Atribut
    private String nama;

    // Konstruktor
    public Anabul() {
        this.nama = "";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    // Getter & Setter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method
    public void gerak() {
        System.out.println("Anabul " + nama + " bergerak...");
    }

    public void bersuara() {
        System.out.println("Anabul " + nama + " bersuara...");
    }
}