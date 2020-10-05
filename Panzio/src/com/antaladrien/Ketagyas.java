package com.antaladrien;

public class Ketagyas extends Szoba implements Kedvezmenyes {
    public Ketagyas() {
        super(2);
    }

    @Override
    public void kedvezmenytKer() {
        if (lakok == 1) {
            berletiDij = EGYAGYAS;
        }
    }

    @Override
    public void atkoltozik(Szoba sz, int hany) {
        int szabad = sz.fekvohely - sz.lakok;
        if (sz instanceof Lakosztaly && szabad >= hany) {
            sz.lakok += hany;
            kikoltozik(hany);
        }
    }

    @Override
    public String toString() {
        return "Ketagyas " + super.toString();
    }
}
