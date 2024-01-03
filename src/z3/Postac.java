package z3;

public abstract class Postac {
    protected int punktyZycia;

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void zmienPunktyZycia(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }
}