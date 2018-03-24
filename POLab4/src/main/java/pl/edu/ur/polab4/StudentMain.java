package pl.edu.ur.polab4;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        String[] imie = new String[100];
        String[] nazwisko = new String[100];
        int[] nr_indeksu = new int[100];
        String[] nazwa_specjalnosci = new String[100];
        int[] rok_studiow = new int[100];
        Student st = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        Scanner pyt = new Scanner(System.in);
        Scanner pyt2 = new Scanner(System.in);
        String v="  ";
        do{
            System.out.println("Czy chcesz wyzerowac wszystkie wartosci liczbowe i wstawic puste pola w zamiast tekstu?");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                st.puste();
            }
            System.out.println("Czy chcesz uzupelnic dane wybranego studenta?");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego studenta?");
                int x = pyt2.nextInt();
                st.wybrany(x);
                System.out.println("Ktoregos jeszcze?");
                v = pyt.nextLine();
                }while (v.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz usunac dane ktoregos studenta?");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego studenta?");
                int x = pyt2.nextInt();
                st.usuniecie(x);
                System.out.println("Ktoregos jeszcze?");
                v = pyt.nextLine();
                }while (v.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz wyswietlic dane wybranego studenta?");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego studenta?");
                int x = pyt2.nextInt();
                st.daneWybrany(x);
                System.out.println("Ktoregos jeszcze?");
                v = pyt.nextLine();
                }while (v.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz wyswietlic dane wszystkich studentow?");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                st.dane();
            }
            System.out.println("Czy chcesz wyswietlic dane studentow z danego przedzialu (max od 1 do 100)");
            v = pyt.nextLine();
            if (v.equalsIgnoreCase("tak")) {
                System.out.println("Od ktorego");
                int x = pyt2.nextInt();
                System.out.println("Do ktorego?");
                int y = pyt2.nextInt();
                for (; x <= y; x++) {
                    st.daneWybrany(x);
                }
            }
        System.out.println("Czy chcesz powtorzyc caly proces?");
        v = pyt.nextLine()  ; 
        }while(v.equalsIgnoreCase("tak"));
    }
}
