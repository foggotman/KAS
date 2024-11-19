package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Udflugt {
    private String navn;
    private String adresse;
    private LocalDate dato;
    private int pris;
    private ArrayList<Ledsager> ledsagerListe;

    public Udflugt(int pris, LocalDate dato, String adresse, String navn) {
        this.pris = pris;
        this.dato = dato;
        this.adresse = adresse;
        this.navn = navn;
    }

}
