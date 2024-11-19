package models;

import java.time.LocalDate;

public class Tilmelding {
    private LocalDate ankomstDato;
    private LocalDate afrejseDato;
    private boolean foredragsholder;
    private Deltager deltager;
    private Hotel hotel;
    private Konference konference;

    public Tilmelding(LocalDate ankomstDato, LocalDate afrejseDato, boolean foredragsholder, Deltager deltager) {
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.foredragsholder = foredragsholder;
        this.deltager = deltager;
    }
}
