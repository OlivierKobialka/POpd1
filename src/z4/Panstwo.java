package z4;

import java.util.ArrayList;

public abstract class Panstwo {
    protected Kontynent kontynent;
    protected int liczbaLudnosci;
    protected String stolica;
    protected ArrayList<Panstwo> sasiedzi = new ArrayList<Panstwo>();
}