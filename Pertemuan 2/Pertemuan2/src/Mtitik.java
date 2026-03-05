/* Nama File    : Mtitik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Adelia Clearesta
 * Tanggal      : 19 Februari 2026
 */

public class Mtitik {
    public static void main(String[] args) {

        // Set absis dan ordinat titik T1
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3);       // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);     // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // Mencetak koordinat T1 ke layar
        
        // Menggeser titik T1 sejauh (3,4)
        T1.geser(3, 4);    // Menggeser T1 sejauh (3,4)
        T1.printTitik();        // Menampilkan koordinat T1 setelah digeser 
        
        // Membuat objek Titik T2 yang merujuk ke T1
        Titik T2 = T1;
        T2.printTitik();        // Menampilkan koordinat T2
        
        // Mengubah koordinat T1 dan melihat pengaruhnya pada T2
        T1.setAbsis(10);        
        T1.setOrdinat(10);
        T2.printTitik();        // Menampilkan koordinat T2 setelah T1 diubah

        // Membuat objek Titik T3
        Titik T3 = new Titik(); 
        T3.printTitik();        // Menampilkan koordinat T3

        // Membuat objek Titik T4
        Titik T4 = new Titik(3,5); 
        T4.printTitik();        // Menampilkan koordinat T4

        // Menampilkan kuadran dari T1, T2, T3, dan T4
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        System.out.println("Kuadran T4: " + T4.getKuadran());

        // Menampilkan Jarak T1 ke T4
        System.out.println("Jarak T1 ke T4: " + T1.getJarak(T4));

        // Menampilkan Jarak T2 ke Titik Pusat (0,0)
        System.out.println("Jarak T2 ke Titik Pusat: " + T2.getJarakPusat());

        // Menampilkan refleksi T4 terhadap sumbu X
        T4.refleksiX();
        T4.printTitik();

        // Menampilkan refleksi T4 terhadap sumbu Y
        T4.refleksiY();
        T4.printTitik();

        // Mendapat dan menampilkan nilai refleksi T4 terhadap sumbu X tanpa mengubah titik asli
        System.out.println("Refleksi T4 terhadap sumbu X: " + T4.getRefleksiX());

        // Mendapat dan menampilkan nilai refleksi T4 terhadap sumbu Y tanpa mengubah titik asli
        System.out.println("Refleksi T4 terhadap sumbu Y: " + T4.getRefleksiY());

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());        
    }
}