package soal2;

/**
 * Menguji inheritance, overriding, dan downcasting.
 */
public class TesSoal2 {

    /**
     * Menjalankan pengujian Soal 2.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();

        // h.panjat();

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");

        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("Objek h2 bukan Kucing, casting dibatalkan");
        }

        // Pengujian Bagian B
        new B();

        
        // Pengujian Bagian C
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
