
package soal3;

/**
 * Menguji composition, constructor overloading, dan aliasing.
 */
public class TesSoal3 {

    /**
     * Menjalankan pengujian titik dan garis.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        Garis g = new Garis(0, 0, 3, 4);
        System.out.println(g + " panjang=" + g.getPanjang());

        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5));

        t.setX(100);
        System.out.println(g2);
    }
}
