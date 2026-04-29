/* Nama File : Seminar.java
 * Deskripsi : Kelas untuk mengelola peserta seminar
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // 4b. Konstruktor
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // 4c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // 4d. registrasi
    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Peserta penuh!");
        }
    }

    // 4g. tampilPeserta
    public void tampilPeserta() {
        System.out.println("=== Daftar Peserta Seminar ===");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }

    // 4h. countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}