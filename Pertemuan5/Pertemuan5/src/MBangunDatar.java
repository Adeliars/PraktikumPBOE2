public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "Biru", "Putih");
        System.out.println("*****INFORMASI PERSEGI 1*****" ); 
        Persegi1.printInfo();
        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi1 : " + Persegi1.getLuas());
        System.out.println();

        Lingkaran Lingkaran1 = new Lingkaran(21, "Putih", "Hitam");
        System.out.println("*****INFORMASI LINGKARAN 1*****" );
        Lingkaran1.printInfo();
        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
        System.out.println();

        // BangunDatar P1 = new BangunDatar();
        System.out.println("*****INFORMASI PERSEGI P1*****" );
        BangunDatar P1 = new Persegi(10,"Pink","Putih");
        P1.printInfo();
        System.out.println("*****INFORMASI PERSEGI P2*****" );
        Persegi P2 = new Persegi(5,"Biru","Hitam");
        P2.printInfo();
        System.out.println("Apakah luas P1 = luas P2? Jawaban: " + P1.isEqualLuas(P2));
        System.out.println();
        
        System.out.println("*****INFORMASI LINGKARAN L1*****" );
        BangunDatar L1 = new Lingkaran(7,"Pink","Putih");
        L1.printInfo();
        System.out.println("*****INFORMASI LINGKARAN L2*****" );
        Lingkaran L2 = new Lingkaran (7,"Biru","Hitam");
        L2.printInfo();
        System.out.println("Apakah Keliling L1 = Keliling L2? Jawaban: " + L1.isEqualKeliling(L2));
    }
}