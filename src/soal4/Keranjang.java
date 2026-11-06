
package soal4;

import java.util.ArrayList;

/**
 * Menyimpan produk dan menghitung total belanja.
 */
public class Keranjang {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke dalam keranjang.
     *
     * @param produk produk yang ditambahkan
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException jika kode produk sudah ada
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }

        for (Produk p : daftarProduk) {
            if (p.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                    "Kode produk " + produk.getKode() + " sudah ada");
            }
        }

        daftarProduk.add(produk);
    }

    /**
     * Menghitung jumlah harga semua produk.
     *
     * @return total belanja
     */
    public double hitungTotal() {
        double total = 0;

        for (Produk p : daftarProduk) {
            total += p.hitungHargaAkhir();
        }

        return total;
    }

    /**
     * Mencetak daftar produk beserta total harga.
     */
    public void cetakStruk() {
        for (Produk p : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                p.getKode(),
                p.getNama(),
                p.deskripsi(),
                p.hitungHargaAkhir());
        }

        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah produk berdasarkan jenisnya.
     */
    public void hitungPerJenis() {
        int fisik = 0;
        int digital = 0;
        int langganan = 0;

        for (Produk p : daftarProduk) {
            if (p instanceof Langganan) {
                Langganan item = (Langganan) p;
                if (item != null) {
                    langganan++;
                }
            } else if (p instanceof ProdukFisik) {
                ProdukFisik item = (ProdukFisik) p;
                if (item != null) {
                    fisik++;
                }
            } else if (p instanceof ProdukDigital) {
                ProdukDigital item = (ProdukDigital) p;
                if (item != null) {
                    digital++;
                }
            }
        }

        System.out.println("Fisik: " + fisik
            + ", Digital: " + digital
            + ", Langganan: " + langganan);
    }
}
