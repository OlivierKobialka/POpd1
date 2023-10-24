package z3;

public abstract class Walczaca extends Postac {
    protected int sila;

    public int getSila() {
        return sila;
    }

    public void atakuj(Postac postac) {
        postac.punktyZycia -= sila;
    }
}