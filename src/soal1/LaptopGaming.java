package soal1;

/**
 * Merepresentasikan laptop gaming sebagai turunan dari Laptop.
 */
public class LaptopGaming extends Laptop {
    private String kartuGrafis;

    private static final int TAMBAHAN_GARANSI = 6;

    /**
     * Membuat laptop gaming dengan tambahan garansi.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi awal
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis jenis kartu grafis
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI,
              ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menampilkan informasi laptop gaming beserta GPU.
     *
     * @return informasi singkat laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
