
package soal4;

/**
 * Merepresentasikan produk digital dengan diskon khusus.
 */
public class ProdukDigital extends Produk {
    private double ukuranMb;

    private static final double DISKON_DIGITAL = 0.10;

    /**
     * Membuat produk digital dengan ukuran file tertentu.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran file dalam MB
     * @throws IllegalArgumentException jika data produk tidak valid
     */
    public ProdukDigital(String kode, String nama, double hargaDasar,
                         double ukuranMb) {
        super(kode, nama, hargaDasar);

        if (ukuranMb < 0) {
            throw new IllegalArgumentException(
                "Ukuran file tidak boleh negatif");
        }

        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir setelah diskon digital.
     *
     * @return harga setelah diskon 10 persen
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar * (1 - DISKON_DIGITAL);
    }

    /**
     * Menampilkan keterangan ukuran produk digital.
     *
     * @return deskripsi produk digital
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
