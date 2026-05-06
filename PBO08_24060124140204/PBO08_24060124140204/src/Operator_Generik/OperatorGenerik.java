/* Nama File : OperatorGenerik.java
 * Deskripsi : Kelas operator generik yang berisi prosedur Tukar dan fungsi Bobot2
 * Pembuat   : Adelia Clearesta
 * NIM       : 24060124140204
 * Tanggal   : 6 Mei 2026
 */

package Operator_Generik;

import Anabul.Datum;
import Anabul.Kucing;

public class OperatorGenerik {

    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing, U extends Kucing> double Bobot2(T kucing1, U kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}