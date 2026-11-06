
package soal3;

/**
 * Menyimpan koordinat titik pada bidang dua dimensi.
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Membuat titik dengan koordinat (0, 0).
     */
    public Titik() {
        this(0, 0);
    }

    /**
     * Membuat titik dengan koordinat tertentu.
     *
     * @param x koordinat x
     * @param y koordinat y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengambil koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x koordinat x yang baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y koordinat y yang baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak ke titik lain.
     *
     * @param lain titik tujuan
     * @return jarak antara kedua titik
     */
    public double jarakKe(Titik lain) {
        double selisihX = lain.x - this.x;
        double selisihY = lain.y - this.y;

        return Math.sqrt(selisihX * selisihX
                + selisihY * selisihY);
    }

    /**
     * Mengubah koordinat menjadi teks.
     *
     * @return koordinat dalam format (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
