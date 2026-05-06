/*
Nama        : Adelia Clearesta
NIM         : 24060124140204
Tanggal     : 6 Mei 2026
Deskripsi   : File Class Generik Data
*/

package Larik_Generik;

public class Data<T> {
    private static final int KAPASITAS = 100;
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[KAPASITAS];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > KAPASITAS) {
            System.out.println("Posisi harus antara 1 sampai 100");
            return null;
        }

        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T data) {
        if (posisi < 1 || posisi > KAPASITAS) {
            System.out.println("Posisi harus antara 1 sampai 100");
            return;
        }

        if (ruang[posisi - 1] == null && data != null) {
            banyak++;
        } else if (ruang[posisi - 1] != null && data == null) {
            banyak--;
        }

        ruang[posisi - 1] = data;
    }

    public int getSize() {
        return this.banyak;
    }

    public void printInfo() {
        for (int i = 0; i < KAPASITAS; i++) {
            if (ruang[i] != null) {
                System.out.println("Posisi " + (i + 1) + ": " + ruang[i]);
            }
        }
    }
}