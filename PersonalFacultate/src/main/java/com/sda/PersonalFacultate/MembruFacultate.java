package com.sda.PersonalFacultate;

public class MembruFacultate extends Angajat {
    private int nrOreBirou;
    private String rang;

    public MembruFacultate( String birou, double salary, MyDate dataAngajarii, int nrOreBirou, String rang ) {
        super(birou, salary, dataAngajarii);
        this.nrOreBirou = nrOreBirou;
        this.rang = rang;
    }

    public MembruFacultate( String nume, String adresa, String nrTel, String email, String birou, double salary,MyDate dataAngajarii,
                            int nrOreBirou, String rang ) {
        super(nume, adresa, nrTel, email, birou, salary, dataAngajarii);
        this.nrOreBirou = nrOreBirou;
        this.rang = rang;
    }

    public int getNrOreBirou() {
        return nrOreBirou;
    }

    public void setNrOreBirou( int nrOreBirou ) {
        this.nrOreBirou = nrOreBirou;
    }

    public String getRang() {
        return rang;
    }

    public void setRang( String rang ) {
        this.rang = rang;
    }

    @Override
    public String toString() {
       return "Membrul facultaii cu numele" + getNume() + ", adresa " + getAdresa() + ", nr telefom " + getNrTel() +
                " si email  " + getEmail() + " are " + getNrOreBirou() + " ore, si este " + getRang() +
                " si face parte din clasa MembruFacultate";
    }
}
