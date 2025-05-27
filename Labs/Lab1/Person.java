public class Person {
    String isim;
    double saat, saatUcreti;
    public Person(String isim, double saat, double saatUcreti){
        this.isim=isim;
        this.saat=saat;
        this.saatUcreti=saatUcreti;
    }
    public double mesaiHesapla(){
        return saat*saatUcreti;
    }
}
class Mudur extends Person {
    public Mudur(String isim, double saat, double saatlikUcret) {
        super(isim, saat, saatlikUcret);
    }

    public double mesaiHesapla() {
        return saat * saatUcreti;
    }
}

class Teknisyen extends Person{
    public Teknisyen (String isim, double saat, double saatlikUcret){
        super(isim, saat, saatlikUcret);
    }
    public double mesaiHesapla(){
        return saat*saatUcreti;
    }
}
class Sekreter extends Person{
    public Sekreter (String isim, double saat, double saatlikUcret){
        super(isim, saat, saatlikUcret);
    }
    public double mesaiHesapla(){
        return saat*saatUcreti;
    }
}