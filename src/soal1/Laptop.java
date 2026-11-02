package soal1;

/**
 * Merepresentasikan laptop sebagai turunan dari Perangkat.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat laptop dengan spesifikasi dan garansi.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan masa garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diskon.
     *
     * @param diskonPersen persentase diskon
     * @return harga laptop setelah diskon
     */
    public double hitungHargaPromo(double diskonPersen) {
        return harga - (harga * diskonPersen / 100);
    }

    /**
     * Menampilkan informasi laptop beserta spesifikasinya.
     *
     * @return informasi singkat laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | RAM " + ramGb + " GB"
                + " | layar " + ukuranLayarInci + " inci";
    }
}
