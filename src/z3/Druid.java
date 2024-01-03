package z3;

public class Druid extends Leczaca {
    public Druid(int punktyZycia, int mana) {
        this.punktyZycia = punktyZycia;
        this.mana = mana;
    }

    @Override
    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void zmienPunktyZycia(int zmiana) {
        this.punktyZycia += zmiana;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void wylecz(Postac postac) {
        if (mana >= 10) {
            postac.zmienPunktyZycia(200);
            zmienMana(-10);
        }
    }

    public void zmienMana(int zmiana) {
        this.mana += zmiana;
    }
}