import java.util.Arrays;

public class Main {

    static void ontzes(Noveny[] kert, int vizmennyiseg) {
        Noveny[] szuksegesNovenyek = new Noveny[0];

        for (Noveny noveny : kert) {
            if (noveny.szuksegesViz()) {
                szuksegesNovenyek = Arrays.copyOf(szuksegesNovenyek, szuksegesNovenyek.length + 1);
                szuksegesNovenyek[szuksegesNovenyek.length - 1] = noveny;
            }
        }

        int oszto = szuksegesNovenyek.length > 0 ? szuksegesNovenyek.length : 1;

        for (Noveny noveny : kert) {
            noveny.ontoz(vizmennyiseg / oszto);
        }

        for (Noveny noveny : szuksegesNovenyek) {
            System.out.println(noveny.nev + "nak vízre van szüksége");
        }
    }

    public static void main(String[] args) {
        Noveny[] kert = {
                new Virag("Sárga virág", 5),
                new Virag("Kék virág", 5),
                new Fa("Lonc fa", 10),
                new Fa("Narancs fa", 10)
        };

        ontzes(kert, 40);

        ontzes(kert, 70);
    }
}

