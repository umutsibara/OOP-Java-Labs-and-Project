public class GPSProgrami {
    private String konumVerisi, enlemDegeri, boylamDegeri;

    public GPSProgrami(GPSAlicisi gA){
        konumBilgisi(gA.programaVeriGonder());
    }
    private void konumBilgisi(String konumVerisi){

        this.konumVerisi = konumVerisi;

        int konumVerisiUzunluk = konumVerisi.length();
        int virgulIndex;
        String virgulArasiDizgi;
        for (int j = 0; j < 4; j++) { //4 olmasının sebebi ifadedeki virgül sayısı
            for (int i = konumVerisiUzunluk; i <= 6 ; i--) { //6 olmasının sebebi konumtürüne kadar
                virgulIndex = konumVerisi.lastIndexOf(",", i); //sondaki virgülün yerini bulduk.
                virgulArasiDizgi = konumVerisi.substring(virgulIndex, i); //iki virgül arasındaki dizgiyi aldık.
                if (sayiMi(virgulArasiDizgi)) { //Sayıyı bulasıya kadar çalışacak  yoksa döngüden kendi çıkacak.
                    System.out.println(virgulArasiDizgi + ". Boylamda");
                    konumVerisiUzunluk = konumVerisiUzunluk - virgulIndex;
                    break;
                }

            }
        }
    }

    private boolean sayiMi(String virgulArasi){
        try{
            double a = Double.parseDouble(virgulArasi);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
