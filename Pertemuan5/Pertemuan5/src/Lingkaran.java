/* Nama File : Lingkaran.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat : Adelia Clearesta
 * Tanggal : 19 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    // Konstruktor
    public Lingkaran(){
        setJmlSisi(0);
    }

    // Konstruktor dengan parameter diameter
    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    // Getter dan Setter
    public double getJari (){
        return jari; 
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    // Method abstrak
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Diameter : " + (jari * 2));
    }

    // Method dari interface IResize
    @Override
    public void zoomIn(){
        this.jari = this.jari*1.1;
    }

    @Override
    public void zoomOut(){
        this.jari = this.jari*0.9;
    }

    @Override
    public void zoom(int percent){
        this.jari = this.jari*(percent/100);
    }
}