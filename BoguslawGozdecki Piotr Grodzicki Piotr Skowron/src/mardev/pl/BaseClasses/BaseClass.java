/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl.BaseClasses;

import mardev.pl.abstractClasses.Ksztalt;

/**
 *
 * @author tomek
 */
public class BaseClass extends Ksztalt {

    public int x;
    public int y;
    public static int instanceBaseClass = 0;

    public static int getInstanceBaseClass() {
        return instanceBaseClass;
    }

    public static void setInstanceBaseClass(int instanceBaseClass) {
        BaseClass.instanceBaseClass = instanceBaseClass;
    }

    static {
        if (debug) {
            System.out.println("Inicjator statyczny -> instance: " + instance++);
            System.out.println("Inicjator statyczny -> instanceBaseClass: " + instanceBaseClass++);        }
    }

    public BaseClass() {
        if (debug) {
            System.out.println("Konstruktor BaseClass() -> instance: " + instance++);
            System.out.println("Konstruktor BaseClass() -> instanceBaseClass: " + instanceBaseClass++);
        }
    }

    @Override
    public void draw() {
        if (debug) {
            System.out.println("Method draw() class BaseClassc(x:" + x + ";y:" + y + ")");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
