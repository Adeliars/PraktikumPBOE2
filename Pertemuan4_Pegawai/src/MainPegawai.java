/* Nama File : MainPegawai.java
 * Deskripsi : main class untuk menjalankan program
 * Pembuat : Adelia Clearesta
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;

public class MainPegawai {

    public static void main(String[] args) {

        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324"
        );

        DosenTamu dosenTamu = new DosenTamu(
                "12345678",
                "Zaimut",
                LocalDate.of(2006,8,14),
                LocalDate.of(2024,6,13),
                4500000,
                "Fakultas Teknik",
                "99887766",
                LocalDate.of(2027,3,1)
        );

        Tendik tendik = new Tendik(
                "555666777",
                "Aleimut",
                LocalDate.of(2006,5,17),
                LocalDate.of(2024,7,10),
                4000000,
                "Akademik"
        );

        System.out.println("===== DOSEN TETAP =====");
        dosenTetap.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        dosenTamu.printInfo();

        System.out.println("\n===== TENDIK =====");
        tendik.printInfo();
    }
}