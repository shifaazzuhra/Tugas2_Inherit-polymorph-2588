## Soal 1 - Hierarki Perangkat Elektronik

Program ini menerapkan inheritance melalui class Perangkat, Laptop, Ponsel, dan LaptopGaming.

### Pengujian Hak Akses

Ketika atribut `harga` pada class Perangkat diubah dari `protected` menjadi `private`, muncul error saat kompilasi:

```text
src\soal1\Laptop.java:33: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
               ^
src\soal1\Laptop.java:33: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
                        ^
2 errors
```

Error terjadi karena atribut private tidak bisa diakses langsung oleh subclass. Sementara itu, method `hitungHargaPromo()` dalam class Laptop menggunakan atribut harga secara langsung.

Setelah harga dikembalikan menjadi protected, program berhasil dikompilasi dan dijalankan.

## Soal 2 - Analisis Output dan Polimorfisme

### Bagian A - Prediksi Output

Sebelum menjalankan program, saya memprediksi bahwa constructor Hewan akan dipanggil sebelum constructor Kucing.

Awalnya saya memperkirakan method `makan()` akan memanggil `suara()` milik Hewan, kemudian `suara()` berikutnya milik Kucing.

Saya juga memperkirakan casting objek Hewan ke Kucing dapat dilakukan dan menampilkan "Generik memanjat".

### Bagian A - Hasil dan Analisis

Saat program dijalankan, constructor Hewan dipanggil sebelum constructor Kucing. Method `makan()` mencetak "Tom makan", kemudian memanggil `suara()` milik Kucing, sehingga muncul "meong" dua kali.

Pemanggilan `h.panjat()` menghasilkan error `cannot find symbol` saat kompilasi karena tipe statis h adalah Hewan, sedangkan method `panjat()` hanya dimiliki Kucing.

`ClassCastException` terjadi pada baris `Kucing k2 = (Kucing) h2` karena h2 sebenarnya merupakan objek Hewan, bukan Kucing. Masalah ini diperbaiki menggunakan `instanceof` untuk memeriksa tipe objek sebelum melakukan downcasting.

Pada `h.makan()`, method `suara()` yang dijalankan adalah milik Kucing. Tipe statis h adalah Hewan, tetapi tipe dinamisnya Kucing, sehingga Java menggunakan method yang sudah di-override oleh Kucing.

### Bagian B - Prediksi Output

Sebelum dijalankan, saya memperkirakan output `new B()` adalah:

```text
A dibuat
init B, nilai=5
B dibuat, nilai=5
```

Saya mengira nilai yang muncul adalah 5 karena atribut `nilai` pada class B sudah diisi dengan angka 5.

### Bagian B - Hasil dan Analisis

Hasil program:

```text
A dibuat
init B, nilai=0
B dibuat, nilai=5
```

Prediksi awal saya berbeda dengan hasil program. Awalnya saya mengira nilai sudah berisi 5, ternyata saat `init()` dipanggil dari constructor A, atribut milik B belum diinisialisasi sehingga masih bernilai 0.

Setelah constructor A selesai, nilai baru diinisialisasi menjadi 5. Karena itu, memanggil method yang bisa di-override dari constructor cukup berisiko jika method tersebut menggunakan atribut yang belum siap.

### Bagian C - Lingkaran dan Titik

Hasil program:

```text
78.53981633974483
0.0
0.0
```

Nilai `l3.luas()` menghasilkan 0.0 karena objek yang dibuat sebenarnya adalah Titik, walaupun tipe variabelnya Lingkaran. Java menjalankan method `luas()` milik Titik karena method tersebut sudah di-override.

Menurut saya, hubungan Titik sebagai turunan Lingkaran kurang tepat jika dilihat dari relasi *is-a*, karena titik bukanlah sebuah lingkaran. Jika ada method yang menganggap semua Lingkaran memiliki luas lebih dari nol, penggunaan objek Titik bisa menyebabkan hasil perhitungan tidak sesuai dengan asumsi tersebut.


## Soal 3 - Titik dan Garis

### Prediksi Output

Sebelum menjalankan program, saya memprediksi
output baris kedua adalah:

```text
(100.0, 1.0) - (5.0, 5.0)
```

Saya memperkirakan titik awal garis ikut berubah
karena objek Garis menggunakan referensi Titik
yang sama dengan variabel t.


### Hasil Pengujian dan Analisis

Sebelum menggunakan defensive copy, output baris kedua adalah:

```text
(100.0, 1.0) - (5.0, 5.0)
```

Hasil ini sesuai dengan prediksi saya. Titik awal berubah
karena objek Garis dan variabel t menggunakan referensi
objek Titik yang sama. Kondisi ini disebut aliasing.

Setelah constructor Garis diperbaiki menggunakan defensive
copy, output berubah menjadi:

```text
(1.0, 1.0) - (5.0, 5.0)
```

Perubahan pada variabel t sekarang tidak memengaruhi
titik awal Garis karena objek Titik sudah disalin.

### Perbandingan Sebelum dan Sesudah Perbaikan

Sebelum defensive copy lebih cocok digunakan ketika
perubahan titik memang ingin langsung memengaruhi garis,
misalnya pada aplikasi menggambar yang interaktif.

Setelah defensive copy lebih cocok ketika data garis harus
tetap konsisten meskipun objek titik dari luar berubah.

### Inheritance dan Composition

Jika Garis menggunakan extends Titik, hubungan antarclass
menjadi kurang tepat karena Garis bukan merupakan sebuah
Titik. Garis justru memiliki dua titik, yaitu titik awal
dan titik akhir.

Karena itu, composition dengan relasi has-a lebih sesuai
daripada inheritance dengan relasi is-a.
