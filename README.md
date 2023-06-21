# LP12DPBO2023C2

## Alasan Penggunaan Arsitektur
Saya menggunakan struktur MVVM karena pada view tidak ada keterikatan terhadap model, seperti yang terlihat pada file Display akan tetap berjalan meskipun tidak ada model yang dibuat, jadi Display hanya akan menampilkan tampilan dari gamenya. Juga pada view mereferensikan viewModel yaitu file Game

## Perbedaaan Struktur Antara LP12 dan TMD
pada TMD tidak digunakan `GameInterface` seperti pada LP12 karena penggunaannya yang mirip kontrak pada framework MVP. Selain itu `Synchronization` juga tidak disimpan pada package view tapi diluar dari package apapun karena sifatnya sebagai `Main` dari program.
