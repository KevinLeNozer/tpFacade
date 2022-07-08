package org.example.facade;

import org.example.entites.*;

public class FacadeHomeCinema {

    MachinePopCorn machineAPopCorn = new  MachinePopCorn();
    Lumineres lumieres = new Lumineres();
    Ecran ecran = new Ecran();
    LecteurDvd dvd = new LecteurDvd();
    LecteurCd lecteurCd = new LecteurCd();
    Projecteur projecteur = new Projecteur();
    Tuner tuner = new Tuner();
    Amplificateurs amp = new Amplificateurs();

    public void regarderFilm() {
        machineAPopCorn.marche();
        machineAPopCorn.eclater();
        lumieres.attenuer(10);
        ecran.baisser();
        projecteur.marche();
        projecteur.modeGrandEcran();
        amp.marche();
        amp.setDvd(dvd);
        amp.setSonSurround();
        amp.setVolume(5);
        dvd.marche();
        dvd.jouer("Avengers");

    }

    public void arreterFilm() {
        dvd.stop();
        dvd.ejecter();
        dvd.arret();
        ecran.baisser();
        amp.setVolume(0);
        amp.arret();
        projecteur.arret();
        machineAPopCorn.arret();
        lumieres.arret();
    }

    public void ecouterCd() {
        lecteurCd.marche();
        lecteurCd.jouer();
    }

    public void arreterCd() {
        lecteurCd.arret();
        lecteurCd.stop();
    }

    public void ecouterRadio() {
        tuner.marche();
        tuner.setFm();
    }

    public void arreterRadio() {
        tuner.arret();
    }
}
