/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl.shapes;

import mardev.pl.SecoundStage.BaseSecoundStage;

/**
 *
 * @author tomek
 */
public class Kolo extends BaseSecoundStage {

    public static int instanceKolo = 0;

    public static int getInstanceKolo() {
        return instanceKolo;
    }

    public static void setInstanceKolo(int instanceKolo) {
        Kolo.instanceKolo = instanceKolo;
    }

    static {
        if (debug) {
            System.out.println("Inicjator statyczny -> instance: " + instance++);
            System.out.println("Inicjator statyczny -> instanceKolo: " + instanceKolo++);
        }
    }

    public Kolo(Kolo k) {
        if (debug) {
            System.out.println("Konstruktor Kolo(Kolo k) -> instance: " + instance++);
            System.out.println("Konstruktor Kolo(Kolo k) -> instanceKolo: " + instanceKolo++);
        }
        this.r = k.r;
    }

    public Kolo() {
        this(70);
        if (debug) {
            System.out.println("Konstruktor Kolo() -> instance: " + instance++);
            System.out.println("Konstruktor Kolo() -> instanceKolo: " + instanceKolo++);
        }
    }

    public Kolo(int r) {
        if (debug) {
            System.out.println("Konstruktor Kolo() -> instance: " + instance++);
            System.out.println("Konstruktor Kolo() -> instanceKolo: " + instanceKolo++);
        }
        this.r = r;
    }

    @Override
    public void draw() {
        if (debug) {
            System.out.println("Metoda void draw() klasy Kolo");
        }
        double polePowierzchni = 2 * 3.14 * r;
        System.out.println("Pole powierzchni koła:" + polePowierzchni);

        double obwodFigury = (3.14 * r * r);
        System.out.println("Obwód: " + obwodFigury);
    }

}
