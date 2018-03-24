package pl.edu.ur.polab4;

import static java.lang.Math.*;

public class Figura {

    public static class Kwadrat {

        int bokk = 0;

        public int polekwadratu(int bokk) {
            int pole = (int) pow(bokk, 2);
            return pole;
        }

        public int obwodkwadratu(int bokk) {
            int obwod = 4 * bokk;
            return obwod;
        }

        public void pokazDanekw() {
            System.out.println("---------------------");
            System.out.println("Kwadrat");
            System.out.println("Bok: " + this.bokk);
            System.out.println("Pole: " + this.polekwadratu(bokk));
            System.out.println("Obwod: " + this.obwodkwadratu(bokk));
            System.out.println("---------------------");

        }

        public Kwadrat(int bokk) {
            this.bokk = bokk;
        }

    }

    public static class Prostokat {

        int bokpr1 = 0;
        int bokpr2 = 0;

        public int poleprostokatu(int bokpr1, int bokpr2) {
            int pole = bokpr1 * bokpr2;
            return pole;
        }

        public int obwodprostokatu(int bokpr1, int bokpr2) {
            int obwod = 2 * bokpr1 + 2 * bokpr2;
            return obwod;
        }

        public void pokazDanepr() {
            System.out.println("---------------------");
            System.out.println("Prostokat");
            System.out.println("1 bok: " + this.bokpr1);
            System.out.println("2 bok: " + this.bokpr2);
            System.out.println("Pole: " + this.poleprostokatu(bokpr1, bokpr2));
            System.out.println("Obwod: " + this.obwodprostokatu(bokpr1, bokpr2));
            System.out.println("---------------------");

        }

        public Prostokat(int bokpr1, int bokpr2) {
            this.bokpr1 = bokpr1;
            this.bokpr2 = bokpr2;
        }
    }

    public static class Szescian {

        int boks = 0;

        public int poleszescianu(int boks) {
            int pole = (int) (6 * pow(boks, 2));
            return pole;
        }

        public int objetoscszescianu(int boks) {
            int objetosc = (int) pow(boks, 3);
            return objetosc;
        }

        public void pokazDanesz() {
            System.out.println("---------------------");
            System.out.println("Szescian");
            System.out.println("Bok: " + this.boks);
            System.out.println("Pole: " + this.poleszescianu(boks));
            System.out.println("Objetosc: " + this.objetoscszescianu(boks));
            System.out.println("---------------------");

        }

        public Szescian(int boks) {
            this.boks = boks;
        }
    }

    public static class Prostopadloscian {

        int bokp1 = 0;
        int bokp2 = 0;
        int bokp3 = 0;

        public int poleprostopadloscianu(int bokpr1, int bokpr2, int bokpr3) {
            int pole = 2 * (bokp1 * bokp2 + bokp1 * bokp3 + bokp2 * bokp3);
            return pole;
        }

        public int objetosprostopadloscianu(int bokpr1, int bokpr2, int bokpr3) {
            int objetosc = bokp1 * bokp2 * bokp3;
            return objetosc;
        }

        public void pokazDanepro() {
            System.out.println("---------------------");
            System.out.println("Prostopadloscian");
            System.out.println("1 bok: " + this.bokp1);
            System.out.println("2 bok: " + this.bokp2);
            System.out.println("3 bok: " + this.bokp3);
            System.out.println("Pole: " + this.poleprostopadloscianu(bokp1, bokp2, bokp3));
            System.out.println("Objetosc: " + this.objetosprostopadloscianu(bokp1, bokp2, bokp3));
            System.out.println("---------------------");

        }

        public Prostopadloscian(int bokp1, int bokp2, int bokp3) {
            this.bokp1 = bokp1;
            this.bokp2 = bokp2;
            this.bokp3 = bokp3;
        }
    }

    public static class Kula {

        int promienk = 0;

        public float polekuli(int promienk) {
            float pole = (float) (4 * Math.PI * pow(promienk, 2));
            return pole;
        }

        public float objetosckuli(int promienk) {
            float objetosc = (float) (4 * Math.PI * pow(promienk, 3) / 3);
            return objetosc;
        }

        public void pokazDaneku() {
            System.out.println("---------------------");
            System.out.println("Kula");
            System.out.println("Promien: " + this.promienk);
            System.out.println("Pole: " + this.polekuli(promienk));
            System.out.println("Objetosc: " + this.objetosckuli(promienk));
            System.out.println("---------------------");

        }

        public Kula(int promienk) {
            this.promienk = promienk;
        }
    }

    public static class Stozek {

        int promiens = 0;
        int tworzacas = 0;
        int wysokoscs = 0;

        public float polestozka(int promiens, int tworzacas) {
            float pole = (float) (Math.PI * pow(promiens, 2) + Math.PI * promiens * tworzacas);
            return pole;
        }

        public float objetoscstozka(int wysokoscs, int promiens) {
            float objetosc = (float) (Math.PI * pow(promiens, 2) * wysokoscs / 3);
            return objetosc;
        }

        public void pokazDanest() {
            System.out.println("---------------------");
            System.out.println("Stozek");
            System.out.println("Promien: " + this.promiens);
            System.out.println("Tworzaca: " + this.tworzacas);
            System.out.println("Wysokosc: " + this.wysokoscs);
            System.out.println("Pole: " + this.polestozka(promiens, tworzacas));
            System.out.println("Objetosc: " + this.objetoscstozka(wysokoscs, promiens));
            System.out.println("---------------------");

        }

        public Stozek(int promiens, int tworzacas, int wysokoscs) {
            this.promiens = promiens;
            this.tworzacas = tworzacas;
            this.wysokoscs = wysokoscs;
        }
    }

}
