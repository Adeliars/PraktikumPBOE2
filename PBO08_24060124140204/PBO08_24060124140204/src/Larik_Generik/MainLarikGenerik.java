/*
Nama        : Adelia Clearesta
NIM         : 24060124140204
Tanggal     : 6 Mei 2026
Deskripsi   : Main untuk aplikasi Larik Generik
*/

package Larik_Generik;

import Anabul.Anabul;
import Anabul.Anjing;
import Anabul.Anggora;
import Anabul.Burung;
import Anabul.Kembangtelon;
import Anabul.Kucing;

public class MainLarikGenerik {
    public static void main(String[] args) {

        System.out.println("=== LARIK GENERIK UNTUK KELUARGA ANABUL ===");

        Data<Anabul> dataAnabul = new Data<>();

        Anabul anabul1 = new Kucing("Ale", 2.5);
        Anabul anabul2 = new Anggora("Ela", 4.2);
        Anabul anabul3 = new Kembangtelon("Lea", 3.5);
        Anabul anabul4 = new Anjing("Zai");
        Anabul anabul5 = new Burung("Jedan");

        System.out.println("\n=== Aplikasi setIsi ===");
        dataAnabul.setIsi(1, anabul1);
        dataAnabul.setIsi(2, anabul2);
        dataAnabul.setIsi(3, anabul3);
        dataAnabul.setIsi(4, anabul4);
        dataAnabul.setIsi(5, anabul5);

        System.out.println("\n=== Aplikasi getIsi ===");
        System.out.println("Isi posisi 1 = " + dataAnabul.getIsi(1));
        System.out.println("Isi posisi 2 = " + dataAnabul.getIsi(2));
        System.out.println("Isi posisi 3 = " + dataAnabul.getIsi(3));
        System.out.println("Isi posisi 4 = " + dataAnabul.getIsi(4));
        System.out.println("Isi posisi 5 = " + dataAnabul.getIsi(5));

        System.out.println("\n=== Aplikasi getSize ===");
        System.out.println("Banyak elemen efektif = " + dataAnabul.getSize());

        System.out.println("\n=== Print Semua Isi Larik ===");
        dataAnabul.printInfo();
        
    }
}