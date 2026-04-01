/* Nama File : Asersi2.java
 * Deskripsi : Demo asersi dengan kasus umur mahasiswa
 * Pembuat : Adelia Clearesta
 * Tanggal : 31 Maret 2026
 */

// class Mahasiswa
class Mahasiswa {
    private int umur;

    public Mahasiswa(int umur) {
        this.umur = umur;
    }

    public void tampilkanUmur() {
        System.out.println("Umur mahasiswa: " + umur);
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        int umur = -1;

        // asersi
        assert (umur > 0) : "umur tidak boleh nol atau negatif!!!";

        Mahasiswa m = new Mahasiswa(umur);
        m.tampilkanUmur();
    }
}