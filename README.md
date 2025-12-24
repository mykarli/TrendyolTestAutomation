# Trendyol Test Automation

## 🧠 Overview
Bu proje, bir e-ticaret platformunda kullanıcıların en kritik akışlarının
(regresyon riski yüksek olan senaryoların) otomasyon testleri ile güvence altına alınması amacıyla geliştirilmiştir.

Amaç, sadece test yazmak değil; **ürün davranışını koruyan bir kalite kalkanı** oluşturmaktır.

---

## 🎯 Problem Statement
E-ticaret uygulamalarında:
- Sık deploy yapılır
- Küçük değişiklikler bile kritik akışları bozabilir
- Manuel test süreçleri zaman alır ve hata payı yüksektir

Özellikle:
- Ürün arama
- Sepete ekleme
- Sayfa geçişleri

gibi akışlar sürekli risk altındadır.

---

## 💡 Solution Approach
Bu projede:

- Kullanıcının gerçek davranışları baz alındı
- Kritik kullanıcı senaryoları belirlendi
- Bu senaryolar otomasyon testleri ile kapsandı

Testler, **“kod çalışıyor mu?”** değil  
**“ürün doğru çalışıyor mu?”** sorusuna cevap verecek şekilde tasarlandı.

---

## 🔁 Tested User Flows
- Ana sayfa erişimi
- Ürün arama ve listeleme
- Ürün detay sayfası kontrolleri
- Sepete ekleme akışı
- Sayfa geçişleri ve temel UI doğrulamaları

Bu akışlar, regresyon riskini minimize etmek için seçildi.

---

## 🛠️ Tech Stack
- Language: Java
- Test Framework: (Selenium / TestNG / JUnit – kullandığını belirt)
- Build Tool: Maven / Gradle
- Browser Automation: Selenium WebDriver

---

## ⚖️ Key Decisions & Trade-offs
- **UI testleri tercih edildi**  
  → Kullanıcıya en yakın katmanda doğrulama yapmak için

- **Her senaryo test edilmedi**  
  → En kritik ve en sık bozulan akışlara odaklanıldı

Amaç, %100 kapsama değil; **maksimum iş değeri** üretmekti.

---

## 🚀 Possible Improvements
Proje genişletilmek istenirse:

- CI/CD pipeline entegrasyonu
- Paralel test koşumu
- Cross-browser test desteği
- Raporlama ve loglama iyileştirmeleri

---

## 📌 Why This Project Matters
Bu proje:
- Test otomasyonunun iş değerini anlamayı
- Ürün stabilitesine katkı sağlamayı
- Geliştirme sürecinde kalite bilinci oluşturmayı

hedefler.

Bu yaklaşım, yazılım geliştirmeyi sadece kod yazmak olarak değil;
**ürün sorumluluğu** olarak ele aldığımı gösterir.
