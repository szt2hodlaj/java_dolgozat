public class Noveny {
    String nev;
    int vizigeny;
    int vizmennyiseg;

    public Noveny(String nev, int vizigeny) {
        this.nev = nev;
        this.vizigeny = vizigeny;
        this.vizmennyiseg = 0;
    }

    boolean szuksegesViz() {
        return vizmennyiseg < vizigeny;
    }

    void ontoz(int vizmennyiseg) {
        this.vizmennyiseg += this instanceof Virag ? vizmennyiseg * 0.75 : vizmennyiseg * 0.4;
    }
}
