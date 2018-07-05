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
public class Prostokat extends BaseClass {

    public static int instanceProstokat = 0;

    public static int getInstanceProstokat() {
        return instanceProstokat;
    }

    public static void setInstanceProstokat(int instanceProstokat) {
        Prostokat.instanceProstokat = instanceProstokat;
    }

    static {
        if (debug) {
            System.out.println("Inicjator statyczny -> instance: " + instance++);
            System.out.println("Inicjator statyczny -> instanceProstokat: " + instanceProstokat++);
        }
    }

    public Prostokat(Prostokat p) {
        if (debug) {
            System.out.println("Object instance(Prostokat) -> instance: " + instance++);
            System.out.println("Konstruktor Prostokat(Prostokat p) -> instanceProstokat: " + instanceProstokat++);

        }
        this.x = p.x;
        this.y = p.y;
    }

    public Prostokat(int x, int y) {
        if (debug) {
            System.out.println("Konstruktor Prostokat(int x, int y) -> instance: " + instance++);
            System.out.println("Konstruktor Prostokat(int x, int y) -> instanceProstokat: " + instanceProstokat++);

        }
        this.x = x;
        this.y = y;
    }

    public Prostokat() {
        this(10, 20);
        if (debug) {
            System.out.println("Konstruktor Prostokat(): " + instance++);
            System.out.println("Konstruktor Prostokat() -> instanceProstokat: " + instanceProstokat++);
        }

    }

    @Override
    public void draw() {
        if (debug) {
            System.out.println("Metoda void draw() klasy Prostokat");
        }
        double polePowierzchni = x * y;
        System.out.println("Pole powierzchni prostokata: " + polePowierzchni);

        double obwodFigury = 2*x + 2*y;
        System.out.println("Obwód: " + obwodFigury);
    }

}
