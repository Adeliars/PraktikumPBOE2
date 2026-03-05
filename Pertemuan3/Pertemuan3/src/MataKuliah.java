/* Nama File : MataKuliah.java 
 * Deskripsi : berisi atribut dan method dalam class MataKuliah 
 * Pembuat : Adelia Clearesta
 * Tanggal : 5 Maret 2026
*/

public class MataKuliah {
    ///****** ATRIBUT ******/
    private String idMatKul;
    private String nama;
    private Integer sks;

    ///****** METHOD ******/
    // konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // konstruktor dengan parameter 
    public MataKuliah(String idMatKul, String nama, Integer sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // selektor untuk idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // selektor untuk nama
    public String getNama() {
        return nama;
    }

    // selektor untuk sks
    public Integer getSks() {
        return sks;
    }
}
