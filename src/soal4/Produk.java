
package soal4;

/**
 * Menyimpan informasi dasar produk pada toko digital.
 */
public class Produk {
    private String kode;
    private String nama;
    protected double hargaDasar;

    /**
     * Membuat produk dengan kode, nama, dan harga dasar.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika data produk tidak valid
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Menghitung harga akhir produk.
     *
     * @return harga dasar produk
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Menampilkan keterangan jenis produk.
     *
     * @return deskripsi produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
