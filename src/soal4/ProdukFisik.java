
package soal4;

/**
 * Menyimpan informasi produk fisik dan menghitung ongkos kirim.
 */
public class ProdukFisik extends Produk {
    private double beratKg;

    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    /**
     * Membuat produk fisik dengan berat tertentu.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram
     * @throws IllegalArgumentException jika data produk tidak valid
     */
    public ProdukFisik(String kode, String nama, double hargaDasar,
                       double beratKg) {
        super(kode, nama, hargaDasar);

        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif");
        }

        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga akhir termasuk ongkos kirim.
     *
     * @return harga dasar ditambah ongkos kirim
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Menampilkan keterangan berat produk fisik.
     *
     * @return deskripsi produk fisik
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}

