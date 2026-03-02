/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class Garis
 * Pembuat      : Adelia Clearesta
 * Tanggal      : 28 Februari 2026
 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Selektor dan Mutator

    // Getter untuk titikAwal
    public Titik getTitikAwal() { 
        return titikAwal; 
    }

    // Setter untuk titikAwal
    public void setTitikAwal(Titik awal) { 
        this.titikAwal = awal; 
    }

    // Getter untuk titikAkhir
    public Titik getTitikAkhir() { 
        return titikAkhir; 
    }

    // Setter untuk titikAkhir
    public void setTitikAkhir(Titik akhir) { 
        this.titikAkhir = akhir; 
    }

    // Getter untuk counterGaris
    public static int getCounterGaris() { 
        return counterGaris; 
    }

    // Method Operasional

    // Menghitung panjang garis menggunakan jarak antara titikAwal dan titikAkhir
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / 
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Menghitung titik tengah garis
    public Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, 
                         (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // Mengecek apakah garis ini sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis ini tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Mencetak informasi garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print(" ke ");
        titikAkhir.printTitik();
    }

    // Mendapatkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}