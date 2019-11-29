package com.sda.PersonalFacultate;

public class Student extends Persoana {
    Statut st;

    public Student( Statut st ) {
        this.st = st;
    }

    public Student( String nume, String adresa, String nrTel, String email, Statut st ) {
        super(nume, adresa, nrTel, email);
        this.st = st;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Studenta cu numele " + getNume() + ", adresa " + getAdresa() + ", nr telefom " + getNrTel() +
                " si email  " + getEmail() + " are statutl de " + st +
                " si face parte din clasa Student";
    }
}
