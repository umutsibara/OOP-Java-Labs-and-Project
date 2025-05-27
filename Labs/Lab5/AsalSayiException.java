public class AsalSayiException extends Exception{
    public AsalSayiException(String message) {
        super(message);
        System.out.println("Asal Sayı Hatası Yakalandı");
    }
    static public AsalSayiException SayiGirmemeHatasi() {
        return  new AsalSayiException("Lütfen Sayı Giriniz");
    }
    static public AsalSayiException NegatifGirmeHatasi(){
        return  new AsalSayiException("Lütfen 1'den Büyük Bir Sayı Giriniz");
    }
}
