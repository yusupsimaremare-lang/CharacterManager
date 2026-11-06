# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi Project

Character Manager adalah program sederhana berbasis Java yang digunakan untuk membuat dan mengelola data karakter. Project ini dibuat untuk memenuhi tugas TP3 dengan menerapkan konsep Object-Oriented Programming (OOP), seperti encapsulation, constructor, getter, setter, dan enum.

Pada project ini juga ditambahkan fitur mana, validasi mana, dan pengecekan status hidup karakter menggunakan method `isAlive()`.

## Fitur Program

1. Membuat karakter dengan nama, jenis, dan level.
2. Menggunakan dua constructor.
3. Menggunakan atribut private (encapsulation).
4. Menghitung HP dan attack berdasarkan level.
5. Menampilkan informasi karakter menggunakan `toString()`.
6. Melakukan level up karakter.
7. Menambahkan atribut mana.
8. Memvalidasi agar mana tidak bernilai negatif.
9. Memeriksa status hidup karakter menggunakan `isAlive()`.

## Screenshot Output Program

Berikut adalah bukti hasil program Character Manager yang dijalankan melalui terminal VS Code.

![Screenshot Output Character Manager](![alt text](image.png)

*Catatan: Simpan screenshot terminal di folder `CharacterManager/screenshot/` dengan nama `output.png`.*

## Struktur Folder Project

```text
javavisual-tp03
│
├── README.md
│
└── CharacterManager/
    ├── src/
    │   └── com/
    │       └── unpri/
    │           └── charactermanager/
    │               ├── Main.java
    │               └── model/
    │                   ├── Character.java
    │                   └── CharacterType.java
    │
    └── screenshot/
        └── output.png
```

## Teknologi yang Digunakan

- Bahasa Pemrograman: Java
- JDK: JDK 17 (sesuaikan dengan JDK yang digunakan)
- Code Editor: Visual Studio Code
- Version Control: Git dan GitHub

## Identitas Mahasiswa

- Nama Lengkap: [Yusup Aritonang]
- NIM: [253303621294]
- Kelas: [3pagib]
- Mata Kuliah: Java Visual SIH-6406
- Tugas: TP3 — Character Manager Sprint #1

## Dokumentasi Analisis (Bagian D)

Link Google Docs:

[https://docs.google.com/document/d/12jpQKsBpTNQYiyN0xItB5gu7oqW-SOBU/edit?usp=drive_link&ouid=117130834806065707688&rtpof=true&sd=trueI]

---

**Character Manager — TP3**

Dibuat untuk memenuhi tugas praktikum Java Visual SIH-6406.




#CHARACTER MANAGER — TP5 (Java Visual SIH-6406)
1. Deskripsi Project
Character Manager merupakan project pemrograman Java yang dibuat untuk memenuhi tugas TP5 AP6 Belajar Praktik. Project ini menerapkan konsep Object-Oriented Programming (OOP), seperti class, object, constructor, encapsulation, enum, ArrayList, dan object reference.

Pada TP5, project dikembangkan dengan menambahkan fitur pengelolaan karakter atau CRUD (Create, Read, Update, Delete), pencarian karakter, validasi nama duplikat, serta perhitungan rata-rata level karakter.
1. Memahami penggunaan class dan object dalam Java.
2. Mengimplementasikan CharacterManager untuk mengelola data karakter.
3. Menerapkan fitur tambah, cari, dan hapus karakter.
4. Mencegah penambahan karakter dengan nama yang sama.
5. Memahami konsep object reference dan defensive copy.
6. Menghitung jumlah dan rata-rata level karakter.
```
CharacterManager/
│
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               │
│               └── model/
│                   ├── Character.java
│                   ├── CharacterType.java
│                   └── CharacterManager.java
│
└── README.md
```
1. Membuka aplikasi Visual Studio Code.
2. Membuat folder project dengan nama CharacterManager.
3. Membuat folder src di dalam folder project.
4. Membuat package com.unpri.charactermanager.
5. Membuat folder model untuk menyimpan class yang berhubungan dengan karakter.
File CharacterType.java digunakan untuk menentukan jenis karakter menggunakan enum.

Jenis karakter yang digunakan adalah:
- WARRIOR
- MAGE
- ARCHER
- HEALER
Enum membantu membatasi pilihan jenis karakter agar data lebih terstruktur.
File Character.java digunakan untuk membuat objek karakter.

Atribut karakter meliputi:
- id
- name
- type
- level
- hitPoints
- attackPower
- mana
Pada class ini diterapkan:
- Constructor untuk membuat objek karakter.
- Getter dan setter untuk mengakses serta mengubah atribut.
- Method toString() untuk menampilkan informasi karakter.
- Method equals() untuk membandingkan karakter berdasarkan nama.
- Method hashCode() untuk mendukung perbandingan objek.
- Method isAlive() untuk memeriksa kondisi karakter.
File CharacterManager.java digunakan untuk mengelola kumpulan objek karakter menggunakan ArrayList.

Fitur yang dibuat:
1. addCharacter() — menambahkan karakter baru.
2. findByName() — mencari karakter berdasarkan nama.
3. removeCharacter() — menghapus karakter berdasarkan nama.
4. getTotalCharacters() — menghitung jumlah karakter.
5. getAllCharacters() — menampilkan seluruh karakter.
6. getAverageLevel() — menghitung rata-rata level karakter.
Pada bagian ini juga dibuat validasi agar nama karakter yang sama tidak dapat ditambahkan dua kali.
File Main.java digunakan sebagai program utama untuk menjalankan dan menguji seluruh fitur.

Karakter yang digunakan dalam pengujian:
- Arjuna sebagai WARRIOR dengan level 5.
- Merlin sebagai MAGE dengan level 3.
- Athena sebagai ARCHER dengan level 1.
Pengujian dilakukan dengan:
1. Menambahkan tiga karakter.
2. Mencoba menambahkan karakter Arjuna kembali.
3. Menghitung jumlah karakter.
4. Mencari karakter Merlin.
5. Mencari karakter Zeus yang tidak tersedia.
6. Menghapus karakter Athena.
7. Menampilkan daftar karakter yang tersisa.
1. Membuka file Main.java di Visual Studio Code.
2. Menekan tombol Run Java.
3. Menunggu program selesai dijalankan.
4. Memeriksa hasil program pada bagian Terminal.
5. Memastikan fitur tambah, pencarian, validasi duplikat, dan penghapusan berjalan dengan benar.
Program menghasilkan pengujian sebagai berikut:
- Karakter Arjuna berhasil ditambahkan.
- Karakter Merlin berhasil ditambahkan.
- Karakter Athena berhasil ditambahkan.
- Penambahan Arjuna kedua ditolak karena nama sudah ada.
- Pencarian Merlin berhasil ditemukan.
- Pencarian Zeus tidak ditemukan.
- Karakter Athena berhasil dihapus.
- Jumlah karakter setelah penghapusan menjadi 2.
Masukkan screenshot hasil program yang dijalankan melalui Terminal VS Code di bawah ini.

[![alt text](image-1.png)]
Pengujian object reference dilakukan untuk mengetahui apakah perubahan pada daftar hasil getAllCharacters() memengaruhi daftar karakter asli.

Pada method getAllCharacters(), digunakan:
```
return new ArrayList<>(characters);
```
Kode tersebut membuat salinan daftar baru sehingga perubahan pada daftar salinan tidak langsung mengubah daftar asli milik CharacterManager.

[Tempel Screenshot Pengujian Object Reference di sini]
CharacterManager bertugas mengelola seluruh objek Character. Dengan adanya class ini, proses penambahan, pencarian, penghapusan, dan penghitungan karakter menjadi lebih terorganisir.
Validasi dilakukan menggunakan findByName(). Jika nama karakter sudah tersedia, karakter baru tidak akan ditambahkan.
Method getAllCharacters() mengembalikan salinan daftar menggunakan new ArrayList<>(characters). Tujuannya agar daftar asli tidak dapat diubah secara langsung melalui daftar yang dikembalikan.
Method getAverageLevel() digunakan untuk menghitung rata-rata level semua karakter. Jika belum ada karakter, method mengembalikan nilai 0.
Melalui pengerjaan TP5 Character Manager, saya dapat memahami cara mengelola objek menggunakan ArrayList, menerapkan fitur CRUD, melakukan pencarian data, mencegah data duplikat, serta memahami konsep object reference dan defensive copy.

Project ini membantu saya memahami penerapan konsep Object-Oriented Programming menggunakan bahasa pemrograman Java.
Nama dokumen: JavaVisual_TP05_[253303621294]_[Yusup Aritonang]

Link Google Docs:

[https://docs.google.com/document/d/1e18dPDurP1xZY3_-0hdW3xxh-7EVK2tB/edit?usp=drive_link&ouid=117130834806065707688&rtpof=true&sd=true]
Mata Kuliah: Java Visual SIH-6406
Tugas: TP5 — Character Manager Sprint #2
Submission: GitHub dan Google Docs