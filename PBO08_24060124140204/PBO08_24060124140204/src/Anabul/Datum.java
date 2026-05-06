/* Nama File : Datum.java
 * Deskripsi : Kelas untuk merepresentasikan objek Datum dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Datum<T>{
    // Atribut
    private T isi;

    // Konstruktor datum dengan menyalin nilai input pada objek yang baru
    public Datum(T isi){
        this.isi = isi;
    }

    // Selektor, mengembalikan nilai isi
    public T getIsi(){
        return isi;
    }

    // Mutator, mengubah nilai isi
    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }

    // Mencetak Anabul
    public void tampilkanAnabul(Anabul anabul){
        anabul.Gerak();
        anabul.Bersuara();

        if(anabul instanceof Kucing){
            ((Kucing) anabul).printBobot();
        }
    }
}
