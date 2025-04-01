# 🧪 TrendyolTestAutomation

Bu proje, Trendyol e-ticaret platformunun çeşitli kullanıcı senaryolarını test etmek amacıyla geliştirilmiş bir otomasyon test projesidir. Java dili kullanılarak Selenium WebDriver ve TestNG teknolojileriyle yazılmıştır.

## 🎯 Amaç

- Trendyol web sitesinde kullanıcı davranışlarını test etmek
- Arama, filtreleme, sepete ekleme gibi temel akışları otomatikleştirmek
- UI test süreçlerini kontrol etmek

## ⚙️ Kullanılan Teknolojiler

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM) tasarım deseni

## 🧪 Test Kapsamı

Aşağıdaki test senaryoları uygulanmıştır:

- ✅ Anasayfa açılıyor mu?
- 🔍 Ürün araması yapılabiliyor mu?
- 📦 Ürün sepete ekleniyor mu?
- 🗑️ Sepet temizlenebiliyor mu?
- 🔁 Filtreleme ve kategori geçişleri çalışıyor mu?

## 📁 Proje Yapısı

```bash
src
├── main
│   └── java
│       └── pages       → Sayfa sınıfları (Page Object)
├── test
│   └── java
│       └── tests       → Test senaryoları
└── resources
    └── drivers         → ChromeDriver, config dosyaları
