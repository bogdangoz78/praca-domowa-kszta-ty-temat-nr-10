/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mardev.pl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import mardev.pl.abstractClasses.Ksztalt;
import mardev.pl.shapes.Kolo;
import mardev.pl.shapes.Kwadrat;
import mardev.pl.shapes.Prostokat;

/**
 *
 * @author tomek
 */
public class PracaPrzejsciowa {

    private void prostokat(Scanner wejscie) {
        try {
            System.out.println("Podaj długość boku x prostokąta: ");
            String x = wejscie.next();
            System.out.println("Podaj długość boku y prostokąta: ");
            String y = wejscie.next();
            Prostokat k = new Prostokat(Integer.parseInt(x), Integer.parseInt(y));
            al.add(k);
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }
    }

    private void kwadrat(Scanner wejscie) {
        try {
            System.out.println("Podaj długość boku x kwadratu: ");
            String x = wejscie.next();
            System.out.println("Podaj długość boku y kwadratu: ");
            String y = wejscie.next();
            Kwadrat k = new Kwadrat(Integer.parseInt(x), Integer.parseInt(y));
            al.add(k);
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }
    }

    private void kolo(Scanner wejscie) {

        try {
            System.out.println("Podaj promień koła: ");
            String r = wejscie.next();
            Kolo k = new Kolo(Integer.parseInt(r));
            al.add(k);
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }

    }
    private ArrayList<Ksztalt> al;

    public PracaPrzejsciowa() {
        al = new ArrayList<Ksztalt>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PracaPrzejsciowa pp = new PracaPrzejsciowa();

        try (Scanner wejscie = new Scanner(System.in)) {

            String komenda = "";
            while (!komenda.equals("Q")) {
                System.out.println("1 - Pokaż szczegółowe informacje (pokazuje kolejność inicjowania itp)");
                System.out.println("2 - Usuń szczegółowe informacje (ukryj kolejność inicjowania itp)");
                System.out.println("3 - Stwórz koło");
                System.out.println("4 - Stwórz kwadrat");
                System.out.println("5 - Stwórz Prostokąt");
                System.out.println("6 - Wylistuj wszystkie pozycje");
                System.out.println("7 - Edytuj wskazany obiekt");
                System.out.println("8 - Zapisz obiekty do pliku");
                System.out.println("9 - Odczytaj obiekty z pliku");
                System.out.println("Q - Quit");

                try {
                    komenda = wejscie.next();
                } catch (Exception e) {
                    System.out.println("\n***Przechwycone wyjątki:***");
                    System.out.println("Message: " + e.getLocalizedMessage());
                }
                if (komenda != null && !komenda.equals("")) {
                    komenda = komenda.toUpperCase();
                }

                switch (komenda) {
                    case "1":
                        Ksztalt.debug = true;
                        break;
                    case "2":
                        Ksztalt.debug = false;
                        break;
                    case "3":
                        pp.kolo(wejscie);
                        break;
                    case "4":
                        pp.kwadrat(wejscie);
                        break;
                    case "5":
                        pp.prostokat(wejscie);
                        break;
                    case "6":
                        pp.lista();
                        break;
                    case "7":
                        pp.edytuj(wejscie);
                        break;
                    case "8":
                        pp.save();
                        break;
                    case "9":
                        pp.read();
                        break;
                    case "Q":
                        System.out.println("\n*** Zakończono działanie aplikacji ***");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Proszę dokonać wyboru. Wciśnięto błędny przycisk.");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("\n***Przechwycony wyjątek:***");
            System.out.println("Message: " + e.getLocalizedMessage());

        }

    }

    private void lista() {
        for (int i = 0; i < al.size(); i++) {
            System.out.print("Obiekt numer " + i + ")");
            al.get(i).draw();
            System.out.println();

        }

    }

    private void edytuj(Scanner wejscie) {
        try {
            System.out.println("Który obiekt chcesz edytować? Podaj jego numer (Wcześniej wylistuj).");
            String nr = wejscie.next();
            String ksztalt = "";
            while (!ksztalt.equals("1") && !ksztalt.equals("2") && !ksztalt.equals("3")) {

                System.out.println("Jaki wybrałeś kształt?");
                System.out.println("1) Koło");
                System.out.println("2) Kwadrat");
                System.out.println("3) Prostokąt");
                ksztalt = wejscie.next();
            }

            Ksztalt obiekt = al.get(Integer.parseInt(nr));
            if (ksztalt.equals("1")) {
                System.out.println("Piodaj promień");
                String promien = wejscie.next();
                ((Kolo) obiekt).setR(Integer.parseInt(promien));
            }
            if (ksztalt.equals("2")) {
                System.out.println("Podaj bok x");
                String x = wejscie.next();
                System.out.println("Podaj bok y");
                String y = wejscie.next();
                ((Kwadrat) obiekt).setX(Integer.parseInt(x));
                ((Kwadrat) obiekt).setY(Integer.parseInt(y));
            }
            if (ksztalt.equals("3")) {
                System.out.print("Podaj bok x");
                String x = wejscie.next();
                System.out.print("Podaj bok y");
                String y = wejscie.next();
                ((Prostokat) obiekt).setX(Integer.parseInt(x));
                ((Prostokat) obiekt).setY(Integer.parseInt(y));
            }
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }
    }

    private void save() {

        try (FileOutputStream fileOutputStream = new FileOutputStream(Ksztalt.fileName);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(al);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }
    }

    private void read() {

        try (FileInputStream fileInputStream = new FileInputStream(Ksztalt.fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            al = (ArrayList<Ksztalt>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Błąd: " + e);
        }
    }

}
