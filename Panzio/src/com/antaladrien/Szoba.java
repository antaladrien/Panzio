package com.antaladrien;

public abstract class Szoba implements Arak {

    protected int berletiDij, fekvohely, lakok;

    public Szoba(int lakok) {
        this.lakok = lakok;
        this.fekvohely = lakok;
        if (lakok == 1) {
            this.berletiDij = EGYAGYAS;
        } else {
            this.berletiDij = KETAGYAS + (lakok -2) * EGYAGYAS;
        }
    }

    @Override
    public String toString() {
        return "Szoba{" + "berletiDij=" + berletiDij +
                ", fekvohely=" + fekvohely + ", lakok=" + lakok + '}';
    }

    public void kikoltozik(int hany) {
        lakok -= hany;
        if (lakok < 0) {
            lakok = 0;
        }
    }

    public abstract void atkoltozik(Szoba sz, int hany);
}
