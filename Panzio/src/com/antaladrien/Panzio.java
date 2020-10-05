package com.antaladrien;

import java.util.*;
import java.io.*;

public class Panzio {

    public static List<Szoba> szobak = new ArrayList<Szoba>();

    public static void main(String[] args) {
        try {
            szobatKiad("input.txt");
            berel();
        } catch (Exception ex) {
            System.out.println("ajjaj: " + ex);
        }
    }

    public static void berel() {
        for (Szoba szoba : szobak) {
            if (szoba instanceof Ketagyas) {
                ((Ketagyas)szoba).kedvezmenytKer();
            }
            System.out.println(szoba);
        }
    }

    public static void szobatKiad(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] conts = line.split(";");
            switch (conts[0]) {
                case "egyagyas":
                    szobak.add(new Egyagyas());
                    break;
                case "ketagyas":
                    szobak.add(new Ketagyas());
                    break;
                case "lakosztaly":
                    szobak.add(new Lakosztaly(Integer.parseInt(conts[1])));
                    break;
            }
            line = br.readLine();
        }
        br.close();
    }
}
