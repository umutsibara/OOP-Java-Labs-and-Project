public class GPSAlicisi {
    private int sicaklik;
    public boolean GPSAktiflikDurumu;
    private String GPSCumlesi;
    public GPSAlicisi(){
        if (sicaklikOlc()>= 5 && sicaklikOlc()<=40)
            GPSAktiflikDurumu=true;
        else
            GPSAktiflikDurumu=false;
    }
    private int sicaklikOlc(){
        return (int) (Math.random() * 40 +1);
    }
    public void uydudanVeriAl(int cumleCesidi){

        //GELEN SAYI İNT OLARAK SADECE 1 2 3 OLACAĞI İÇİN DÜZELTİLEBİLİR!!!

        String cumleCesidiString = Integer.toString(cumleCesidi);
        if (cumleCesidiString.contains("1")){
            GPSCumlesi = "$GPGGA,N,40,30,E";
        } else if (cumleCesidiString.contains("2")) {
            GPSCumlesi = "$GPRMC,41,N,E,31";
        }else if (cumleCesidiString.contains("3")) {
            GPSCumlesi = "$GPGLL,N,E,42,32";
        }
    }

    public String programaVeriGonder(){
        return GPSCumlesi;
    }
}
