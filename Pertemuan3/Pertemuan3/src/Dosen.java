/* Nama File : Dosen.java 
 * Deskripsi : berisi atribut dan method dalam class Dosen 
 * Pembuat : Adelia Clearesta
 * Tanggal : 5 Maret 2026
*/

public class Dosen {
    /****** ATRIBUT ******/
    private String nip;
    private String nama;
    private String prodi;

    /****** METHOD ******/

    // konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    // selektor untuk nip
    public String getNip() {
        return nip;
    }

    // selektor untuk nama 
    public String getNama(){
        return nama;
    }

    // selektor untuk prodi
    public String getProdi() {
        return prodi;
    }

    // mutator untuk nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mutator untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mutator untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
} 