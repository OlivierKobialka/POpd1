package z3;

public final class Smok extends Walczaca {
    public Smok() {
        punktyZycia = 1000;
    }

    @Override
    public int getPunktyZycia() {
        return punktyZycia;
    }

    @Override
    public void zmienPunktyZycia(int zmiana) {
        this.punktyZycia += zmiana;
    }

    @Override
    public void atakuj(Postac postac) {
        postac.zmienPunktyZycia(-100);
    }

    @Override
    public int getSila() {
        return 5000000;
    }
}