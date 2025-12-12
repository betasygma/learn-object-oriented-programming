# 🎬 Movie Recommendation App - Laporan Final Project

| **Mata Kuliah** | **Dosen** | **Periode Pengerjaan** | 
| :-------------: | :-------: | :--------------------: |
| `EF234302` Pemrograman Berorientasi Objek | Fajar Baskoro, S.Kom., M.T. | 25 November—12 Desember 2025 |

<br>

**Anggota Kelompok:**

|           Nama           |    NRP     |  Kelas  | Peran |
| :----------------------: | :--------: | :-----: | :---: |
| Bara Semangat Rohmani    | 5025241144 | PBO (B) | Perencana *Quality Assurance*, Penyusun Dokumentasi & Laporan | 
| Farrel Jatmiko Aji       | 5025241193 | PBO (B) | *Requirement Analysis* & *Research*, Penyusun *Requirement* Program |
| Muhammad Akhdan Alwaafy  | 5025241223 | PBO (B) | *Main Programmer* (Implemetasi & *Coding*), *GUI Development*, Integrasi & *Testing* |

<br>

## 📖 Deskripsi Program

Aplikasi *Movie Recommendation App* adalah aplikasi berbasis Java (GUI Swing) yang memberikan rekomendasi film secara personal kepada pengguna berdasarkan kemiripan rating dengan pengguna lain. Algoritma utama yang digunakan adalah *cosine similarity*, dan data pengguna serta film dikelola menggunakan struktur data Heap (`MaxHeap`) dan koleksi Java.

Fitur utama aplikasi:

- Rekomendasi film untuk *user target* (dari file CSV)
- Simulasi *dummy user*: pengguna dapat memberi *rating* pada film acak dan mendapatkan rekomendasi
- Tampilan GUI interaktif berbasis Java Swing

<br>

## 🔗 Link Source Code & Video

- **Source code:** [repositori Github](./movie-recommendation-app/)
- **Video demonstrasi:** [video YouTube]()

<br>

## 🗂️ Struktur File & Rancangan Class

### Struktur File Utama

```
movie-recommendation-app/
├── GUI.java           # Main GUI aplikasi (Java Swing)
├── MaxHeap.java       # Struktur data heap untuk ranking kemiripan
├── Movie.java         # Representasi data film
├── Recommender.java   # Logika utama rekomendasi & similarity
├── User.java          # Representasi data user & rating
├── movies.csv         # Data film
├── main_data.csv      # Data rating user (user x movie)
└── target_user.csv    # Data user target
```

### Rancangan Class (Ringkasan)

- **GUI**: Menyediakan tampilan utama, input pengguna, dan menampilkan hasil rekomendasi.
- **Recommender**: Menghitung kemiripan antarpengguna (*cosine similarity*), memilih pengguna paling mirip, dan menghasilkan rekomendasi film.
- **User**: Menyimpan ID pengguna, *rating* film, dan skor kemiripan.
- **Movie**: Menyimpan ID, judul, dan genre film.
- **MaxHeap**: *Heap* untuk mengurutkan pengguna berdasarkan skor kemiripan.

<br>

## 🖼️ Tangkap Layar & Penjelasan

Tampilan utama aplikasi Movie Recommendation App (GUI Java Swing), terdiri dari tab rekomendasi untuk *target user* (`Existing User`) dan *dummy user* (`New User`). Berikut beberapa tampilan dan uji coba aplikasi.

| No | Gambar | Penjelasan |
|:--:|:------:|:----------:|
| 1  | ![](./screenshots/screenshot1.jpeg) | Simulasi *target user*: pengguna memilih `user`, menekan tombol `SHOW RECOMMENDS`, lalu mendapatkan rekomendasi film. |
| 2  | ![](./screenshots/screenshot2.jpeg) | Simulasi *dummy user*: pengguna memilih/mengisi *rating* pada beberapa film acak, lalu mendapatkan rekomendasi film. |
| 3  | ![](./screenshots/screenshot3.jpeg) | Contoh pesan *error*/validasi jika data tidak lengkap atau input tidak valid. |

<br>

## 📝 Penutup

*Final Project* ini membuktikan bahwa konsep OOP, algoritma *similarity*, dan struktur *data heap* dapat diintegrasikan dalam aplikasi nyata berbasis Java GUI. Pengembangan aplikasi ini melatih pemahaman kami tentang desain *class*, pengolahan data koleksi, serta pembuatan antarmuka pengguna (UI) yang interaktif. Jika ada kekurangan atau *bug*, silakan sampaikan masukan untuk pengembangan lebih lanjut. Terima kasih telah membaca laporan ini!
