/* Nama File : Persegi.java
 * Deskripsi : berisi atribut dan method dalam class Persegi
 * Pembuat : Adelia Clearesta
 * Tanggal : 22 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    // Konstruktor
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter sisi
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    // Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method abstrak
    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return getJmlSisi()*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(sisi*sisi + sisi*sisi);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang sisi : " + sisi);
    }

    // Method dari interface IResize
    @Override
    public void zoomIn(){
        this.sisi = this.sisi*1.1;
    }

    @Override
    public void zoomOut(){
        this.sisi = this.sisi*0.9;
    }

    @Override
    public void zoom(int percent){
        this.sisi = this.sisi*(percent/100);
    }
}