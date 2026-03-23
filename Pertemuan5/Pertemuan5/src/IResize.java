/* Nama File : IResize.java
 * Deskripsi : berisi method dalam interface IResize
 * Pembuat : Adelia Clearesta
 * Tanggal : 19 Maret 2026
 */

public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Mengskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
    
} 