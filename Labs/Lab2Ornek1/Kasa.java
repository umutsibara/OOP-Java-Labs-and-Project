public class Kasa {
    int tatliSayisi=0, salataSayisi=0;
    double toplamKar=0.0, salataKari=0.0, toplamSatisMiktari=0.0;
    public Kasa(){
        System.out.println("Hoş geldin...");
    }
    public Kasa(String isim){

        System.out.println("Hoş geldin " + isim);
    }

    public void hesapla(int secim, double fiyat){

        toplamSatisHesapla(fiyat);
        gunlukKarHesapla(secim,fiyat);
    }
    private void toplamSatisHesapla(double fiyat){

        toplamSatisMiktari = toplamSatisMiktari + fiyat;
    }
    private void gunlukKarHesapla(int secim, double fiyat){

        switch (secim) {
            case 1:
                toplamKar = toplamKar + (fiyat * 0.30);
                salataKari(fiyat);
                break;
            case 2:
                toplamKar = toplamKar + (fiyat * 0.25);
                break;
            case 3:
                toplamKar = toplamKar + (fiyat * 0.35);
                break;
            case 4:
                toplamKar = toplamKar + (fiyat * 0.20);
                tatliSayiArttir();
                break;
            case 5:
                System.out.println("Afiyet Olsun..." +
                        "\n**************");
                break;
            default:
                System.out.println("Hatalı İşlem");
        }
    }
    private void salataKari(double kar){
        salataKari = salataKari + kar;
        salataSayisi++;
    }
    private void tatliSayiArttir(){
        tatliSayisi++;
    }
    public void fisYazdir(){
        System.out.println("Toplam Satış Miktarı: " + toplamSatisMiktari
        + "\nGünlük Toplam Kar Miktarı: " + toplamKar
                + "\nOrtalama Salata Karı: " + (salataKari/salataSayisi)
        + "\nTatlı Sayısı: " + tatliSayisi);
    }
}
