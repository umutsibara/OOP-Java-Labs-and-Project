interface Kitap {
    String tur = "Kitap";
    String yazar = "Bilinmiyor";
    double fiyat = 0.0;

    void yazdir();
}

class BilimKurgu implements Kitap {
    String tur = "Bilim Kurgu";
    String yazar = "Isaac Asimov";
    double fiyat = 45.0;

    @Override
    public void yazdir() {
        System.out.println("Bilim Kurgu kitabı yazdırılıyor...");
    }
}

class Polisiye implements Kitap {
    String tur = "Polisiye";
    String yazar = "Arthur Conan Doyle";
    double fiyat = 35.0;

    @Override
    public void yazdir() {
        System.out.println("Polisiye kitabı yazdırılıyor...");
    }
}

class Macera implements Kitap {
    String tur = "Macera";
    String yazar = "Jules Verne";
    double fiyat = 40.0;

    @Override
    public void yazdir() {
        System.out.println("Macera kitabı yazdırılıyor...");
    }
}