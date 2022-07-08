package org.example.entites;

public class Projecteur {

    LecteurDvd lecteurDvd;

    public Projecteur() {
    }

    public Projecteur(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    public void marche() {
        System.out.println("Le projecteur est en marche");
    }

    public void arret() {
        System.out.println("Le projecteur est arreté");
    }

    public void modeTv() {
        System.out.println("Le projecteur est mode Tv");
    }

    public void modeGrandEcran() {
        System.out.println("Le projecteur est mode pleine écran");
    }
}
