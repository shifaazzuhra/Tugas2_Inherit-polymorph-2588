
## Soal 1 - Hierarki Perangkat Elektronik

Program ini menerapkan inheritance melalui class Perangkat,
Laptop, Ponsel, dan LaptopGaming.

### Pengujian Hak Akses

Ketika atribut harga pada class Perangkat diubah dari
protected menjadi private, muncul error saat kompilasi:

```text
src\soal1\Laptop.java:33: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
               ^
src\soal1\Laptop.java:33: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
                        ^
2 errors
```

Error terjadi karena atribut private tidak bisa diakses
langsung oleh subclass. Sementara itu, method
hitungHargaPromo() dalam class Laptop menggunakan
atribut harga secara langsung.

Setelah harga dikembalikan menjadi protected,
program berhasil dikompilasi dan dijalankan.
