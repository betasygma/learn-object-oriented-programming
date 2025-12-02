# 📑 Laporan Project – Evaluasi Tengah Semester Gasal 2025/2026  
**Author:** Bara Semangat Rohmani (NRP 5025241144)  

<br>

## 📌 Project Overview  
Project ini berfokus pada pembuatan **Simulasi Vending Snack Machine** menggunakan bahasa pemrograman **Java** di lingkungan **BlueJ**.  

Aplikasi ini mensimulasikan mesin penjual otomatis yang dapat:  
1. Menampilkan daftar produk (snack & minuman).  
2. Memproses pemilihan produk oleh pengguna.  
3. Menghitung dan memverifikasi pembayaran.  
4. Mengeluarkan produk serta memberikan kembalian.  
5. Menyimpan log transaksi.  
6. Memberikan peringatan jika stok produk menipis agar admin melakukan refill.  
7. Menyediakan menu admin untuk melihat laporan transaksi dan mengisi ulang stok.  

👉 Program ini diimplementasikan dengan konsep **Object-Oriented Programming (OOP)**: class, object, inheritance, encapsulation, dan penggunaan koleksi (`ArrayList`).  

👉 Link kode (struktur file BlueJ):  
- [`Product.java`](Product.java)
- [`Inventory.java`](Inventory.java)
- [`Transaction.java`](Transaction.java)
- [`TransactionLog.java`](TransactionLog.java)
- [`PaymentProcessor.java`](PaymentProcessor.java)
- [`VendingMachine.java`](VendingMachine.java)
- [`VendingSim.java`](VendingSim.java)

👉 Simulasi dijalankan melalui **BlueJ Terminal/Console**.

👉 Tautan video penjelasan: [YouTube](https://youtu.be/jvncUS8oN1M)

---

<br>

## 🎯 Objectives  
- Membuat aplikasi simulasi mesin penjual otomatis berbasis **OOP**.  
- Melatih penggunaan **class diagram** dan **object diagram** untuk perancangan sistem.  
- Mengimplementasikan **ArrayList** untuk manajemen koleksi produk dan transaksi.  
- Menggunakan **encapsulation** dan **method interaction** antar objek.  
- Menyediakan fitur **admin console** untuk refill stok dan laporan transaksi.  

---

<br>

## 🛠️ Technologies Used  
- **Java (BlueJ IDE)** → implementasi OOP dan simulasi.  
- **ArrayList** → menyimpan produk dan transaksi.  
- **Scanner** → input dari pengguna.  
- **System.out** → output simulasi ke console.  

---

<br>

## 🚀 Features Implemented  
1. **Menu Produk**: menampilkan daftar snack & minuman dengan harga dan stok.  
2. **Pembelian Produk**: pengguna memilih produk berdasarkan ID.  
3. **Pembayaran**: menerima input uang bertahap hingga mencukupi harga.  
4. **Keluaran Produk & Kembalian**: produk dikeluarkan, kembalian dihitung otomatis.  
5. **Log Transaksi**: setiap pembelian dicatat dengan detail (produk, harga, uang masuk, kembalian, timestamp).  
6. **Peringatan Stok Rendah**: sistem memberi notifikasi jika stok ≤ batas minimum.  
7. **Admin Console**:  
   - Melihat laporan transaksi.  
   - Melakukan refill produk berdasarkan ID.  

---

<br>

## 📚 Screenshots

| Test Case | Gambar | Deskripsi |
| --- | :----: | :-------: |
|  1. Tampilan Awal | ![](./screenshots/1_startup.png) | Menampilkan tampilan awal dengan menjalankan `VendingSim.main` untuk menampilkan menu utama: 1) Buy  2) Admin  0) Exit. |
|  2. Daftar Produk | ![](./screenshots/2_productlist.png) | Menampilkan daftar produk dengan memilih opsi `1) Buy` untuk menampilkan produk dengan ID, nama, harga, dan stok. |
|  3. Pembelian Berhasil (langsung cukup) | ![](./screenshots/3_success.png) | Melakukan pembelian produk dengan memasukkan ID dan uang yang sama atau lebih besar dari harga untuk mengeluarkan produk dan menampilkan kembalian. |
|  4. Pembelian Berhasil (bertahap) | ![](./screenshots/4_partialpayment.png) | Melakukan pembelian produk dengan memasukkan uang bertahap hingga total pembayaran mencukupi untuk mengeluarkan produk. |
|  5. Peringatan Stok Rendah | ![](./screenshots/5_lowstock.png) | Menampilkan peringatan stok menipis dengan membeli produk hingga stok ≤ minStock untuk memicu pesan refill. |
|  6. Stok Habis | ![](./screenshots/6_outofstock.png) | Menampilkan pesan stok habis dengan memilih ID produk yang stoknya sudah 0 untuk mencegah pembelian. |
|  7. Membatalkan Pembelian | ![](./screenshots/7_cancel.png) | Membatalkan pembelian dengan memasukkan ID `0` saat diminta memilih produk untuk kembali ke menu utama. |
|  8. Opsi Tidak Dikenal (Menu Utama) | ![](./screenshots/8_unknownoption.png) | Menampilkan pesan error dengan memasukkan angka selain 0,1,2 di menu utama untuk menangani input tidak valid. |
|  9. ID Produk Tidak Ditemukan | ![](./screenshots/9_invalidid.png) | Menampilkan pesan produk tidak ditemukan saat memasukkan ID yang tidak tersedia untuk mencegah pembelian. |
| 10. Input Uang Tidak Valid | ![](./screenshots/10_invalidmoney.png) | Menampilkan pesan error dengan memasukkan nilai negatif atau huruf saat pembayaran untuk validasi input. |
| 11. Input Uang Desimal | ![](./screenshots/11_decimalmoney.png) | Melakukan pembelian produk dengan memasukkan  uang dalam bentuk desimal. |
| 12. Admin Login Gagal | ![](./screenshots/12_wrongadminpw.png) | Menampilkan pesan gagal login dengan memilih opsi `2) Admin` dan memasukkan password yang salah untuk mencegah akses admin. |
| 13. Admin Login Berhasil | ![](./screenshots/13_adminmenu.png) | Menampilkan menu admin dengan memilih opsi `2) Admin` dan memasukkan password benar untuk mengakses fitur admin. |
| 14. Laporan Transaksi | ![](./screenshots/14_admintransactionreport.png) | Menampilkan laporan transaksi dengan memilih opsi `1` di menu admin untuk melihat daftar transaksi dan total penjualan. |
| 15. Refill Produk | ![](./screenshots/15_adminrefill.png) | Melakukan refill produk dengan memilih opsi `2` di menu admin dan memasukkan ID serta jumlah refill untuk menambah stok. |
| 16. Kembali dari Menu Admin | ![](./screenshots/16_adminback.png) | Kembali ke menu utama dengan memilih opsi `0` di menu admin untuk keluar dari admin console. |
| 17. Opsi Tidak Dikenal (Menu Admin) | ![](./screenshots/17_adminunknownoption.png) | Menampilkan pesan error dengan memasukkan angka selain 0,1,2 di menu admin untuk menangani input tidak valid. |
| 18. Refill Produk Gagal | ![](./screenshots/18_adminrefillfail.png) | Menampilkan pesan gagal refill dengan memasukkan ID produk yang tidak tersedia untuk mencegah perubahan stok. |
| 19. Keluar Program | ![](./screenshots/19_exit.png) | Keluar dari program dengan memilih opsi `0` di menu utama untuk menampilkan pesan akhir |

---

<br>

## 📚 Lessons Learned  
- Pentingnya **perancangan class diagram** sebelum coding agar relasi antar class jelas.  
- Cara menggunakan **ArrayList** untuk menyimpan dan mengelola data dinamis.  
- Pentingnya **validasi input** (misalnya pengecekan index dan parsing angka).  
- Implementasi **encapsulation** untuk menjaga agar field hanya bisa diakses lewat method.  
- Penggunaan **polymorphism sederhana** (misalnya objek `Product` dalam `ArrayList`).  
- Teknik debugging di BlueJ menggunakan **breakpoint** dan **step into** untuk melacak alur eksekusi.  

---

<br>

## 📝 Reflection  
Saya belajar bahwa membangun aplikasi berbasis OOP membutuhkan **pembagian tanggung jawab class yang jelas**. Dengan memisahkan `Product`, `Inventory`, `Transaction`, dan `VendingMachine`, kode menjadi lebih mudah dipahami, diuji, dan dikembangkan.  
Saya juga menyadari bahwa detail kecil seperti **validasi input pengguna, pesan error yang jelas, dan log transaksi** sangat berpengaruh pada pengalaman simulasi.  
Dengan project ini, saya semakin memahami bagaimana konsep **abstraction, encapsulation, object interaction, dan collection** dapat diterapkan dalam kasus nyata.  
