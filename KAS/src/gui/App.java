package gui;

import models.Deltager;
import models.Konference;
import models.Tilmelding;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Konference konference1 = new Konference("TedTalk", "Åparken 57", LocalDate.now(), LocalDate.now());
        Deltager deltager1 = new Deltager("Åparken 54", "42520089");

        konference1.createTilmelding(LocalDate.EPOCH, LocalDate.now(), true, deltager1);

        deltager1.createLedsager("John");

        System.out.println(deltager1.getLedsagere());
    }
}
