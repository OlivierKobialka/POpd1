package z1;

public final class Pracownik {
    private int pensja;
    private Pracownik przelozony;

    public Pracownik(Pracownik przelozony) {
        this.przelozony = przelozony;
        this.pensja = 3600;
    }

    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }
}