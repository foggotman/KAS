package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Konference {
    private String navn;
    private String adresse;
    private LocalDate startDato;
    private LocalDate slutDato;
    private ArrayList<Tilmelding> tilmeldinger;
    private ArrayList<Udflugt> udflugter;

    public Konference(String navn, String adresse, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.adresse = adresse;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public Tilmelding createTilmelding(LocalDate ankomstDato, LocalDate afrejseDato, boolean foredagsholder, Deltager deltager){
        Tilmelding tilmelding = new Tilmelding(ankomstDato, afrejseDato, foredagsholder, deltager);
        tilmeldinger.add(tilmelding);
        return tilmelding;
    }
    public void addTilmelding(Tilmelding tilmelding){
        tilmeldinger.add(tilmelding);
    }
    public void addUdflugt(Udflugt udflugt){
        udflugter.add(udflugt);
    }


}
