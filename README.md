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