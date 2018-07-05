/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl.abstractClasses;

import java.io.Serializable;

/**
 *
 * @author tomek
 */
public abstract class Ksztalt implements Serializable{

    public static String fileName = "temporary.tmp";
    public static int instance = 0;
    public static int instanceKsztalt = 0;
    public static boolean debug = true;

    public abstract void draw();

    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        Ksztalt.instance = instance;
    }

    public static int getInstanceKsztalt() {
        return instanceKsztalt;
    }

    public static void setInstanceKsztalt(int instanceKsztalt) {
        Ksztalt.instanceKsztalt = instanceKsztalt;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        Ksztalt.debug = debug;
    }
    
}
