/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl.SecoundStage;

import mardev.pl.BaseClasses.BaseClass;

/**
 *
 * @author tomek
 */
public class BaseSecoundStage extends BaseClass {

    public static int instanceBaseSecoundStage = 0;

    public int r;

    public static int getInstanceBaseSecoundStage() {
        return instanceBaseSecoundStage;
    }

    public static void setInstanceBaseSecoundStage(int instanceBaseSecoundStage) {
        BaseSecoundStage.instanceBaseSecoundStage = instanceBaseSecoundStage;
    }

    static {
        if (debug) {
            System.out.println("Inicjator statyczny -> instance: " + instance++);
            System.out.println("Inicjator statyczny -> instanceBaseSecoundStage: " + instanceBaseSecoundStage++);
        }
    }

    public BaseSecoundStage() {
        if (debug) {
            System.out.println("Konstruktor BaseSecoundStage() -> instance: " + instance++);
            System.out.println("Konstruktor BaseSecoundStage() -> instanceBaseSecoundStage: " + instanceBaseSecoundStage++);
        }
    }

    @Override
    public void draw() {
        if (debug) {
            System.out.println("Method draw() class BaseSecoundStage(r:" + r + ")");
        }
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}
