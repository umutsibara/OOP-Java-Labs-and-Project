import java.util.Scanner;

public class AsalKontrol {
    private Scanner scn = new Scanner(System.in);
    private int girilenSayi;
    private boolean asalMi;
    AsalKontrol(){
        bilgiAl();
        durumSoyle();
    }
    private void bilgiAl() {
        System.out.println("Bir Sayı Giriniz: ");
        try {
            girilenSayi = scn.nextInt();
            throw AsalSayiException.SayiGirmemeHatasi();
        }catch (AsalSayiException e){
            System.out.println("Hata: " +e);
            scn.next();
        }
    }
    private void asalMi(){
        for (int i = 2; i < girilenSayi ; i++) {
            if(girilenSayi % i == 0 && girilenSayi != 0){
                asalMi = false;
                break;
            }
            else
                asalMi = true;
        }
    }
    private void durumSoyle(){
        asalMi();
        if (asalMi)
            System.out.println(girilenSayi + " Asal Bir Sayıdır.");
        else
            System.out.println(girilenSayi + " Asal Bir Sayı DEĞİLDİR!");
    }
}
