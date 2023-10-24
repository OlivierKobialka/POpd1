package z2;

public abstract class Zwierze {
    protected int ileNog;
    protected int wiek;

    public int getWiek() {
        return wiek;
    };

    public int getIleNog() {
        return ileNog;
    };

    public abstract String dajGlos();
}