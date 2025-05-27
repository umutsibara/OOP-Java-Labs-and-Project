# OOP-Java-Labs-and-Project

Bu repository, Nesne Yönelimli Programlama (OOP) ve Java dersi kapsamında geliştirdiğim laboratuvar çalışmaları ve final projesini içermektedir. Bu projeler, OOP prensiplerini ve Java programlama dilini öğrenme sürecimde edindiğim deneyimleri yansıtmaktadır.

## 🎯 Projenin Amacı
Bu proje, Nesne Yönelimli Programlama prensiplerini uygulamalı olarak öğrenmek ve Java programlama dilinde pratik yapmak amacıyla geliştirilmiştir. Her bir laboratuvar çalışması ve final projesi, farklı OOP kavramlarını ve Java özelliklerini içermektedir.

## 📚 Edinilen Kazanımlar

### OOP Prensipleri
- **Soyutlama (Abstraction)**: Karmaşık sistemleri basitleştirme ve modüler hale getirme
- **Kapsülleme (Encapsulation)**: Veri ve metodları bir arada tutma ve erişim kontrolü
- **Kalıtım (Inheritance)**: Kod tekrarını önleme ve yeniden kullanılabilirlik
- **Çok Biçimlilik (Polymorphism)**: Farklı nesnelerin aynı arayüzü kullanabilmesi

## 📁 Proje İçeriği

### Laboratuvar Çalışmaları

#### Lab2Ornek1: Restoran Kasa Sistemi
- Restoran kasa yönetimi uygulaması
- Ürün satışı ve kar hesaplama
- Farklı ürün tipleri için özel kar hesaplamaları
- Günlük satış raporu oluşturma
- Dosyalar: `Kasa.java`, `Kasiyer.java`, `Main.java`

#### Lab3: Geometrik Şekiller
- Geometrik şekiller için sınıf hiyerarşisi
- Circle ve Rectangle sınıfları
- Alan ve çevre hesaplamaları
- Kalıtım ve çok biçimlilik uygulaması
- Dosyalar: `GeometriObject.java`, `Main.java`

#### Lab4: Araç Sistemi
- Araç hiyerarşisi ve interface kullanımı
- Bisiklet ve motosiklet sınıfları
- Çoklu interface implementasyonu
- Hareket ve kontrol metodları
- Dosyalar: `arac.java`, `motorluArac.java`, `motosiklet.java`, `Main.java`

#### Lab5: Exception Handling
- Özel exception sınıfı oluşturma
- Sayı girişi kontrolü
- Try-catch blokları ile hata yönetimi
- Dosyalar: `Main.java`, `AsalSayiException.java`, `AsalKontrol.java`

### Final Projesi: Kalori Takip Sistemi
Bu proje, kullanıcıların günlük kalori alımlarını takip etmelerine yardımcı olan bir uygulamadır. Kullanıcıdan kişisel bilgileri (yaş, boy, kilo, cinsiyet, aktivite seviyesi) alarak günlük kalori ihtiyacını hesaplar ve öğün bazında besin takibi yapar.

#### Ana Bileşenler ve İşlevleri

##### `Main.java`
- Uygulamanın giriş noktası
- Kullanıcı arayüzü yönetimi
- Öğün seçimi ve yönlendirme
- Hata yönetimi (try-catch blokları)

##### `Insan.java`
- Kullanıcı bilgilerinin alınması ve yönetimi
- BMR (Bazal Metabolizma Hızı) hesaplama
- İç sınıf (Inner Class) kullanımı ile cinsiyet bazlı hesaplamalar
- Veri doğrulama ve hata kontrolü

##### `Food.java`
- Besin veritabanı yönetimi
- Interface kullanımı ile öğün tipleri (Sabah, Öğle, Akşam)
- Her öğün için özel besin listesi
- Besin değerlerinin (kalori, protein, yağ, şeker) hesaplanması

##### `Kalori.java`
- Günlük kalori takibi
- Besin değerlerinin toplanması ve raporlanması
- Gramaj bazlı hesaplamalar
- BMR ile karşılaştırmalı analiz

#### Özellikler
- Kişiye özel kalori hesaplama
- Öğün bazlı besin takibi
- Detaylı besin değeri raporlama
- Hata kontrolü ve kullanıcı doğrulama
- Renkli konsol çıktıları
- Tekrar kullanılabilir kod yapısı

## 📝 Notlar
- Her bir laboratuvar çalışması, belirli OOP kavramlarını ve Java özelliklerini öğrenmek için tasarlanmıştır
- Final projesi, öğrenilen tüm kavramların pratik bir uygulamasıdır
- Kodlar, eğitim amaçlı geliştirilmiş olup, gerçek dünya uygulamaları için ek geliştirmeler gerektirebilir

## 📄 Lisans
Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasına bakınız.
