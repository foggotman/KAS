package models;

import java.util.ArrayList;

public class Ledsager extends Person {
    private ArrayList<Udflugt> udflugter;
    private Deltager deltager;

    public Ledsager(String navn) {
        super(navn);
    }

    public void addUdflugt(Udflugt udflugt){
        udflugter.add(udflugt);
    }


}
