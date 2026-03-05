/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Adelia Clearesta
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    /**************** ATRIBUT ******************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

     /**************** KONSTRUKTOR ******************/

    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

     /**************** METHOD ******************/
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mengembalikan kuadran tempat titik berada
    double getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; // Titik berada di sumbu atau di titik asal
        }
    }

    // Menghitung jarak antara dua titik
    double getJarak(Titik T){
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Menghitung jarak dari titik ke pusat koordinat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // Refleksi terhadap sumbu X
    void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi terhadap sumbu Y
    void refleksiY() {
        absis = -absis;
    }

    // Mendapatkan nilai refleksi terhadap sumbu X tanpa mengubah titik asli    
    double getRefleksiX() {
        return -ordinat;
    }

    // Mendapatkan nilai refleksi terhadap sumbu Y tanpa mengubah titik asli
    double getRefleksiY() {
        return -absis;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    // Mencetak jumlah objek Titik yang telah dibuat
    void printCounterTitik() {
        System.out.println("Jumlah Objek Titik = " + counterTitik);
    }
} // end class Titik