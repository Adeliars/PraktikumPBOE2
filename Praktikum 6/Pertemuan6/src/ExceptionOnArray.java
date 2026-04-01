/* Nama File : ExceptionOnArray.java
 * Deskripsi : Program untuk menunjukkan eksepsi array
 * Pembuat : Adelia Clearesta
 * Tanggal : 31 Maret 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[3];

        try {
            arrayInteger[1] = 20;
            arrayInteger[5] = 15; // error (index out of bounds)
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Terjadi kesalahan indeks array!");
        } finally {
            System.out.println("clean up code...");
        }
    }
}