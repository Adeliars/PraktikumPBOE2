/* Nama File : MainSeminar.java
 * Deskripsi : Program utama untuk simulasi seminar
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 27 April 2026
 */

public class MainSeminar {
    public static void main(String[] args) {

        // 4e. Membuat objek dosen
        Dosen d1 = new Dosen("Pak Budi", "1234512345");
        Dosen d2 = new Dosen("Bu Sari", "1234612346");

        // 4e. Membuat objek mahasiswa
        Mahasiswa2 m1 = new Mahasiswa2("Alea", "24060124170506");
        Mahasiswa2 m2 = new Mahasiswa2("Zaimut", "24060124140806");
        Mahasiswa2 m3 = new Mahasiswa2("Alza", "24060124230925");
        Mahasiswa2 m4 = new Mahasiswa2("Fizi", "24060124140000");
        Mahasiswa2 m5 = new Mahasiswa2("Resta", "24060124170000");

        // 4i. set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // 4b. objek seminar
        Seminar s = new Seminar();

        // 4f. registrasi peserta
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // 4c. jumlah peserta
        System.out.println("Total Peserta: " + s.countPeserta());

        // 4g. tampil peserta
        s.tampilPeserta();

        // 4h. jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());

        System.out.println("\n=== Data Mahasiswa ===");

        // 4j. tampil data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}