public class Uydu {
    public Uydu(){
        System.out.println("UYARI");
    }
    public Uydu(GPSAlicisi gA){
        System.out.println("GPS Alıcısına Başarılı Bir Şekilde Bağlanıldı.");
        gA.uydudanVeriAl(veriTuruSec());

    }
    private int veriTuruSec(){
        return (int) (Math.random() *   3 +1);
    }
}
