package models;

import java.util.ArrayList;

public class Hotel {
    private String navn;
    private String adresse;
    private int pris;
    private int badTillæg;
    private int wifiTillæg;
    private int morgenmadTillæg;
    private ArrayList<Tilmelding> tilmeldinger;

    public Hotel(String navn, String adresse, int pris, int badTillæg, int wifiTillæg, int morgenmadTillæg) {
        this.navn = navn;
        this.adresse = adresse;
        this.pris = pris;
        this.badTillæg = badTillæg;
        this.wifiTillæg = wifiTillæg;
        this.morgenmadTillæg = morgenmadTillæg;
    }
}
