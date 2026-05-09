/* Nama File : MainPiaraan.java
 * Deskripsi : Kelas untuk menguji fungsi Piaraan
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 7 Mei 2026
 */

package Piaraan;

public class MainPiaraan {
    public static void main(String[] args) {
        // Membuat objek Piaraan
        Piaraan p = new Piaraan();

        // Membuat beberapa objek Kucing
        Kucing kucing1 = new Kucing("Zaimut", 3.5);
        Kucing kucing2 = new Kucing("Aleimut", 4.2);
        Kucing kucing3 = new Kucing("Imup", 5.0);

        // Menambahkan kucing ke antrean piaraan
        p.enqueueAnabul(kucing1);
        p.enqueueAnabul(kucing2);
        p.enqueueAnabul(kucing3);

        // Menampilkan jumlah elemen
        System.out.println("Jumlah anabul: " + p.getNbelm());

        // Menampilkan semua anabul
        System.out.println("\nDaftar anabul:");
        p.showAnabul();

        // Mengecek apakah kucing tertentu ada dalam piaraan
        System.out.println("\nApakah Zaimut ada? " + p.isMember(kucing1));

        // Melihat anabul paling depan dalam antrean
        Anabul depan = p.getanabul();
        if (depan != null) {
            System.out.println("\nAnabul paling depan: " + depan.getNama());
        }

        // Menghitung jumlah kucing
        System.out.println("\nJumlah kucing: " + p.countKucing());

        // Menghitung total bobot kucing
        System.out.println("Total bobot kucing: " + p.bobotKucing());

        // Menampilkan jenis anabul
        System.out.println("\nJenis anabul:");
        p.showJenisAnabul();

        // Mengeluarkan anabul dari antrean
        Anabul keluar = p.dequeueAnabul();
        if (keluar != null) {
            System.out.println("\nAnabul yang keluar dari antrean: " + keluar.getNama());
        }

        // Menampilkan jumlah elemen setelah dequeue
        System.out.println("Jumlah anabul setelah dequeue: " + p.getNbelm());

        // Menampilkan daftar anabul setelah dequeue
        System.out.println("\nDaftar anabul setelah dequeue:");
        p.showAnabul();
    }
}