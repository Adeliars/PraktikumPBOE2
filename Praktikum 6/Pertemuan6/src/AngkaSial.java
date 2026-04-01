/* Nama File : AngkaSial.java
 * Deskripsi : Program untuk menggunakan exception buatan sendiri
 * Pembuat : Adelia Clearesta
 * Tanggal : 31 Maret 2026
 */

public class AngkaSial {

    public static void cekAngka(int angka) throws AngkaSialException {
        if (angka == 7) {
            throw new AngkaSialException();
        } else {
            System.out.println("Angka: " + angka);
        }
    }

    public static void main(String[] args) {
        try {
            cekAngka(5);
            cekAngka(7); // akan kena exception
            cekAngka(10);
        } catch (AngkaSialException e) {
            System.out.println("Terjadi exception: " + e.getMessage());
        }
    }
}