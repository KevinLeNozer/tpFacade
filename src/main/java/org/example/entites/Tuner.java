package org.example.entites;

public class Tuner {
    Amplificateurs amplificateurs;

    private double am;
    private double fm;
    private double frequence;

    public void marche() {
        System.out.println("Le tuner est marche");
    }

    public void arret() {
        System.out.println("Le tuner est arreté");
    }

    public double getAm() {
        return am;
    }

    public void setAm(double am) {
        this.am = am;
    }

    public double getFm() {
        return fm;
    }

    public void setFm(double fm) {
        this.fm = fm;
    }

    public double getFrequence() {
        return frequence;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }
}
