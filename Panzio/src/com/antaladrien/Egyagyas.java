package com.antaladrien;

public class Egyagyas extends Szoba {

    public Egyagyas() {
        super(1);
    }

    @Override
    public void atkoltozik(Szoba sz, int hany) {
        if (sz instanceof Ketagyas || sz instanceof Lakosztaly) {
            int szabad = sz.fekvohely - sz.lakok;
            if (szabad >= hany) {
                sz.lakok += hany;
                kikoltozik(hany);
            }
        }
    }

    @Override
    public String toString() {
        return "Egyagyas " + super.toString();
    }
}
