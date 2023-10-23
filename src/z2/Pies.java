package z2;

public final class Pies extends ImienneZwierze{
    public int getIleNog() {
        return ileNog;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public Pies(int wiek, String imie){
        this.wiek = wiek;
        this.imie = imie;
        ileNog = 4;
    }

    public String dajGlos() {
        return "Hau hau";
    }
}