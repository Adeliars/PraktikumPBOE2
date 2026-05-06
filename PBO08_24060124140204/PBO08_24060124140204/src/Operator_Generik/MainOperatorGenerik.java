/* Nama File : MainOperatorGenerik.java
 * Deskripsi : Aplikasi prosedur Tukar dan fungsi Bobot2
 * Pembuat   : Adelia Clearesta
 * NIM       : 24060124140204
 * Tanggal   : 6 Mei 2026
 */

package Operator_Generik;

import Anabul.Anabul;
import Anabul.Anjing;
import Anabul.Anggora;
import Anabul.Datum;
import Anabul.Kembangtelon;
import Anabul.Kucing;

public class MainOperatorGenerik {
    public static void main(String[] args) {

        System.out.println("=== TUKAR INTEGER ===");
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        System.out.println("Sebelum tukar:");
        System.out.println("angka1 = " + angka1.getIsi());
        System.out.println("angka2 = " + angka2.getIsi());

        OperatorGenerik.tukar(angka1, angka2);

        System.out.println("Setelah tukar:");
        System.out.println("angka1 = " + angka1.getIsi());
        System.out.println("angka2 = " + angka2.getIsi());


        System.out.println("\n=== TUKAR STRING ===");
        Datum<String> kata1 = new Datum<>("Adel");
        Datum<String> kata2 = new Datum<>("Cantik");

        System.out.println("Sebelum tukar:");
        System.out.println("kata1 = " + kata1.getIsi());
        System.out.println("kata2 = " + kata2.getIsi());

        OperatorGenerik.tukar(kata1, kata2);

        System.out.println("Setelah tukar:");
        System.out.println("kata1 = " + kata1.getIsi());
        System.out.println("kata2 = " + kata2.getIsi());


        System.out.println("\n=== TUKAR KELUARGA ANABUL ===");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Meong", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Guguk"));

        System.out.println("Sebelum tukar:");
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        OperatorGenerik.tukar(hewan1, hewan2);

        System.out.println("Setelah tukar:");
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());


        System.out.println("\n=== FUNGSI GENERIK BOBOT2 ===");
        Anggora a1 = new Anggora("Aleimup", 4.2);
        Kembangtelon k1 = new Kembangtelon("Zaimut", 3.5);

        double totalBobot = OperatorGenerik.Bobot2(a1, k1);

        System.out.println("Kucing pertama = " + a1);
        System.out.println("Kucing kedua   = " + k1);
        System.out.println("Total bobot    = " + totalBobot + " kg");
    }
}