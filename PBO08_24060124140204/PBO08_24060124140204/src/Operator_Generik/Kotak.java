/* Nama File : Kotak.java
 * Deskripsi : Kelas pembungkus generik untuk membantu proses tukar nilai
 * Pembuat   : Adelia Clearesta
 * NIM       : 24060124140204
 * Tanggal   : 6 Mei 2026
 */

package Operator_Generik;

// Kelas pembungkus generik untuk membantu proses tukar nilai
public class Kotak<T> {
    private T isi;

    // Konstruktor
    public Kotak(T isi) {
        this.isi = isi;
    }

    // Selektor 
    public T getIsi() {
        return isi;
    }

    // Mutator
    public void setIsi(T isi) {
        this.isi = isi;
    }

    // Override toString untuk pencetakan isi kotak
    @Override
    public String toString() {
        return String.valueOf(isi);
    }
}