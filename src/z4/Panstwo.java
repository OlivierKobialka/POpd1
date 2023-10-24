package z4;

import java.util.ArrayList;

public abstract class Panstwo {
    protected Kontynent kontynent;
    protected int liczbaLudnosci;
    protected String stolica;
    protected ArrayList<Panstwo> sasiedzi = new ArrayList<Panstwo>();

    public void setLiczbaLudnosci(int liczbaLudnosci) {
        this.liczbaLudnosci = liczbaLudnosci;
    }

    public Kontynent getKontynent() {
        return kontynent;
    }

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    public String getStolica() {
        return stolica;
    }

    public ArrayList<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    public void dodajSasiada(Panstwo sasiad) {
        sasiedzi.add(sasiad);
    }

    public void migruj(Panstwo panstwo, int liczbaLudnosci) {
        panstwo.setLiczbaLudnosci(panstwo.getLiczbaLudnosci() + liczbaLudnosci);
        this.liczbaLudnosci -= liczbaLudnosci;
    }
}