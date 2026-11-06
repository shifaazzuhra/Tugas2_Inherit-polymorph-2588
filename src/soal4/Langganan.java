
package soal4;

/**
 * Menyimpan produk langganan dengan harga berdasarkan durasi.
 */
public class Langganan extends ProdukDigital {
    private int durasiBulan;

    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_DISKON_BULAN = 12;

    /**
     * Membuat produk langganan dengan durasi tertentu.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga langganan per bulan
     * @param ukuranMb ukuran produk digital dalam MB
     * @param durasiBulan lama berlangganan dalam bulan
     * @throws IllegalArgumentException jika data tidak valid
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);

        if (durasiBulan <= 0) {
            throw new IllegalArgumentException(
                "Durasi langganan harus lebih dari 0");
        }

        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga akhir berdasarkan durasi langganan.
     *
     * @return total harga setelah diskon jika memenuhi syarat
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total = total * (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Menampilkan keterangan durasi langganan.
     *
     * @return deskripsi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
