package pl.edu.ur.polab4;

import java.util.Scanner;

public class Student {

    public String[] imie = new String[100];
    public String[] nazwisko = new String[100];
    public int[] nr_indeksu = new int[100];
    public String[] nazwa_specjalnosci = new String[100];
    public int[] rok_studiow = new int[100];

    public Student(String[] imie,String[] nazwisko,int[] nr_indeksu,String[] nazwa_specjalnosci,int[] rok_studiow)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
        this.nazwa_specjalnosci=nazwa_specjalnosci;
        this.rok_studiow=rok_studiow;
        
    }
    public void puste() {
        for (int i = 0; i < 100; i++) {
            imie[i] = "";
            nazwisko[i] = "";
            nr_indeksu[i] = 0;
            nazwa_specjalnosci[i] = "";
            rok_studiow[i] = 0;
        }
    }

    public void wybrany(int i) {
        Scanner t = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie[i-1] = t.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko[i-1] = t.nextLine();
        System.out.println("Podaj nr indeksu: ");
        nr_indeksu[i-1] = l.nextInt();
        System.out.println("Podaj nazwa specjalnosci: ");
        nazwa_specjalnosci[i-1] = t.nextLine();
        System.out.println("Podaj rok studiow: ");
        rok_studiow[i-1] = l.nextInt();
    }

    public void usuniecie(int i) {
        imie[i-1] = "";
        nazwisko[i-1] = "";
        nr_indeksu[i-1] = 0;
        nazwa_specjalnosci[i-1] = "";
        rok_studiow[i-1] = 0;
    }

    public void daneWybrany(int i) {
        System.out.println("---------------------");
        System.out.println("Imie " + i + " studenta: " + imie[i-1]);
        System.out.println("Nazwisko " + i + " studenta: " + nazwisko[i-1]);
        System.out.println("Nr idneksu " + i + " studenta: " + nr_indeksu[i-1]);
        System.out.println("Nazwa specjalnosci " + i + " studenta: " + nazwa_specjalnosci[i-1]);
        System.out.println("Rok studiow " + i + " studenta: " + rok_studiow[i-1]);
        System.out.println("---------------------");
    }

    public void dane() {
        for (int i = 0; i < 100; i++) {
            System.out.println("---------------------");
            System.out.println("Imie " + (i+1) + " studenta: " + imie[i]);
            System.out.println("Nazwisko " + (i+1) + " studenta: " + nazwisko[i]);
            System.out.println("Nr idneksu " + (i+1) + " studenta: " + nr_indeksu[i]);
            System.out.println("Nazwa specjalnosci " + (i+1) + " studenta: " + nazwa_specjalnosci[i]);
            System.out.println("Rok studiow " + (i+1) + " studenta: " + rok_studiow[i]);
            System.out.println("---------------------");

        }

    }
}
