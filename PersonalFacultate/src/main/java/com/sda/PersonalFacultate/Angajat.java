package com.sda.PersonalFacultate;

public class Angajat extends Persoana {
    private String birou;
    private double salary;
    private MyDate dataAngajarii;

    public Angajat( String birou, double salary, MyDate dataAngajarii ) {
        this.birou = birou;
        this.salary = salary;
        this.dataAngajarii = dataAngajarii;
    }

    public Angajat( String nume, String adresa, String nrTel, String email, String birou, double salary, MyDate dataAngajarii ) {
        super(nume, adresa, nrTel, email);
        this.birou = birou;
        this.salary = salary;
        this.dataAngajarii = dataAngajarii;
    }

    public Angajat() {
    }

    public String getBirou() {
        return birou;
    }

    public void setBirou( String birou ) {
        this.birou = birou;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary( double salary ) {
        this.salary = salary;
    }

    public MyDate getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii( MyDate dataAngajarii ) {
        this.dataAngajarii = dataAngajarii;
    }

    @Override
    public String toString() {
        return "Angajatul cu numele " + getNume()+ ", adresa "+ getAdresa() +
        ", nr telefom " + getNrTel() + " si email " + getEmail() +
                " are salariul " + getSalary() + " la Dep. " + getBirou() + " angajat la data " +
                getDataAngajarii() +
                " face parte din clasa Angajat";
    }
}
