# JDMCar App

JDMCar adalah aplikasi Android yang menampilkan koleksi mobil JDM (Japanese Domestic Market) legendaris. Aplikasi ini menampilkan informasi penting tentang mobil-mobil ikonik seperti Nissan Skyline, Toyota Supra, dan Mazda RX-7, serta memungkinkan pengguna untuk melihat detail lebih lanjut dari setiap mobil.

## Fitur Utama

- **RecyclerView**: Menampilkan daftar mobil JDM dengan gambar dan nama setiap mobil.
- **Detail Mobil**: Ketika pengguna memilih salah satu mobil dari daftar, aplikasi akan menampilkan detail lebih lanjut tentang mobil tersebut, termasuk spesifikasi dan sejarah.
- **Splash Screen**: Menyambut pengguna dengan tampilan antarmuka awal yang menarik sebelum masuk ke daftar mobil.
- **Desain Responsif**: Antarmuka yang user-friendly dan responsif untuk pengalaman pengguna yang mulus di berbagai ukuran layar.

## Teknologi yang Digunakan

- **Android Studio**: IDE utama untuk pengembangan aplikasi ini.
- **Kotlin**: Bahasa pemrograman yang digunakan untuk menulis aplikasi.
- **RecyclerView**: Menampilkan daftar item mobil dalam format yang efisien dan dapat diskalakan.
- **Intent**: Untuk berpindah antara Activity dari daftar mobil ke tampilan detail.
- **Splash Screen**: Menambahkan pengalaman menarik sebelum aplikasi menampilkan konten utama.

## Struktur Proyek

- `MainActivity.kt`: Mengelola daftar mobil menggunakan `RecyclerView`.
- `DetailActivity.kt`: Menampilkan informasi lebih detail tentang mobil yang dipilih oleh pengguna.
- `SplashActivity.kt`: Tampilan splash screen saat aplikasi dimulai.
- `res/layout/activity_main.xml`: Desain tampilan utama yang memuat daftar mobil.
- `res/layout/activity_detail.xml`: Desain tampilan detail mobil.
- `res/values/strings.xml`: Menyimpan string yang digunakan dalam aplikasi, termasuk deskripsi mobil.

## Daftar Mobil yang Ditampilkan

1. **Nissan Skyline GT-R R34**
2. **Toyota Supra MK4**
3. **Mazda RX-7 FD**
4. **Honda NSX**
5. **Mitsubishi Lancer Evolution VI**
6. **Subaru Impreza WRX STI**
7. **Nissan Silvia S15**
8. **Toyota AE86 Trueno**
9. **Mazda MX-5 Miata**
10. **Honda S2000**
11. **Nissan Skyline GT-R R32**

## Instalasi

1. Clone repositori ini:
   ```bash
   git clone https://github.com/tghrsyahptra/jdm-galery.git
