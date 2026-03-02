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

        System.out.println("Panjang Garis: " + G1.getPanjang()); // Menampilkan panjang garis G1
        System.out.println("Gradien Garis: " + G1.getGradien()); // Menampilkan gradien garis G1
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris()); // Menampilkan persamaan garis G1
    }
}