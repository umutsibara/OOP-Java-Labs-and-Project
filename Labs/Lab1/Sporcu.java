abstract class Sporcu {
    protected double maas;
    protected String kulub;
    protected int basariSirasi;

    public Sporcu(double maas, String kulub, int basariSirasi){
        this.maas=maas;
        this.kulub=kulub;
        this.basariSirasi=basariSirasi;
    }

    public Sporcu() {
    }

    abstract void bilgiAl();

    void yazdir(){
        System.out.println("Sporcu bilgileri: "
                +"\nMaaşı: " + maas
                +"\nKulübü: " + kulub
                +"\nBaşarı Sırası: "+ basariSirasi);
    }
}

class Basketbolcu extends Sporcu{
    public Basketbolcu(double maas, String kulub, int basariSirasi){
        super(maas,kulub,basariSirasi);
    }

    public Basketbolcu() {
        super();
    }

    @Override
    void bilgiAl(){
        System.out.println("Basketbolcu Bilgileri Alınıyor.");
    }
}

class Voleybolcu extends Sporcu{
    public Voleybolcu(double maas, String kulub, int basariSirasi){
        super(maas,kulub,basariSirasi);
    }

    public Voleybolcu() {
        super();
    }

    @Override
    void bilgiAl(){
        System.out.println("Voleybolcu Bilgileri Alınıyor.");
    }
}

class Futbolcu extends Sporcu{
    public Futbolcu(double maas, String kulub, int basariSirasi){
        super(maas,kulub,basariSirasi);
    }

    @Override
    void bilgiAl(){
        System.out.println("Futbolcu Bilgileri Alınıyor.");
    }
}