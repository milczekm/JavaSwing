package matematyka;

public class Kolo {

    private Punkt srodek;
    private double promien;

    public Kolo(Punkt srodek, double promien) {
        this.srodek = new Punkt(srodek);
        this.promien = promien;
    }

    public Punkt getSrodek() {
        return new Punkt(srodek);
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public void setSrodek(Punkt srodek) {
        this.srodek = new Punkt(srodek);
    }

    public boolean zawiera(Punkt p) {
        double odleglosc = srodek.odleglosc(p);
        return odleglosc <= promien;
    }

    public Kolo(Kolo k) {

        this.srodek = new Punkt(k.srodek);
        this.promien = k.promien;
    }

    public boolean rowne(Kolo k) {
        return (this.srodek.rowny(k.srodek) && (this.promien == k.promien));
    }

    public Kolo kopia() {
        return new Kolo(this);
    }

    public Punkt srodek() {
        return srodek.kopia();
    }
}
