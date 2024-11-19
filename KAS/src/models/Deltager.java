package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deltager {
    private String adresse;
    private String telefonNummer;
    private Ledsager ledsager;
    private Firma firma;
    private ArrayList<Ledsager> ledsagere = new ArrayList<>();

    public Deltager(String adresse, String telefonNummer) {
        this.adresse = adresse;
        this.telefonNummer = telefonNummer;
    }

    public ArrayList<Ledsager> getLedsagere() {
        return ledsagere;
    }

    public Ledsager createLedsager(String navn) {
        Ledsager ledsager = new Ledsager(navn);
        ledsager.addDeltager(this);
        return ledsager;

    }

    @Override
    public String toString() {
        return "Deltager{" +
                "adresse='" + adresse + '\'' +
                ", telefonNummer='" + telefonNummer + '\'' +
                ", ledsager=" + ledsager +
                ", firma=" + firma +
                ", ledsagere=" + ledsagere +
                '}';
    }
}
