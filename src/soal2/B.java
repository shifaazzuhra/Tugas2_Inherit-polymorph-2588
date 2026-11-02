package soal2;

/**
 * Class turunan A untuk menguji overriding saat constructor berjalan.
 */
public class B extends A {
    int nilai = 5;

    /**
     * Membuat objek B setelah constructor A dijalankan.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Menampilkan nilai saat proses inisialisasi.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
