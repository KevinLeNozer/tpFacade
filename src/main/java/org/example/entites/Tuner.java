package org.example.entites;

public class Tuner {
    Amplificateurs amplificateurs;

    private Boolean am;
    private Boolean fm;
    private double frequence;

    public Tuner() {
        am = false;
        fm = true;
    }

    public Tuner(Amplificateurs amplificateurs, Boolean am, Boolean fm, double frequence) {
        this.amplificateurs = amplificateurs;
        this.am = am;
        this.fm = fm;
        this.frequence = frequence;
    }

    public void marche() {
        System.out.println("Le tuner est marche");
    }

    public void arret() {
        System.out.println("Le tuner est arreté");
    }

    public Boolean getAm() {
        return am;
    }

    public void setAm() {
        if (fm == true) {
            this.fm = false;
        }
        this.am = true;
    }

    public Boolean getFm() {
        return fm;
    }

    public void setFm() {
        if (am == true) {
            this.am = false;
        }
        this.fm = true;
    }

    public double getFrequence() {
        return frequence;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }
}
