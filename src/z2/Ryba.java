package z2;

public final class Ryba extends Zwierze {
    public int getIleNog() {
        return ileNog;
    }

    public int getWiek() {
        return wiek;
    }

    public Ryba(int wiek) {
        this.wiek = wiek;
        ileNog = 0;
    }

    public String dajGlos() {
        return "Bul bul";
    }
}