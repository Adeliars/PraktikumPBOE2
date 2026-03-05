/* Nama File    : MGaris.java
 * Deskripsi    : Main class untuk menjalankan class Garis
 * Pembuat      : Adelia Clearesta
 * Tanggal      : 28 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0); // Membuat titik awal dengan koordinat (-2, 0)
        Titik t2 = new Titik(0, 4); // Membuat titik akhir dengan koordinat (0, 4)
        Garis G1 = new Garis(t1, t2); // Membuat garis G1 dengan titik awal t1 dan titik akhir t2

        // Menampilkan panjang garis G1
        System.out.println("Panjang Garis: " + G1.getPanjang());

        // Menampilkan gradien garis G1
        System.out.println("Gradien Garis: " + G1.getGradien()); 

        // Menampilkan titik tengah garis G1
        System.out.println("Titik Tengah: (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat() + ")");

        // Membuat garis G2 dengan titik awal t3 dan titik akhir t4
        Titik t3 = new Titik(-5, 5); // Membuat titik awal dengan koordinat (-2, 0)
        Titik t4 = new Titik(0, 7); // Membuat titik akhir dengan koordinat (0, 4)
        Garis G2 = new Garis(t3, t4);

        // Menampilkan apakah garis G1 sejajar dengan garis G2
        if (G1.isSejajar(G2)) {
            System.out.println("Garis G1 sejajar dengan Garis G2");
        } else {
            System.out.println("Garis G1 tidak sejajar dengan Garis G2");
        }

        // Menampilkan apakah garis G1 tegak lurus dengan garis G2
        if (G1.isTegakLurus(G2)) {
            System.out.println("Garis G1 tegak lurus dengan Garis G2");
        } else {
            System.out.println("Garis G1 tidak tegak lurus dengan Garis G2");
        }

        // Menampilkan persamaan garis G1
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris()); 
    }
}