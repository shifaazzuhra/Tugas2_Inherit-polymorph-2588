package soal2;

/**
 * Merepresentasikan kucing sebagai turunan dari Hewan.
 */
public class Kucing extends Hewan {

    /**
     * Membuat objek kucing dengan nama tertentu.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Menampilkan suara kucing.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Menampilkan aktivitas kucing saat memanjat.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}
