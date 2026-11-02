package soal2;

/**
 * Menyimpan nama hewan dan perilaku dasarnya.
 */
public class Hewan {
    protected String nama;

    /**
     * Membuat objek hewan.
     *
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Menampilkan suara hewan.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Menampilkan aktivitas makan dan suara hewan.
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
