package com.antaladrien;

public class Lakosztaly extends Szoba {

    public Lakosztaly(int lakok) {
        super(lakok);
    }

    @Override
    public void atkoltozik(Szoba sz, int hany) {
        System.out.println("Bocsi, nem megyünk mi sehova!");
    }

    @Override
    public String toString() {
        return "Lakosztaly " + super.toString();
    }
}
