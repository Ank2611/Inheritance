package com.sda.PersonalFacultate;

public class Persoana {
    private String nume;
    private String adresa;
    private String nrTel;
    private String email;

    public Persoana() {
    }

    public Persoana( String nume, String adresa, String nrTel, String email ) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTel = nrTel;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume( String nume ) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa( String adresa ) {
        this.adresa = adresa;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel( String nrTel ) {
        this.nrTel = nrTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "Persoana cu numele " + getNume() + ", adresa "+ getAdresa() +
                ", nr telefom " + getNrTel() + " si email " + getEmail() +
                " face parte din clasa Persoana";
    }
}
