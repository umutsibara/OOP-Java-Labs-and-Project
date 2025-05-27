public interface arac {
    public int hiz = 120;
    public String renk = "mavi";
    public void solaSagaDon();
    public void sur();


}

class bisiklet implements arac{
    public String model;
    @Override
    public void solaSagaDon() {
        System.out.println("solaSagaDon() yordamı çalıştı");
    }

    @Override
    public void sur() {
        System.out.println("sur() yordamı çalıştı");
    }
}

class ikiTekerlikli extends bisiklet{
    public void dengeSagla(){
        System.out.println("dengeSagla() yordamı çalıştı");
    }
}
interface suratMotoru{
    public void cokHizYap();
}

