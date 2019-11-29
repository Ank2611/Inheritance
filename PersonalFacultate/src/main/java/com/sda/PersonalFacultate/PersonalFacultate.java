package com.sda.PersonalFacultate;

public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate( String birou, double salary, MyDate dataAngajarii, String titlu ) {
        super(birou, salary, dataAngajarii);
        this.titlu = titlu;
    }

    public PersonalFacultate( String nume, String adresa, String nrTel, String email, String birou, double salary, MyDate dataAngajarii, String titlu ) {
        super(nume, adresa, nrTel, email, birou, salary, dataAngajarii);
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return getNume()  + ", adresa " + getAdresa() + ", nr telefom " + getNrTel() +
                " si email  " + getEmail() + " are salariul " + getSalary() + " la Dep. " + getBirou() +
                " angajat la data " + getDataAngajarii() + " are titlul de " + this.titlu +
                " si face parte din clasa PersoanaFacultate";
    }
}
