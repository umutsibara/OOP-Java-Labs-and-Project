public class Test {
    public static void main(String[] args) {

        GPSAlicisi obj1 = new GPSAlicisi();
        for (int i = 0; i <10 ; i++) {
            while (obj1.GPSAktiflikDurumu){
                Uydu obj3 = new Uydu(obj1); //parametreli Uydu sınıfının GPSAlicisi methodu  çağrılıyor.
                GPSProgrami obj4 = new GPSProgrami(obj1);

                break;
            }
        }
        Uydu obj2 = new Uydu(); // parametresziz Uydu sınıfının GPSAlicisi methodu çağrılıyor
    }
}