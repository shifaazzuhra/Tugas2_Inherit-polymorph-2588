package soal1;

/**
 * Merepresentasikan ponsel sebagai turunan dari Perangkat.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat ponsel dengan informasi dan spesifikasinya.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera ponsel
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menampilkan informasi singkat ponsel.
     *
     * @return informasi merek, garansi, kapasitas, dan kamera
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | " + kapasitasGb + " GB"
                + " | " + jumlahKamera + " kamera";
    }
}
