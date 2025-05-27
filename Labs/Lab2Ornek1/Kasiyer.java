import java.util.Scanner;
public class Kasiyer{
    Scanner tarayici = new Scanner(System.in);
    Kasa kasaNesnesi;
    int secim=0;
    double fiyat=0;

    public Kasiyer(){

    }
    public Kasiyer(String isim){
        this.kasaNesnesi = new Kasa(isim);
    }
    public void isVakti(){
        do {
            System.out.println("Yiyecek Kodunu ve Fiyatını Giriniz" +
                    "\n1 - Salata" +
                    "\n2 - Hamburger" +
                    "\n3 - Pizza" +
                    "\n4 - Tatlı " +
                    "\n5 - Programı Sonlandırır!\n");
            secim = tarayici.nextInt();

            if (secim==5)
                break;
            else if (secim>=1 && secim<5)
                fiyat = tarayici.nextDouble();
            else {
                System.out.println("HATA!!!!!!!!!!");
                break;
            }

            kasaNesnesi.hesapla(secim,fiyat);

        }while (secim!=5);

        kasaNesnesi.fisYazdir();

    }
}
