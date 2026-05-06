/* Nama File : Main.java
 * Deskripsi : Main untuk menjalankan aplikasi Kucing dengan berbagai konstruktor dan overloading method
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 30 April 2026
 */

package Anabul;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GENERIK PADA CLASS DATUM ===");

        Datum<Anabul> data1 = new Datum<>(new Kucing("Aleimut", 3.5));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Zaimut"));
        Datum<Anabul> data3 = new Datum<>(new Burung("Imut"));

        data1.tampilkanAnabul(data1.getIsi());
        System.out.println();

        data1.setIsi(new Anggora("Kiki", 4.2));
        data1.tampilkanAnabul(data1.getIsi());
        System.out.println();

        data2.tampilkanAnabul(data2.getIsi());
        System.out.println();

        data3.tampilkanAnabul(data3.getIsi());
        System.out.println();
    }
}
