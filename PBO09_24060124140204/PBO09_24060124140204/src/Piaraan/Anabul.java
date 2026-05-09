/* Nama File : Anabul.java
 * Deskripsi : Kelas induk untuk merepresentasikan data anabul
 * Pembuat : Adelia Clearesta
 * NIM     : 24060124140204
 * Tanggal : 7 Mei 2026
 */

package Piaraan;

class Anabul {
    private String panggilan; // Atribut panggilan 
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // Fungsi get dan set untuk nama panggilan
    public String getNama() { 
        return panggilan; 
    }

    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public double getBobot() { 
        return bobot; 
    }
}