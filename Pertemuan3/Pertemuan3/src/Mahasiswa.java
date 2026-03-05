/* Nama File : Mahasiswa.java 
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa 
 * Pembuat : Adelia Clearesta
 * Tanggal : 5 Maret 2026
*/

import java.util.ArrayList;
public class Mahasiswa {
    /****** ATRIBUT ******/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /****** METHOD ******/

    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor untuk nim
    public String getNim() {
        return nim;
    }

    // selektor untuk nama
    public String getNama() {
        return nama;
    }

    // selektor untuk prodi
    public String getProdi() {
        return prodi;
    }

    // mutator untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // mutator untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mutator untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // mutator untuk dosen wali    
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // mutator untuk kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambahkan mata kuliah ke dalam listMatkul
    public void addMatkul(MataKuliah matkul) {
        listMatkul.add(matkul);
    }

    // Mendapatkan jumlah SKS mata kuliah yang diambil
    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSks += matkul.getSks();
        }
        return totalSks;
    }

    // Mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + nim);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan yang dimiliki : " + kendaraan.getJenis() + " dengan nomor plat " + kendaraan.getNoPlat());
    }
} // end class Mahasiswa