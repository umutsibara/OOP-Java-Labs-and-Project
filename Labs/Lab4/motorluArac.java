public abstract class motorluArac extends motosiklet{
    public int beygirGucu;
    public benzin b;
    public motor mm;
    public motorluArac(){
        arizaKontrol();
    }
    public motorluArac(benzin b, motor mm){
        this.b = b;
        this.mm = mm;
        //motorluArac sınıfı içerisinde motor ve benzin tipinde iki b ve mm referanslarına
        // yeni birer nesne, kompozisyon yöntemi ile oluşturulsun.
    }
    public void motorCalistir(int a){
        System.out.println("motorCalistir(int a) yordamı çalıştı");
    }
    public boolean arizaKontrol(){
        System.out.println("Arıza Yok");
        return true;
    }
}

class benzin extends motorluArac{
    public String tip = "motorin";
}

class motor extends motorluArac{
    public int motorHacmi = 1400;
    public disliSeti ds;
    public void calistir(){
        ds = new disliSeti();
        ds.calistir();
    }
    class disliSeti extends motor{
        public void calistir(){
            System.out.println("calistir() yordamı Çalıştı");
        }
    }
}

