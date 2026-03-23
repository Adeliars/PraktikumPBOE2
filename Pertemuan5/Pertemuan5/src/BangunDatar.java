/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class BangunDatar
 * Pembuat : Adelia Clearesta
 * Tanggal : 18 Maret 2026
 */

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    
    // Konstruktor
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public BangunDatar() {
    }

    // Getter dan Setter
    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method abstrak
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}