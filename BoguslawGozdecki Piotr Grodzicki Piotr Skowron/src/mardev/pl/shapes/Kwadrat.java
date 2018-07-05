/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl.shapes;

import mardev.pl.BaseClasses.BaseClass;
import static mardev.pl.BaseClasses.BaseClass.instance;

/**
 *
 * @author tomek
 */
public class Kwadrat extends BaseClass {

    public static int instanceKwadrat = 0;

    public static int getInstanceKwadrat() {
        return instanceKwadrat;
    }

    public static void setInstanceKwadrat(int instanceKwadrat) {
        Kwadrat.instanceKwadrat = instanceKwadrat;
    }

    static {
        if (debug) {
            System.out.println("Inicjator statyczny -> instance: " + instance++);
            System.out.println("Inicjator statyczny -> instanceProstokat: " + instanceKwadrat++);
        }
    }

    public Kwadrat(int x, int y) {
        if (debug) {
            System.out.println("Konstruktor Kwadrat(int x, int y) -> instance: " + instance++);
            System.out.println("Konstruktor Kwadrat(int x, int y) -> instanceProstokat: " + instanceKwadrat++);
        }
        this.x = x;
        this.y = y;
    }

    public Kwadrat(Kwadrat p) {
        if (debug) {
            System.out.println("Konstruktor Kwadrat(Kwadrat p) -> instance: " + instance++);
            System.out.println("Konstruktor Kwadrat(Kwadrat p) -> instanceProstokat: " + instanceKwadrat++);
        }
        this.x = p.x;
        this.y = p.y;
    }

    public Kwadrat() {
        this(30, 30);
        if (debug) {
            System.out.println("Konstruktor Kwadrat() -> instance: " + instance++);
            System.out.println("Konstruktor Kwadrat() -> instanceProstokat: " + instanceKwadrat++);
        }

    }

    @Override
    public void draw() {
        if (debug) {
            System.out.println("Metoda void draw() klasy Kwadrat");
        }
        double polePowierzchni = x * y;
        System.out.println("Pole powierzchni kwadratu: " + polePowierzchni);

        double obwodFigury = 2*x + 2*y;
        System.out.println("Obwód: " + obwodFigury);
    }

}
