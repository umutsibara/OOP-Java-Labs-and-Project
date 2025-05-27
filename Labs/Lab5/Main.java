import java.util.Scanner;

class OzCustomException extends Exception {
    public OzCustomException(String message) {
        super(message);
    }

    // Sayı girişi hatası oluşturan method
    public static OzCustomException createSayiGirmemeHatasi() {
        return new OzCustomException("Geçerli bir sayı girişi yapılmadı!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        try {
            // Sayı girişi hatasını fırlatma
            int girilenSayi = scn.nextInt();
            throw OzCustomException.createSayiGirmemeHatasi();
        } catch (OzCustomException e) {
            // Hata yakalama ve mesajı yazdırma
            System.out.println("Hata yakalandı: " + e.getMessage());
        }
    }
}
