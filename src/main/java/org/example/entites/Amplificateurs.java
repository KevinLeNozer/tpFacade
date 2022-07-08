package org.example.entites;


public class Amplificateurs {

    Tuner tuner;
    LecteurDvd dvd;
    LecteurCd cd;

    private Boolean sonStereo;
    private Boolean sonSurround;
    private int volume;

    public Amplificateurs() {
        sonStereo = true;
        sonSurround = false;
    }

    public Amplificateurs(Tuner tuner, LecteurDvd dvd, LecteurCd cd, Boolean sonStereo, Boolean sonSurround, int volume) {
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.sonStereo = sonStereo;
        this.sonSurround = sonSurround;
        this.volume = volume;
    }

    public void marche() {
        System.out.println("L'amplificateur est en marche");
    }

    public void arret() {
        System.out.println("L'amplificateur est arreté");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public LecteurDvd getDvd() {
        return dvd;
    }

    public void setDvd(LecteurDvd dvd) {
        this.dvd = dvd;
    }

    public LecteurCd getCd() {
        return cd;
    }

    public void setCd(LecteurCd cd) {
        this.cd = cd;
    }

    public Boolean getSonStereo() {
        return sonStereo;
    }

    public void setSonStereo() {
        if (sonSurround == true) {
            this.sonSurround = false;
        }
        this.sonStereo = true;
    }

    public Boolean getSonSurround() {
        return sonSurround;
    }

    public void setSonSurround() {
        if (sonStereo == true) {
            this.sonStereo = false;
        }
        sonSurround = true;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
