package soal2;

/**
 * Menghitung luas dan keliling lingkaran.
 */
public class Lingkaran {
    private double jariJari;

    /**
     * Membuat lingkaran berdasarkan jari-jari.
     *
     * @param jariJari jari-jari lingkaran
     * @throws IllegalArgumentException jika jari-jari negatif
     */
    public Lingkaran(double jariJari) {
        if (jariJari < 0) {
            throw new IllegalArgumentException(
                "Jari-jari tidak boleh negatif");
        }
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
