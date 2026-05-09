/* Nama File : MainTeman.java
 * Deskripsi : Kelas main untuk menguji fungsi Teman
 * Pembuat   : Adelia Clearesta
 * NIM       : 24060124140204
 * Tanggal   : 7 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        // Membuat objek Teman
        Teman teman = new Teman();

        // Menambahkan nama teman
        teman.addNama("Ale");
        teman.addNama("Zai");
        teman.addNama("Lea");
        teman.addNama("Are");
        teman.addNama("Fizi");

        // Menampilkan jumlah elemen
        System.out.println("Jumlah teman: " + teman.getNbelm());

        // Menampilkan semua teman
        System.out.println();
        teman.showTeman();

        // Mengambil nama berdasarkan indeks
        System.out.println("\nNama pada indeks ke-1: " + teman.getNama(1));

        // Mengubah nama berdasarkan indeks
        teman.setNama(2, "Lea Baru");
        System.out.println("\nSetelah nama indeks ke-2 diubah menjadi Lea Baru:");
        teman.showTeman();

        // Mengecek apakah nama tertentu ada dalam daftar
        System.out.println("\nApakah Zai ada? " + teman.isMember("Zai"));
        System.out.println("Apakah Budi ada? " + teman.isMember("Budi"));

        // Mengganti nama tertentu
        boolean berhasilGanti = teman.gantiNama("Are", "Are Baru");
        System.out.println("\nApakah Are berhasil diganti? " + berhasilGanti);

        System.out.println("Setelah Are diganti menjadi Are Baru:");
        teman.showTeman();

        // Menghitung jumlah kemunculan nama tertentu
        System.out.println("\nJumlah nama Ale: " + teman.countNama("Ale"));

        // Menghapus nama
        teman.delNama("Fizi");
        System.out.println("\nSetelah Fizi dihapus:");
        teman.showTeman();

        // Menampilkan jumlah elemen akhir
        System.out.println("\nJumlah teman sekarang: " + teman.getNbelm());
    }
}