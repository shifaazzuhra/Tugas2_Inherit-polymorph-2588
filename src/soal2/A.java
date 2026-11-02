package soal2;

/**
 * Class induk untuk menguji pemanggilan method dari constructor.
 */
public class A {

    /**
     * Membuat objek A dan memanggil method init().
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Menampilkan proses inisialisasi class A.
     */
    public void init() {
        System.out.println("init A");
    }
}
