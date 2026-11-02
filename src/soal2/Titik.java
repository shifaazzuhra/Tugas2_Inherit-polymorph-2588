package soal2;

/**
 * Merepresentasikan titik sebagai lingkaran
 * dengan jari-jari nol untuk pengujian inheritance.
 */
public class Titik extends Lingkaran {

    /**
     * Membuat titik dengan jari-jari nol.
     */
    public Titik() {
        super(0);
    }

    /**
     * Mengembalikan luas titik.
     *
     * @return luas titik yaitu 0.0
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling titik.
     *
     * @return keliling titik yaitu 0.0
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}
