package pl.edu.ur.polab4;

import java.util.Scanner;

import pl.edu.ur.polab4.Figura.*;

public class z4 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        String x;
        do {
            System.out.println("Dla jakiej figury chcesz obliczyc pole i objetosc/obwod?");
            x = f.nextLine();
            if (x.equalsIgnoreCase("kwadrat")) {
                System.out.println("Podaj bok kwadratu");
                int y = l.nextInt();
                Kwadrat fi = new Kwadrat(y);
                fi.pokazDanekw();
            }
            else if (x.equalsIgnoreCase("prostokat")) {
                System.out.println("Podaj boki prostokata");
                int y = l.nextInt();
                int t = l.nextInt();
                Prostokat fi = new Prostokat(y, t);
                fi.pokazDanepr();
            }
            else if (x.equalsIgnoreCase("szescian")) {
                System.out.println("Podaj bok szescianu");
                int y = l.nextInt();
                Szescian fi = new Szescian(y);
                fi.pokazDanesz();
            }
            else if (x.equalsIgnoreCase("prostopadloscian")) {
                System.out.println("Podaj 1 bok prostopadloscianu");
                int y = l.nextInt();
                System.out.println("Podaj 2 bok prostopadloscianu");
                int t = l.nextInt();
                System.out.println("Podaj 3 bok prostopadloscianu");
                int r = l.nextInt();
                Prostopadloscian fi = new Prostopadloscian(y, t, r);
                fi.pokazDanepro();
            }
            else if (x.equalsIgnoreCase("kula")) {
                System.out.println("Podaj promien kuli");
                int y = l.nextInt();
                Kula fi = new Kula(y);
                fi.pokazDaneku();
            }
            else if (x.equalsIgnoreCase("stozek")) {
                System.out.println("Podaj promien podstawy stozka");
                int y = l.nextInt();
                System.out.println("Podaj tworzaca stozka");
                int t = l.nextInt();
                System.out.println("Podaj wysokosc stozka");
                int r = l.nextInt();
                Stozek fi = new Stozek(y,t,r);
                fi.pokazDanest();
            }
            else
            {
                System.out.println("Program nie liczy dla danej figury");
            }
            System.out.println("Uruchomic program ponownie?");
            x = f.nextLine();
        } while (x.equalsIgnoreCase("tak"));
    }

}
