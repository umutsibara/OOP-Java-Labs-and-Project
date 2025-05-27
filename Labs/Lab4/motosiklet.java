public class motosiklet implements arac,suratMotoru{
    @Override
    public void solaSagaDon() {
        System.out.println("solaSagaDon() yordamı çalıştı");
    }

    @Override
    public void sur() {
        System.out.println("sur() yordamı çalıştı");
    }
    @Override
    public void cokHizYap() {
        System.out.println("cokHizYap() yordamı çalıştı");
    }
    public void sur(int a){
        System.out.println("sur(int a) yordamı çalıştı");
    }
}

