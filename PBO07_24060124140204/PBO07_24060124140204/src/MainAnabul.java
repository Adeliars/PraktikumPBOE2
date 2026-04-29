/* Nama File : MainAnabul.java
 * Deskripsi : Program utama untuk simulasi polimorfisme Anabul
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {

        // Membuat objek anabul (polimorfisme)
        Anabul a1 = new Kucing("Ale");
        Anabul a2 = new Anjing("Zaimut");
        Anabul a3 = new Burung("Alala");

        System.out.println("=== Simulasi Anabul ===");

        a1.gerak();
        a1.bersuara();

        System.out.println();

        a2.gerak();
        a2.bersuara();

        System.out.println();

        a3.gerak();
        a3.bersuara();
    }
}