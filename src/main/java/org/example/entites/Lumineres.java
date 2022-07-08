package org.example.entites;

public class Lumineres {

    private int intensite = 20;

    public int getIntensite() {
        return intensite;
    }

    public void setIntensite(int intensite) {
        this.intensite = intensite;
    }

    public Lumineres() {
    }

    public void marche () {
        System.out.println("Le luminère est en marche");
    }

    public void arret () {
        System.out.println("Le luminère est à l'arret");
    }

    public void attenuer (int intensite) {
        this.intensite = intensite;
    }

}
