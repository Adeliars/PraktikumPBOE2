/* Nama File : Kendaraan.java 
 * Deskripsi : berisi atribut dan method dalam class Kendaraan 
 * Pembuat : Adelia Clearesta
 * Tanggal : 5 Maret 2026
*/

public class Kendaraan {
    /****** ATRIBUT ******/
    private String noPlat;
    private String jenis;

    /****** METHOD ******/
    // konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // konstruktor dengan parameter 
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // selektor untuk noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // selektor untuk jenis
    public String getJenis() {
        return jenis;
    }

    // mutator untuk noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // mutator untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}