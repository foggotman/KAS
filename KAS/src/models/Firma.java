package models;

import java.util.ArrayList;

public class Firma {
    private String navn;
    private String firmaTelefonNummer;
    private ArrayList<Deltager> deltagere;

    public Firma(String navn, String firmaTelefonNummer) {
        this.navn = navn;
        this.firmaTelefonNummer = firmaTelefonNummer;
    }

    public void addDeltager(Deltager deltager){
        deltagere.add(deltager);
    }

}
